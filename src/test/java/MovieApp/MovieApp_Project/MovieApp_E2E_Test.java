package MovieApp.MovieApp_Project;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import movieapp_pageobjects.MovieApp_PrimaryPage;
import movieapp_pageobjects.SortMenu;
import movieapp_utility.TestBase;


//inheriting the browserDriver class to access browser.
public class MovieApp_E2E_Test extends TestBase {

	@BeforeTest
	public void initialSetUp() throws IOException {

		// access browser
		driver = initializeDriver();

		// navigate to movie application
		driver.get("https://movieApp.com");

	}

	@Test
	public void launchScreen() {
		// same as popular but without clicking the popular button

		MovieApp_PrimaryPage home = new MovieApp_PrimaryPage(driver);
		List<WebElement> ratingElements = home.getMovieRatings();
		List<Double> ratings = new ArrayList<>();
		for (WebElement element : ratingElements) {
			ratings.add(Double.valueOf(element.getText()));
		}

		// expecting descending ratings
		List<Double> expectedRatings = new ArrayList<>(ratings);
		Collections.sort(expectedRatings, Collections.reverseOrder());

		Assert.assertEquals(ratings, expectedRatings);
	}

	@Test
	public void popularMovies() {

		MovieApp_PrimaryPage home = new MovieApp_PrimaryPage(driver);
		home.getPopularButton().click();

		List<WebElement> ratingElements = home.getMovieRatings();
		List<Double> ratings = new ArrayList<>();
		for (WebElement element : ratingElements) {
			ratings.add(Double.valueOf(element.getText()));
		}

		// expecting descending ratings
		List<Double> expectedRatings = new ArrayList<>(ratings);
		Collections.sort(expectedRatings, Collections.reverseOrder());

		Assert.assertEquals(ratings, expectedRatings);

	}

	@Test
	public void titleSort() {

		// click sort button
		MovieApp_PrimaryPage home = new MovieApp_PrimaryPage(driver);
		home.getSortButton().click();

		// select title option
		SortMenu options = new SortMenu(driver);
		options.getTitle().click();

		List<WebElement> titleElements = home.getMovieTitle();

		List<String> titles = new ArrayList<>();
		for (WebElement element : titleElements) {
			titles.add(element.getText());

		}

		List<String> expectedTitles = new ArrayList<>(titles);
		Collections.sort(expectedTitles);

		Assert.assertEquals(titles, expectedTitles);

	}

	@Test
	public void releaseDateSort() throws ParseException {
		MovieApp_PrimaryPage home = new MovieApp_PrimaryPage(driver);
		home.getSortButton().click();

		// select releaseDate option
		SortMenu options = new SortMenu(driver);
		options.getReleaseDate().click();

		List<WebElement> dateElements = home.getMovieDate();
		List<Date> dates = new ArrayList<>();
		for (WebElement element : dateElements) {
			// creating date object
			SimpleDateFormat format = new SimpleDateFormat("MMM dd, yyyy");

			Date theDate = format.parse(element.getText());
			dates.add(theDate);

		}

		List<Date> expectedDates = new ArrayList<Date>(dates);
		Collections.sort(expectedDates, Collections.reverseOrder());
		
		Assert.assertEquals(expectedDates,dates);

	

		
	}

	@AfterTest
	public void close() {
		driver.quit();
	}

}
