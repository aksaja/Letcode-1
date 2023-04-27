package ccm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\QA\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Open the URL
		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();

		//Click the workspace
		driver.findElement(By.id("testing")).click();

		//Click drop button
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[4]/div/div/div/div[2]/app-menu/div/footer/a")).click();


		//Element which need to drag
		WebElement From =driver.findElement(By.xpath("//*[@id=\"draggable\"]"));

		//Element which need to drop
		WebElement To = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

		//Using Action class for drag and drop.
		Actions act = new Actions(driver);

		//Perform drag and drop
		act.dragAndDrop(From, To).build().perform();
		//builder.dragAndDrop(From, To).perform();
		//act.dragAndDrop(From, To).build().perform();


		//verify text changed in to 'Drop here' box 
		String textTo = To.getText();

		if(textTo.equals("Dropped!")) {
			System.out.println("PASS: Source is dropped to target as expected");
		}else {
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}

		//driver.close();





	}

}
