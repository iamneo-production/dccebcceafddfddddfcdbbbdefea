package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {

	FirefoxDriver driver;
	String qatechhubUrl = "http://qatechhub.com";
	String facebookUrl = "https://www.facebook.com";

	public void invokeBrowser() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Arjit\\workspace\\libs\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get(qatechhubUrl);

		String titleOfThePage = driver.getTitle();

		if (titleOfThePage.equals("We are Hiring!")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

	}

	public void navigateCommands() {
		driver.navigate().to(facebookUrl);

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Current URL :: " + currentUrl);
		driver.navigate().back();

		driver.navigate().refresh();

		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		Assignment1 assignment = new Assignment1();

		assignment.invokeBrowser();

	}

}