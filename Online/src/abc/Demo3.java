package abc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
private static final String Value = null;
static WebDriver driver;
	public static WebElement getElementWithIndex(By by, int index) {
		WebElement element = driver.findElement(By.id(Value));
		List<WebElement> elements = element.findElements(By.tagName("a")); 
		return elements.get(index);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");  
		WebElement element = driver.findElement(By.id(Value));
		List<WebElement> elements = element.findElements(By.tagName("a"));
		int sizeOfAllLinks = elements.size();
		System.out.println(sizeOfAllLinks);
		for(int i=0; i<sizeOfAllLinks ;i++)
		{
		System.out.println(elements.get(i).getAttribute("href"));
		}   
		for (int index=0; index<sizeOfAllLinks; index++ ) {
		getElementWithIndex(By.tagName("a"), index).click();
		driver.navigate().back();
		}

		

	}

}
