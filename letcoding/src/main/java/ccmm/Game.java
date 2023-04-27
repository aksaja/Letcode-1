package ccmm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//Open the URL and click the elements button
		driver.get("https://letcode.in/game");
		driver.manage().window().maximize(); 
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Click start game
		driver.findElement(By.xpath("/html/body/app-root/app-snake-game/section/div/div[20]")).click();
		
		//Click no walls
		driver.findElement(By.xpath("/html/body/app-root/app-snake-game/section/div/div[21]/div[2]")).click();
		
		//Play game
		driver.findElement(By.xpath("//div[@class='column' and @style ='background-color: rgb(134, 181, 189);']")).click();
		driver.findElement(By.xpath("//div[@class='column' and @style = background-color: rgb(134, 181, 189);'']")).click();
		
	}

}
