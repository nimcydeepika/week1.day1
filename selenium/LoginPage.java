package week2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");

		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("abcd");
		driver.findElement(By.id("lastNameField")).sendKeys("efghi");
		driver.findElement(By.name("submitButton")).click();
		
		String title=driver.getTitle();
		System.out.println("The Title is"+title);
		String text=driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println("First name"+text);
		
		//driver.close();
		
		
		
		
		
	}

}
