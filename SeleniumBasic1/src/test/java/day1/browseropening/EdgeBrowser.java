package day1.browseropening;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EdgeBrowser {

	public static void main(String[] args) {
		//Create an instance of FirefoxDriver class
		EdgeDriver eDriver=new EdgeDriver();
		
	}

}
/*
Selenium opens new browsr for each run
Browser opened by  selenium will behave like a freshly installed browser 
 hence it wont be have a
 	-browser histrory
 	-cache
 	-cookies
 	-plugins/Extension
 	

*/