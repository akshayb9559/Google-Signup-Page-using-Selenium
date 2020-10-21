package demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUP {

	WebDriver wd;
	String url="https://accounts.google.com/signup";
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Certification Data\\Selenium\\Driver\\chromedriver.exe");
		wd=new ChromeDriver();
		wd.get(url);
	}

	@Test
	public void test() {
		wd.findElement(By.id("firstName")).sendKeys("Akshay");
		wd.findElement(By.id("lastName")).sendKeys("Bramhane");
		
//		wd.findElement(By.id("username")).sendKeys("ab12345");
//		wd.findElement(By.id("username")).clear();
//		String nameText = wd.findElement(By.id("username")).getAttribute("data-username");
//		wd.findElement(By.id("username")).sendKeys(nameText);
//		System.out.println(nameText);
		
		WebElement firstname=wd.findElement(By.id("username")); 
		firstname.sendKeys("akshayb95123456");
//		firstname.clear();
//		String name=firstname.getAttribute("data-username"); 
//		System.out.println("First Name : "+name);
		
		

		wd.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("Akshay@b98765");
		
		wd.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("Akshay@b98765");
//		if(wd.findElement(By.xpath("//*[@id=\\\"view_container\\\"]/form/div[2]/div/div[1]/div[2]/div[3]/div")).getText()=="Available"){
//			wd.findElement(By.id("yDmH0d")).click();
//		}
//		wd.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("ab12345");
		
		wd.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/span")).click();
		
	}
	
	@After
	public void tearDown() throws Exception {
//		wd.quit();
	}

}
