package ccmm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub







// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\globeitzone.lk\\\\Desktop\\\\QA\\\\Selenium\\\\chromedriver.exe" );
WebDriver driver = new ChromeDriver();
driver.get("https://letcode.in/");
driver.manage().window().maximize();


driver.findElement(By.xpath("/html/body/app-root/app-main/section[2]/div[1]/div[1]/div[1]/div/div/a")).click();
driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[4]/app-menu/div/footer/a")).click();


//accept
driver.switchTo();
driver.findElement(By.xpath("//*[@id=\"accept\"]")).click();
Alert alert=driver.switchTo().alert();
String text=alert.getText();
System.out.println("Simple alert text" + text);
alert.accept();
//alert.dismiss();

//prompt
driver.findElement(By.id("prompt")).click();
System.out.println(driver.getCurrentUrl());
driver.switchTo().alert();
alert.sendKeys("Durka");
System.out.println(alert.getText());
alert.accept();
String name=driver.findElement(By.id("myName")).getText();
System.out.println(name);

//Modern alert














	}

}
