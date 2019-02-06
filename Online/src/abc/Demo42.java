package abc;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo42 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.community.kpro.co.in/categories/tableau");
		List<String> hrefs = new ArrayList<String>();
		WebElement sec=driver.findElement(By.xpath("//*[@id='Content']/ul"));
		List<WebElement> anchors = sec.findElements(By.tagName("a"));
		for ( WebElement anchor : anchors ) {
		    hrefs.add(anchor.getAttribute("href"));
		}
		for ( String href : hrefs ) {
		    driver.get(href);  
		    String  currentURL = driver.getCurrentUrl();
		    if(currentURL.contains("profile"))
		    {
		    	
		    }else
		       System.out.println("<url>\n"+
"<loc>"+currentURL+"</loc>"
+"\n</url>");	
		}

	}

}
