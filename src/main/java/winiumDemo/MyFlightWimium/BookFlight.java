package winiumDemo.MyFlightWimium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import winium.elements.desktop.ComboBox;

import java.util.concurrent.TimeUnit;

public class BookFlight {

	private WebDriver driver;
	private WebDriverWait wait;

	// Elementos mapeados

	WebElement valditeElemetCountry;
	ComboBox sltCiudad1;
	ComboBox  sltCiudad2;
	WebElement cldCalendario;
	ComboBox sltClass;
	ComboBox sltTickets;
	WebElement btnFindFlights;

	public BookFlight(WebDriver winum) {
		this.driver = winum;
		wait = new WebDriverWait(this.driver, 2000);
	}

	public void chooseMyTrip(String city1,String city2,String date,String classes,String tickets) {

		valditeElemetCountry = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fromCity")));
		sltCiudad1 = new ComboBox(driver.findElement(By.id("fromCity")));
		sltCiudad1.expand();
		sltCiudad1.scrollTo(By.name(city1)).click();
		sltCiudad2 = new ComboBox(driver.findElement(By.id("toCity")));
		sltCiudad2.expand();
		sltCiudad2.scrollTo(By.name(city2)).click();
		cldCalendario=driver.findElement(By.id("datePicker"));
		cldCalendario.sendKeys(date);
		sltClass = new ComboBox(driver.findElement(By.id("Class")));
		sltClass.expand();
		sltClass.scrollTo(By.name(classes)).click();
		sltTickets = new ComboBox(driver.findElement(By.id("numOfTickets")));
		sltTickets.expand();
		sltTickets.scrollTo(By.name(tickets)).click();
		btnFindFlights= driver.findElement(By.name("FIND FLIGHTS"));
		btnFindFlights.click();
		sltCiudad1 = new ComboBox(driver.findElement(By.id("fromCity")));
		
	}

}
