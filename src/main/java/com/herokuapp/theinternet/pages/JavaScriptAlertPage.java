package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertPage extends BasePageObject{

	private By javascriptAlertButtonLocator = By.xpath("//button[text()='Click for JS Alert']");
	private By javascriptConfirmButtonLocator = By.xpath("//button[text()='Click for JS Confirm']");
	private By javascriptPromptButtonLocator = By.xpath("//button[text()='Click for JS Prompt']");
	private By javascriptResultLocator = By.id("id");
	
	public JavaScriptAlertPage(WebDriver driver, Logger log) {
		super(driver, log);
	}
	
	//--------------------------------------------------------------//
	//Method for JS Alert
	public void clickJSAlert() {
		log.info("Clicking on button for JS Alert");
		click(javascriptAlertButtonLocator);
	}	
	
	//Method for JS Confirm
	public void clickJSConfirm() {
		log.info("Clicking on button for JS Confirm");
		click(javascriptConfirmButtonLocator);
	}

	//Method for JS Prompt
	public void clickJSPrompt() {
		log.info("Clicking on button for JS Prompt");
		click(javascriptPromptButtonLocator);
	}

	//Method for Getting the text from Alert
	public String getAlertText() {
		log.info("Getting the text from the alert");
		Alert alert = switchToAlert();
		String alertText = alert.getText();
		log.info("The text from alert box is: " + alertText);
		return alertText;
	}
	
	//Method for getting the Result Text
	public String getResultText() {
		String text = find(javascriptResultLocator).getText();
		log.info("The result for JS Action is: " + text);
		return text;
	}
	
	//Method for Accepting JS Alert
	public void acceptJSAlert() {
		log.info("Accepting the JS Alert");
		Alert alert = switchToAlert();
		alert.accept();
		log.info("JS Alert is accepted");
	}

}
