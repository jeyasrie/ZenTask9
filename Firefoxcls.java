package browsercls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//initialize the  driver with firfox
		WebDriver driver=new FirefoxDriver();
		
		//open the google website
		driver.get("https://www.google.com/");
		
		//get the url of the website
		String url=driver.getCurrentUrl();
		//print the url
		System.out.println("the current url of the website is "+url);
		
		//reload the current website
		driver.navigate().refresh();
		//close the current website
		//driver.close();

	}

}

//Outout
//the current url of the website is https://www.google.com/