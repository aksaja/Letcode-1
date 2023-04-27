package ccm;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Repository;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {
	
private static final WebElement[] Repository = null;

public static void main(String[] args) throws Throwable {
	
			// TODO Auto-generated method stub
			//Open browser
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			//Open the URL and click the elements button
			driver.get("https://letcode.in/elements");
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			//Type and enter Git user name
			WebElement username	=driver.findElement(By.xpath("//input[@type='text']"));
			username.sendKeys("ortonikc");
			driver.findElement(By.xpath("//button[@id='search']")).click();


			//Assert that user has image
			Thread.sleep(290);
			WebElement image = driver.findElement(By.xpath("//img[@class='is-rounded']"));
			boolean imagePresent = image.isDisplayed();
			assert image.isDisplayed();
			//assert(imagePresent);
			System.out.println(imagePresent);

			//Print the user name and other informations
			WebElement name =driver.findElement(By.xpath("//p[@class = 'title is-4']"));
			System.out.println(name.getText());

			WebElement place = driver.findElement(By.xpath("//p[@class = 'subtitle is-6']"));
			System.out.print(place.getText());

			WebElement chanel = driver.findElement(By.xpath("//span[contains(text(),'Youtuber @letcode_with_koushik')]"));
			System.out.println(chanel.getText());

			WebElement repos = driver.findElement(By.xpath("//span[normalize-space()='Public Repos']"));
			System.out.println(repos.getText());

			WebElement gist = driver.findElement(By.xpath("//span[normalize-space()='Public Gist']"));
			System.out.println(gist.getText());

			WebElement follwers = driver.findElement(By.xpath("//span[normalize-space()='Followers']"));
			System.out.println(follwers.getText());

			//Thread.sleep(50);
			WebElement link1 = driver.findElement(By.xpath("//a[normalize-space()='https://github.com/ortoniKC/AnkitSharma-007']"));
			System.out.println(link1.getText());

			WebElement link2 = driver.findElement(By.xpath("//a[normalize-space()='https://github.com/ortoniKC/atom']"));
			System.out.println(link2.getText());

			//Assert that no.of public repositories are listed correctly
Thread.sleep(3990);
			WebElement repoitories = driver.findElement(By.xpath("//span[normalize-space()='65']"));
			boolean noOfReposiPresent1 = repoitories.isDisplayed();
			assert(noOfReposiPresent1);
			System.out.println(noOfReposiPresent1);

			List<WebElement> repositories = driver.findElements(By.xpath("//a[normalize-space()='https://github.com/ortoniKC/AnkitSharma-007']"));
for (WebElement repositories1 : repositories) {


			/*List<WebElement> elements = driver.findElements(By.tagName("label"));
			for (WebElement element:elements) {
			//String text=label.getText();
			System.out.println(element.getText());
		}
		driver.quit();*/
		
		



	}}
}


