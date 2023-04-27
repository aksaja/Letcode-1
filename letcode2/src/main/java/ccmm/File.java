package ccmm;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//Open the URL and click file button
		driver.get("https://letcode.in/file");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		//File uploading using sendkeys
		/*WebElement chooseFile = driver.findElement(By.xpath("//span[@class='file-label' ]"));
		chooseFile.sendKeys("‪C:\\Users\\HP\\Downloads");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(chooseFile))	;	*/
		
		WebElement myElement = driver.findElement(By.xpath("//span[@class='file-label' ]"));
		myElement.sendKeys("‪C:\\Users\\HP\\Downloads\\automation-testing.pdf");
		Actions actions = new Actions(driver);
		actions.moveToElement(myElement).click().perform();

		//File download excel sheet
		WebElement excelDownload = driver.findElement(By.id("xls"));
		excelDownload.click();
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(myElement).click().perform();

		
        //Download PDF file
		WebElement pdfDownload = driver.findElement(By.xpath("//a[@id='pdf']"));
		pdfDownload.click();
	

		//Download text file
		WebElement textDownload = driver.findElement(By.xpath("//a[@id = 'txt']"));
		textDownload.click();
		
		driver.quit();
		
		
		/*driver.get("https://www.monsterindia.com/seeker/registration"); //Testing webpage
		JavascriptExecutor js = (JavascriptExecutor)driver; //Scrolling using JavascriptExecutor
		js.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
		//Thread.sleep(3000);

		// FILE UPLOADING USING SENDKEYS ....

		WebElement browse = driver.findElement(By.xpath("//input[@type='file']"));
		//click on ‘Choose file’ to upload the desired file
		browse.sendKeys("C:\\Users\\HP\\Downloads\\IT Vacancies.pdf"); //Uploading the file using sendKeys
		System.out.println("File is Uploaded Successfully");*/
		
	}

}
