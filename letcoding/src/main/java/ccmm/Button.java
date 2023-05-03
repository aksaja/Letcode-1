package ccmm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Button{

	public static void main(String[] args) {

		//Open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//Open the URL and click button
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
		//driver.get("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a");
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a")).click();
		
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();

		//Get the X,Y co-ordinates

		WebElement ele=driver.findElement(By.id("position"));
		Point point=ele.getLocation();
		int x=point.getX();
		int y=point.getY();
		System.out.println("X=>"+x+"Y=>"+y);

		//Find the color of the button

		WebElement btnColor= driver.findElement(By.id("color"));
		String color=btnColor.getCssValue("background-color");
		System.out.println(color);

		//Find the width and height of the button

		Rectangle rect=driver.findElement(By.xpath("//*[@id=\"property\"]")).getRect();
		System.out.println(rect.getWidth());
		System.out.println(rect.getHeight());
		System.out.println(rect.getPoint());


		//Dimension dime = new Dimension(rect.getWidth(), rect.getHeight());
		//  or
		Dimension dime=rect.getDimension();
		System.out.println(dime);
		System.out.println(dime.getWidth());
		System.out.println(dime.getHeight());

		//Confirm button is disabled
		boolean isDisabled= driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(isDisabled);

		//Hold button
		WebElement hold=driver.findElement(By.xpath("//*[@id=\"isDisabled\"]/div/h2"));
		Actions actions=new Actions(driver);
		actions.clickAndHold(hold).build().perform();

		//driver.get(" http://192.168.1.28:3001/#/login")

		//driver.quit();

	}
}


