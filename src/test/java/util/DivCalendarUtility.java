package util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DivCalendarUtility
{
	public void selectDate(RemoteWebDriver driver,WebElement calendar, int year, String month, int day) throws Exception
	{
		List<WebElement> monthsblocks=calendar.findElements(By.xpath("child::div/div"));
		// matching the month & year
		int flag=0;
		for(WebElement monthblock:monthsblocks)
		{
			String temp=monthblock.getAttribute("data-testid");
			temp=temp.toLowerCase();
			month=month.toLowerCase();
			if(temp.contains(month) && temp.contains(""+year))
			{
				flag=1;
				//get that matched block to visible 
				while(true)
				{
					if(monthblock.isDisplayed())
					{
						try
						{
							// dynamic XPATH for given day selection
							monthblock.findElement(By.xpath("descendant::div[@data-testid='undefined-calendar-day-"+day+"']")).click();
							Thread.sleep(5000);
						}
						catch(Exception ex)
						{
							System.out.println("wrong day in correct month and year");
						}
						break; //terminate from while loop
					}
					else
					{
						driver.findElement(By.xpath("(//div[@data-testid='undefined-calendar-picker']//*[name()='svg'])[1]")).click();
						Thread.sleep(5000);
					}
				}
				break; // terminate from for-each loop
			}
		}
		if(flag==0)
		{
			System.out.println("Given month and year not found in this calendar");
		}
		
	}

}
