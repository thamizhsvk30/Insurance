package com.insurence.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.insurence.commonaction.Comaction;
import com.insurence.objectrepositery.Locatores;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination extends Comaction{
	
		Comaction ca = new Comaction();
		Locatores lo = new Locatores();
		
		String Auto;
		//String "CAPE SAN BLAS";
		
	
		@Given("start the quote using insurance type with zip code")
		public void start_the_quote_using_insurance_type_with_zip_code() throws Throwable {
			
			WebElement down = driver.findElement(By.xpath("//div[contains(text(),'Coronavirus Update')]"));
			
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].ScrolIntoView(true)",down);
			
			pagewait();
			
			WebElement element = driver.findElement(By.id("//div[@id='trans-fake-get-quote']"));
			ca.selectByText(element, Auto);
			lo.getZipcode().sendKeys("32456");
			lo.getStartquote1().click();
			
		}

		@Given("check ration button enable or not")
		public void check_ration_button_enable_or_not() throws Throwable {
			
			pagewait();
			
			if (lo.getratio().isSelected()) {
				lo.getQuotecontinue().click();
			}else {
				lo.getratio().click();
			}
			}

		@When("Fill the all those detail about yourself")
		public void fill_the_all_those_detail_about_yourself() throws Throwable {
			
			pagewait();
			
			lo.getFname().sendKeys("tamil");
			lo.getMidname().sendKeys("arasan");
			lo.getLname().sendKeys("v");
			lo.getStreetaddr().sendKeys("North Street");
			ca.selectByText(lo.getstrcity(),"CAPE SAN BLAS");
			if (lo.getMailaddr().isSelected()) {
				
			}if (lo.getMove().isSelected()) {
				
			}if (lo.getSelgender().isSelected()) {
				System.out.println("success");
			}
			
			lo.getBmonth().sendKeys("12");
			lo.getBdate().sendKeys("04");
			lo.getByear().sendKeys("1990");
			}

		@Then("finish and click the start the quote button")
		public void finish_and_click_the_start_the_quote_button() throws Throwable {
			
			ca.jsScrollPagedowntoEnd();
			pagewait();
			lo.getContinu().click();
			
		}

}
