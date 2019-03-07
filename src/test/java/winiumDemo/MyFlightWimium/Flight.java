package winiumDemo.MyFlightWimium;

import java.net.URL;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Flight

{
	private WiniumDriver driver;

	@Before
	public void setUp() {

		try {
			String appPath = "Flights Application//FlightsGUI.exe";
			DesktopOptions option = new DesktopOptions();
			option.setApplicationPath(appPath);
			option.setDebugConnectToRunningApp(false);
			option.setLaunchDelay(1);
			driver = new WiniumDriver(new URL("http://localhost:9999"), option);

		} catch (Exception e) {
			System.out.println("El error es : " + e.getMessage());

		}

	}

	@Test
	public void trip() {
		try {
			LoginFlight loginPage = new LoginFlight(driver);
			loginPage.login("john", "HP");
			BookFlight bookPage = new BookFlight(driver);
			bookPage.chooseMyTrip("Denver","Paris","18/04/2019","First","4");
			SelectFlight selectPage = new SelectFlight(driver);
			selectPage.selectTrip("149,00");
			HowMuchFlight seePrice = new HowMuchFlight(driver);
			seePrice.validate();
		} catch (Exception e) {
			System.out.println("err " + e.getMessage());
		}

	}

	@After
	public void finish() {
		driver.quit();
	}
}
