package custcmd;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import config.StartBrowser;

public class ActionDriver {
	public WebDriver driver;
	
	public ActionDriver()
	{
		driver=StartBrowser.driver;
		
	}
	/**
	 * this is used for launch browser
	 * @param url source URL
	 */
	public void launchApplication(String url)
	{
		driver.get(url);
	}
	/**
	 * send text data in text box
	 * @param locator for finding element
	 * @param data test data
	 */
	public void type(By locator, String data)
	{
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(data);
	}
	public void click(By locator)
	{
		driver.findElement(locator).click();
		
	}
	public void alert()
	{
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	public void multiwindows()
	{
		Set<String> h=driver.getWindowHandles();
		System.out.println("No of handles:"+h.size());
		String handles[]=new String[h.size()];
		int i=0;
		for(String s:h)
		{
			System.out.println(s);
			handles[i]=s;
			i++;
		}
		driver.switchTo().window(handles[1]);
	}
	public void multiplefrane(int framenumber)
	{
		driver.switchTo().frame(framenumber);
		}
	public void dropdown()
	{
		Select dd=new Select(driver.findElement(By.className("dropdown-menu float-left")));
		//dd.selectByIndex(4);
		//dd.selectByValue("4");
		dd.selectByVisibleText("Logout");
		//System.out.println("Selected Option name is:");
	}
	
}
