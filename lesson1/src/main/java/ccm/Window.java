package ccm;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Open browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\QA\\Selenium\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();

		//Open the URL
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();  

		//Click the workspace
		driver.findElement(By.xpath("/html/body/app-root/app-main/section[2]/div[1]/div[1]/div[1]/div/div/a")).click();

		//Click the window
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[3]/app-menu/div/footer/a")).click();

		
		//Go to home
		driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
		
		
		// It will return the parent window name as a String
		String parentWindow=driver.getWindowHandle();
		WebElement button = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a"));
		button.click();
		System.out.println(parentWindow);
		
		
		Set<String> handles =driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		
		//WebElement button2 =driver.findElement(By.xpath("")).click();
		//System.out.println(parentWindow);
		
		/*String windowHandle =driver.getWindowHandle();
		System.out.println("first Window: "+windowHandle);
		
		driver.findElement(By.id("home")).click();
		Set<String> windowHandles =driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		
		//Print the title of the page
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(list.get(0));
		
		//Close the parent window
		driver.close();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		list.clear();
		list.addAll(windowHandles2);
		driver.switchTo().window(list.get(0));
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		


		//Open multiple window
		//Click on the home button

		//Goto the newly opened tab
		
		
		//Close the child window
		//Click on the Multiple windows button
		//Print all the window title
		//Close all the windows*/
	}

}
