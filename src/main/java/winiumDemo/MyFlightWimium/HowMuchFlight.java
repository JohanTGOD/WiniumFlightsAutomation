package winiumDemo.MyFlightWimium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HowMuchFlight {

	private WebDriver driver;

	// mapear elementos
	WebElement price;

	public HowMuchFlight(WebDriver winium) {
		this.driver = winium;

	}

	public void validate() {
		price = driver.findElement(By.id("totalPrice"));
		System.out.println("El costo del viaje es: "+price.getAttribute("Name"));

	}
}
