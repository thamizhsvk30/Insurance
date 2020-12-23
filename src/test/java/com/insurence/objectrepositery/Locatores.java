package com.insurence.objectrepositery;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.insurence.commonaction.Comaction;


public class Locatores extends Comaction {

	public Locatores(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//input[@id='quote-zip-code']")
	private WebElement zipcode;
	
	@FindBy(xpath = "//input[@id='body-btn-get-quote']")
	private WebElement startquote1;
	
	@FindBy(xpath = "//label[@id='currentTrvCustomerNo']")
	private WebElement ratio;
	
	@FindBy(xpath = "//label[@id='currentTrvCustomerNo']")
	private WebElement Quotecontinue;
	
	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement fname;
	
	@FindBy(xpath = "//input[@id='middleInitial']")
	private WebElement midname;
	
	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement lname;
	
	@FindBy(xpath = "//select[@id='streetAddrCity']")
	private WebElement strcity;
	
	@FindBy(xpath = "//input[@id='streetAddr1']")
	private WebElement streetaddr;
	
	@FindBy(xpath = "//label[@id='radMailingYesLabel']")
	private WebElement mailaddr;
	
	@FindBy(xpath = "//label[@id='radMovedNoLabel']")
	private WebElement move;
	
	@FindBy(xpath = "//label[@id='genderMale']")
	private WebElement selgender;
	
	@FindBy(xpath = "//input[@id='dobMonth']")
	private WebElement bmonth;
	
	@FindBy(xpath = "//input[@id='dobDay']")
	private WebElement bdate;
	
	@FindBy(xpath = "//input[@id='dobYear']")
	private WebElement byear;
	
	@FindBy(xpath = "//button[@id='continue']")
	private WebElement continu;
	


	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getStartquote1() {
		return startquote1;
	}
	public WebElement getratio() {
		return ratio;
	}

	public WebElement getQuotecontinue() {
		return Quotecontinue;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getMidname() {
		return midname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getstrcity() {
		return strcity;
	}
	public WebElement getStreetaddr() {
		return streetaddr;
	}
	public WebElement getMailaddr() {
		return mailaddr;
	}
	public WebElement getMove() {
		return move;
	}
	public WebElement getSelgender() {
		return selgender;
	}
	public WebElement getBmonth() {
		return bmonth;
	}
	public WebElement getBdate() {
		return bdate;
	}
	public WebElement getByear() {
		return byear;
	}
	public WebElement getContinu() {
		return continu;
	}
}
