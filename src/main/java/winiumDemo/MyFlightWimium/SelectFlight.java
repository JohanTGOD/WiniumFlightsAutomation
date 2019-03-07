package winiumDemo.MyFlightWimium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectFlight {

	private WebDriver driver;

	// mapear elementos
	WebElement table;
	WebElement btnSelectFlight;

	public SelectFlight(WebDriver winium) {
		this.driver = winium;

	}

	public void selectTrip(String buscar) {

		table = driver.findElement(By.id("flightsDataGrid"));
		List<WebElement> pcresultsList = table.findElements(By.className("TextBlock"));
		for (WebElement rowss : pcresultsList) {
				if (rowss.getAttribute("Name").equals(buscar)) {
//				System.out.println("Entro : " + rowss.getAttribute("Name"));
				rowss.click();
				btnSelectFlight = driver.findElement(By.id("selectFlightBtn"));
				btnSelectFlight.click();
				break;
			}

		}
	}
}
