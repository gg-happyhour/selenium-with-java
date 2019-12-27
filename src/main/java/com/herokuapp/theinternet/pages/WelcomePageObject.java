package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePageObject extends BasePageObject {

	private String pageUrl = "https://the-internet.herokuapp.com/";
	
	private By formAuthenticationLinkLocator = By.linkText("Form Authentication");
	
	private By dyanmicLoadingLinkLocator = By.xpath("//a[@href='/dynamic_loading']");
	
	//Setting Constructor for the POM Class
	public WelcomePageObject(WebDriver driver, Logger log) {
		super(driver, log);
	}
	
	//Opening the URL method
	public void OpenPage() {
		
		log.info("Opening page: " + pageUrl);		//Opening The Internet Heroku Page
		openUrl(pageUrl);							//Commanding the browser to open the URL
		log.info("Page successfully opened.");
		
	}
	
	//Clicking on the Form Authentication Link
	public LoginPage clickAuthenticationFormLink() {
		
		log.info("Clicking on Form Authentication Link");
		click(formAuthenticationLinkLocator);	
		return new LoginPage(driver, log);
	}
	
	//Click on the Dynamic Loading Link
	public DynamicLoadingPage clickDynamicLoadingLink() {
		
		log.info("Clicking on Dynamic Loading Link");
		click(dyanmicLoadingLinkLocator);
		return new DynamicLoadingPage(driver, log);
	}

}
