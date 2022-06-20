package movieapp_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FavoritesPage {

	public WebDriver driver;

	public FavoritesPage(WebDriver driver) {

		this.driver = driver;

		// implementing page factory
		PageFactory.initElements(driver, this);
	}

	//  favorites movies page web elements

	@FindBy(xpath = ".//*[@id='removeFavoritesButton']")
	WebElement removeFavorites;

	public WebElement getRemoveFavorites() {

		return removeFavorites;
	}

}
