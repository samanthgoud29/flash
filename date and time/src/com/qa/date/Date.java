package com.qa.date;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.annotations.VisibleForTesting;

public class Date {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		
		/*driver.get("https://www.mercurytravels.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='holiday_category_id']")).sendKeys("hyderabad");
	Thread.sleep(3000);
	
		driver.findElement(By.xpath("(//a[@tabindex='-1'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("dphh1")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('dphh1').removeAttribute('readonly',0);");
		driver.findElement(By.xpath("(//input[@data-date-format='dd/mm/yyyy'])[10]")).sendKeys("15-08-2022");
		WebDriverWait hold=new WebDriverWait(driver, Duration.ofSeconds(10));
		hold.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@data-date-format='dd/mm/yyyy'])[10]")));
		
		Thread.sleep(3000);
		Select durationlistbox=new Select(driver.findElement(By.id("duration_d")));
		durationlistbox.selectByValue("3Nights / 4Days");
		
			Select typeofholiday=new Select(driver.findElement(By.xpath("(//select[@class='form-control'])[29]")));
			typeofholiday.selectByIndex(7);*\
			
		/*int day=25;
		driver.findElement(By.id("dphh1")).click();
		
	     Thread.sleep(3000);
	    
	    
		driver.findElement(By.xpath("(//div[@class='datepicker dropdown-menu'])[7]//td[text()="+day+"]")).click();*/

	WebDriver driver;
	driver.get("https://www.makemytrip.com/flights/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("(//input[@class='fsw_inputField lineHeight36 latoBlack font30'])[1]")).click();
	
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("hyderabad");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='calc60'])[1]")).click();
	driver.findElement(By.xpath("(//span[@class='lbl_input latoBold appendBottom10'])[1]")).click();
	//Thread.sleep(3000);
	//JavascriptExecutor jj=(JavascriptExecutor)driver;
	//jj.executeScript("document.getElementByxpath(//div[@class='dayPickerHeader dayToFromCont blackText']).removeAttribute('readonly',0);");
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//div[@class='DayPicker-Months']")).sendKeys("18-07-2022");
	WebDriverWait holdon=new WebDriverWait(driver, Duration.ofSeconds(30));
	holdon.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='DayPicker-Months']"))));
	}

	
	}


