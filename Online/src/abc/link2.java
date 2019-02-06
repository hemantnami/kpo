package abc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.community.kpro.co.in/");
		Thread.sleep(7000);
		List<WebElement> links = driver.findElements(By.tagName("a")); //This will store all the link WebElements into a list

	    for(WebElement ele: links) // This way you can take the Url of each link
	    {
	   String url = ele.getAttribute("href"); //To get the link you can use getAttribute() method with "href" as an argument 
	   System.out.println(url);
	   
	    //	ele.click();
	    	//Thread.sleep(6000);
	    	//driver.navigate().back();

			//Used for demo purpose only, not required
			//Thread.sleep(4000);
	    	//String  currentURL = driver.getCurrentUrl();
	       //  System.out.println(currentURL);	    
	    	
	    }
	}

}
