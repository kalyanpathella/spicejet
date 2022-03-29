package gluecode;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.FlightsScearchPage;
import util.DivCalendarUtility;
import util.DivtableUtilitiesClass;



public class Sharedclass 
{
	public RemoteWebDriver driver;
	public FlightsScearchPage obj1;
	public Scenario s;
	public DivCalendarUtility lu1;
	public DivtableUtilitiesClass lu2;
	
	@Before
	public void mathod(Scenario x)
	{
		s=x;
	}

}
