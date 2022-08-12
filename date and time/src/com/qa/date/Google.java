package com.qa.date;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.annotations.VisibleForTesting;

public class Google {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.google.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("gmail",Keys.ENTER);
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		driver.findElement(By.xpath("//a[@data-action='sign in']")).click();
		
		TakesScreenshot jj=(TakesScreenshot)driver;
		File j=jj.getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(j, new File("D:\\selenium\\screenshots\\3.jpg"));
		
		
	}

}
