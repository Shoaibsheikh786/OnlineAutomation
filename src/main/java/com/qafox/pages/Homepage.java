package com.qafox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	
public	Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	// WebElement 
	@FindBy(xpath="//a[text()='Youtube' and @role='menuitem']")
	WebElement youtube;
	 
	//@fkkdkkdk linked 
	
	//cclickon linked in ()

	
	//WebElemtn ele= driver.findElementBy(xpath)
	
	
	//2. 
	
	//about xpath 
	@FindBy(xpath="//li[@id='menu-item-479']//a[normalize-space()='About Us']")
	WebElement aboutUs;
	public void clickOnAboutUs()
	{
		aboutUs.click();
	}
	
	public void clickOnYoutube()
	{
		youtube.click();
	}

}
