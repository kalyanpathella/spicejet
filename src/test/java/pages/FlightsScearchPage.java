package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsScearchPage 
{
	@FindBy(xpath="//div[text()='From']/following::input[1]") public WebElement from;
	@FindBy(xpath="//div[text()='To']/following::input[1]") public WebElement to;
	@FindBy(xpath="(//div[text()='Return Date']/following::*[name()='svg'])[1]") public WebElement calendar;
	@FindBy(xpath="//div[text()='Search Flight']/parent::div") public WebElement search;
	public FlightsScearchPage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void FillFrome(String x) throws Exception
	{
		from.clear();
		from.sendKeys(x);
		Thread.sleep(5000);
	}
	public void FillTo(String x) throws Exception
	{
		to.clear();
		to.sendKeys(x);
		Thread.sleep(5000);
	}
	public void ClickCalendar()throws Exception
	{
		calendar.click();
		Thread.sleep(5000);
	}
	public void ClickScearchFlight() throws Exception
	{
		search.click();
		Thread.sleep(5000);
	}
	

}
