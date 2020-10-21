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
		//Checking TextField with valid Values for First Name
		WebElement firstN = wd.findElement(By.id("firstName"));
		firstN.sendKeys("Akshay");
		String fname = firstN.getAttribute("value");
		System.out.println("First Name :- " + fname);

		//Checking TextField with valid Values for Last Name
		WebElement lastN = wd.findElement(By.id("lastName"));
		lastN.sendKeys("Bramhane");
		String lname1 = lastN.getAttribute("value");
		System.out.println("Last Name :- " + lname1);

		//Checking TextField with valid Values for UserName
		WebElement userN = wd.findElement(By.id("username"));
		userN.sendKeys("akshaybramhane19");
		String user = userN.getAttribute("value");
		System.out.println("User Name :- " + user);

		//Checking TextField with valid Values for Password
		WebElement password = wd.findElement(By.name("Passwd"));
		password.sendKeys("Akshay@b98765");
		String pass = password.getAttribute("value");
		System.out.println("Password :- " + pass);

		//Checking TextField with valid Values for Confirm Password
		WebElement confirmPassword = wd.findElement(By.name("ConfirmPasswd"));
		confirmPassword.sendKeys("Akshay@b98765");
		String cPass = confirmPassword.getAttribute("value");
		System.out.println("Confirm Password :- " + cPass);
		
		//clicking on Next Button
		wd.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/span/span")).click();
	}
	
	@After
	public void tearDown() throws Exception {
//		wd.quit();
	}

}
