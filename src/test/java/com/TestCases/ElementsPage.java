package com.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.driver.DriverManager;

public class ElementsPage extends BasePage {
	@SuppressWarnings("deprecation")
	@Test(groups = { "Regression", "ElementsPage" })
public void ElementsPage() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DriverManager.getDriver().findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).click();
		DriverManager.getDriver().get("https://demoqa.com/elements");
		DriverManager.getDriver().findElement(By.xpath("//div[@class='header-text'][normalize-space()='Elements']")).click();
	}
	@Test(groups = { "Regression", "ElementsPage" })
	public void TextBoxField() {
	DriverManager.getDriver().get("https://demoqa.com/text-box");
	DriverManager.getDriver().findElement(By.id("userName")).sendKeys("Test1");
	DriverManager.getDriver().findElement(By.id("userEmail")).sendKeys("Test1@gmail.com");
	DriverManager.getDriver().findElement(By.id("currentAddress")).sendKeys("1621 S Wolfe Road, CA");
	DriverManager.getDriver().findElement(By.id("permanentAddress")).sendKeys("1621 S Wolfe Road, CA");
    DriverManager.getDriver().findElement(By.id("submit")).click();
	}
	@Test(groups = { "Regression", "ElementsPage" })
	public void CheckBoxField() {
	DriverManager.getDriver().get("https://demoqa.com/checkbox");
	 
	}
	}
