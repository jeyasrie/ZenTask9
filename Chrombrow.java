package browsercls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrombrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="STORE";
		//initialize the browser
		WebDriver driver=new ChromeDriver();
		//open the website
		driver.get("https://www.demoblaze.com/");
		//maximize the website window
		driver.manage().window().maximize();
		//print the website title using if else
		String title=driver.getTitle();
		
		if(title.equals(name)) {
			System.out.println(title);
			System.out.println("Page landed on correct website "+name);
		}
		else
		{
			System.out.println("page not landed on corrct website");
		}
		

	}

}

//Output
//STORE
//Page landed on correct website STORE