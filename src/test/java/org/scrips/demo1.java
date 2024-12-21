package org.scrips;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 {
	
	@Test
	public void d1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	}

}
