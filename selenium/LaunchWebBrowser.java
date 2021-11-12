package week2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchWebBrowser {

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
		 
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("nimcy");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("deepika");
		 driver.findElement(By.name("submitButton")).click();
		 
		 String title=driver.getTitle();
		 System.out.println(title);
		 String text=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 System.out.println("Company Name"+text);
		 String text1=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		 System.out.println("First name"+text1);
		 String text2=driver.findElement(By.id("viewLead_lastName_sp")).getText();
		 System.out.println("Last name"+text2);
		
		 //driver.close();
	}
	

}
