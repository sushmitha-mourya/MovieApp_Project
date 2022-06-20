# Movie Application Test 
This project creates test automation using Selenium WebDriver



### Test Cases
MovieApp_E2E_Test is the main test class which has below method/test cases.

##### initialSetUp()
This method runs before every test run.

##### launchScreen()
This test method checks the launch screen display list of popular movie list.

##### popularMovies()
This method checks after clicking the popular button movie list sort based on popular rate.

##### titleSort()
This method checks after clicking the sort menu option "Title" the movie list display based on the title.

##### releaseDateSort()
This method checks after clicking the sort menu option "Release Date" the movie list  display based on the release date.

#####  close()
close the browser after the test completes.


### Framework
This project uses Data-driven Framework by using Page Object Model with Page Factory.


##### Language
Java


##### POM
As per the Page Object Model, this project maintains a class for every web page. Each web page has a separate class and that class holds  members of that web page.

##### Test Base Class
Test Base class (TestBase.java) deals with all the common functions used by all the pages. This class is responsible for loading the configurations from properties files, Initializing the WebDriver, Implicit Waits and also to create the object of FileInputStream which is responsible for pointing towards the file from which the data should be read.

##### Properties file
This file (driver.properties) stores the information that remains static throughout the framework such as browser-specific information.

##### TestNG
Using TestNG for Assertions, Grouping, and Parallel execution.

#####  Maven
All the tests are kept in the ‘src/test/java‘ and remaining files such as driver.properties, element locators (POM classes), utility files are kept under ‘src/main/java‘.
Using Maven for build, execution, and dependency purpose. 

#### Version Control Tool
Using Git as the repository to store the test scripts.