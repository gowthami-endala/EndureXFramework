package com.TestCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.driver.*;

public class FormsPage extends BasePage{
	
	@Test
	public void FormsPage() {
		DriverManager.getDriver().get("https://demoqa.com/automation-practice-form");
		DriverManager.getDriver().findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
		Assert.assertEquals("Student Registration Form",DriverManager.getDriver().findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/h5[1]")).getText()) ;

	}

}
