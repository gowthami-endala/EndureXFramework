package com.TestCases;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;
import org.assertj.core.api.Assertions;
import org.junit.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.assertj.core.api.Assertions;
import com.driver.DriverManager;
import com.driver.RetryAnalyzer;


public class FormsPage extends BasePage{
	
    @Test(retryAnalyzer = RetryAnalyzer.class)

	public void FormsPage() {
		DriverManager.getDriver().get("https://demoqa.com/automation-practice-form");
		DriverManager.getDriver().findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
		Assert.assertEquals("Student Registration Form",DriverManager.getDriver().findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/h5[1]")).getText()) ;
		String title = DriverManager.getDriver().getTitle();
		String ExpectedTitle = "DEMOQA";
		Assert.assertEquals(title,"DEMOQA");

	
	}

}
