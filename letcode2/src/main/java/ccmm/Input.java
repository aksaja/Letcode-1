package ccmm;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



package test;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input {

public static void main(String[] args) {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\globeitzone.lk\\\\Desktop\\\\QA\\\\Selenium\\\\chromedriver.exe" );
WebDriver driver = new ChromeDriver();
driver.get("https://letcode.in/");
driver.manage().window().maximize();


driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer/a")).click();

        //Enter your full name
   driver.findElement(By.id("fullName")).sendKeys("Durka Rajakulendiran");
 
   //Append a text and press keyboard tab
   driver.findElement(By.id("join")).sendKeys("person",Keys.TAB );
   
   //What is inside the text box
   String myValue= driver.findElement(By.id("getMe")).getAttribute("value");
   System.out.println(myValue);
   
   //Clear the text
   driver.findElement(By.id("clearMe")).clear();
   
   //Confirm edit field is disabled
   boolean isEdit= driver.findElement(By.id("noEdit")).isEnabled();
   System.out.println(isEdit);
   
   //Confirm text is readonly
   String isReadOnly= driver.findElement(By.id("dontwrite")).getAttribute("readonly");
   System.out.println(isReadOnly);
   
   //quit browser
  // driver.quit();
   
   //http://letcode.in
}


}

Displaying LetCodeDropdown.java.
	}

}
