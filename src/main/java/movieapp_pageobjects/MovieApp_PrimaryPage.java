package movieapp_pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MovieApp_PrimaryPage {

	public WebDriver driver;

	public MovieApp_PrimaryPage(WebDriver driver) {

		this.driver = driver;

		// implementing page factory
		PageFactory.initElements(driver, this);
	}

//  main / home  page web elements

	@FindBy(xpath = ".//*[@id='popularButton']")
	WebElement popularButton;

	@FindBy(css = "[id='favoritesButton']")
	WebElement favoritesButton;

	@FindBy(id = "sortButton")
	WebElement sortButton;

	@FindBy(xpath = ".//*[@id='movieDate']")
	List<WebElement> movieDates;

	@FindBy(css = "[id='popularRate']")
	List<WebElement> popularRates;

	@FindBy(className = "movieTitle")
	List<WebElement> movieTitles;

	@FindBy(id = "description")
	List<WebElement> movieDescriptions;

	public WebElement getFavoritesButton() {

		return favoritesButton;
	}

	public WebElement getSortButton() {

		return sortButton;
	}

	public WebElement getPopularButton() {

		return popularButton;
	}

	public List<WebElement> getMovieDate() {

		return movieDates;
	}

	public List<WebElement> getMovieDescription() {

		return movieDescriptions;
	}

	public List<WebElement> getMovieRatings() {

		return popularRates;
	}

	public List<WebElement> getMovieTitle() {

		return movieTitles;

	}
}
