package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		//first & last name automation
		
		driver.findElement(By.id("fname")).sendKeys("Mahmudur");
		Thread.sleep(2000);
		driver.findElement(By.id("lname")).sendKeys("Rahman");
		Thread.sleep(2000);
		
		
		//Gender selection
		
		
		WebElement genderSelection = driver.findElement(By.id("male"));
		System.out.println(genderSelection.isSelected());
		genderSelection.click();
		Thread.sleep(2000);
		
		//drop_down option selection
		WebElement optionSelection = driver.findElement(By.id("option"));
		Select dropDown = new Select(optionSelection);
		dropDown.selectByValue("option 2");
		Thread.sleep(2000);
		
		
		//scroll down option selection
		WebElement scrollSelection = driver.findElement(By.id("owc"));
		Select scrollDown = new Select(scrollSelection);
		scrollDown.selectByValue("option 3");
		Thread.sleep(2000);
		
		//checklist
		
		WebElement checkList1 = driver.findElement(By.name("option1"));
		checkList1.click();
		Thread.sleep(2000);
		WebElement checkList2 = driver.findElement(By.name("option2"));
		checkList2.click();
		Thread.sleep(2000);
		WebElement checkList3 = driver.findElement(By.name("option3"));
		checkList3.click();
		
		Thread.sleep(2000);
		
		//long message
		
		  
	    WebElement messageBox = driver.findElement(By.name("message"));
	    messageBox.clear();
      messageBox.sendKeys
            ("I am Mahmudur Rahman."
      		+ "I have a keen interest in ensuring the delivery of high-quality software products by leveraging"
      		+ " testing methodologies, automation tools, and continuous improvement practices."
      		+ " My educational background has equipped me with a strong analytical mindset and attention to detail,"
      		+ " essential qualities for effective SQA.");
	  
      Thread.sleep(2000);
      
      //submit button
      
      WebElement submitButton = driver.findElement(By.className("btn-success"));
      submitButton.click();
		
	}
}

