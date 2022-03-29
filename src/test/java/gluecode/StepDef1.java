package gluecode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given; 
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.FlightsScearchPage;
import util.DivCalendarUtility;
import util.DivtableUtilitiesClass;

public class StepDef1 
{
	public Sharedclass sh; 
	public StepDef1(Sharedclass x)
	{
		sh=x;
	}
	@Given ("open browser site")
	public void methode1()
	{
		WebDriverManager.chromedriver().setup(); 
		sh.driver=new ChromeDriver();
		sh.obj1=new FlightsScearchPage(sh.driver);
	} 
	@Given ("launch spicejet site")
	public void method2()
	{
		sh.driver.get("https://www.spicejet.com/");
	}
	@When ("click on frome and enter {string}")
	public void methiod3(String from) throws Exception
	{
		sh.obj1.FillFrome(from);
	}
	@When ("click on to and enter {string}")
	public void method4(String to) throws Exception
	{
		sh. obj1.FillTo(to);
	}
	@When ("enter  {int}  and {string} and  {int}")
	public void methode5(Integer dd,String dm, Integer dy) throws Exception
	{
		WebElement calendar=sh.driver.findElement(By.xpath("(//div[contains(@data-testid,'undefined-month')])[1]/ancestor::div[2]"));
		sh.lu1=new DivCalendarUtility();
		sh.lu1.selectDate(sh.driver, calendar, dy, dm, dd);
		
		
	}
	@When ("click on calendar")
	public void method6() throws Exception
	{
		sh.obj1.ClickCalendar();
	}	
	
}
