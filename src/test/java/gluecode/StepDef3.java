package gluecode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;
import util.DivtableUtilitiesClass;

public class StepDef3 
{
	public Sharedclass sh;
	public StepDef3(Sharedclass x)
	{
		sh=x;
	}
	@When ("select hight price in departure flights")
	public void method11()
	{

		WebElement dt=sh.driver.findElement(By.xpath("//div[text()='SpiceMAX']/following::div[2]"));
		// create object to utility class
		sh.lu2=new DivtableUtilitiesClass();
		int nof=sh.lu2.getChildDIVCount(dt);
		System.out.println("count of flights is "+nof);
		List<WebElement> flights=sh.lu2.getChildDIVs(dt);
		int lfare=0;
		for(WebElement flight:flights)
		{
			By b=By.xpath("child::div/div[2]/div[1]//span/parent::div");
			String value=sh.lu2.getDIVValue(sh.driver, flight,b);
			String num=value.replaceAll("[^0-9]", "");
			if(lfare==0) 
			{
				lfare=Integer.parseInt(num);
			}
			else if(lfare<Integer.parseInt(num))
			{
				lfare=Integer.parseInt(num);
				WebElement rb=flight.findElement(By.xpath("child::div/div[2]/div[1]//*[name()='svg']"));
				sh.driver.executeScript("arguments[0].scrollIntoView();",rb);
				rb.click();
			}
		}
		System.out.println("hight fare in departure flights "+lfare);
	}
	@When ("select hight price in arrival flights")
	public void method12()
	{
		WebElement dt=sh.driver.findElement(By.xpath("(//div[text()='SpiceMAX'])[2]/following::div[2]"));
		sh.driver.executeScript("arguments[0].scrollIntoView();",dt);
		// create object to utility class
		sh.lu2=new DivtableUtilitiesClass();
		int nof=sh.lu2.getChildDIVCount(dt);
		System.out.println("count of flights is "+nof);
		List<WebElement> flights=sh.lu2.getChildDIVs(dt);
		int lfare=0;
		for(WebElement flight:flights)
		{
			By b=By.xpath("child::div/div[2]/div[1]//span/parent::div");
			String value=sh.lu2.getDIVValue(sh.driver, flight,b);
			String num=value.replaceAll("[^0-9]", "");
			if(lfare==0) 
			{
				lfare=Integer.parseInt(num);
			}
			else if(lfare<Integer.parseInt(num))
			{
				lfare=Integer.parseInt(num);
				WebElement rb=flight.findElement(By.xpath("child::div/div[2]/div[1]//*[name()='svg']"));
				sh.driver.executeScript("arguments[0].scrollIntoView();",rb);
				rb.click();
				
			}
			
		}
		System.out.println("hight fare in arrival flights "+lfare);
	}

}
