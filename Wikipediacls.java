package browsercls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipediacls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize the browser
		WebDriver driver=new ChromeDriver();
		
		//open the website
		driver.get("https://en.wikipedia.org/");
		//maximize the window
		driver.manage().window().maximize();
		
		//read the title of the current website
		String title=driver.getTitle();
		System.out.println("the webpage title is "+title);
		
		//in the search tag search for the query  artificial intelligence 
		WebElement searchbox=driver.findElement(By.id("searchInput"));
		searchbox.sendKeys("Artificial Intelligence");
		searchbox.submit();
		
		//view the search results history
		driver.findElement(By.id("ca-history")).click();
      
		
	}

}

//Output
//the webpage title is Wikipedia, the free encyclopedia