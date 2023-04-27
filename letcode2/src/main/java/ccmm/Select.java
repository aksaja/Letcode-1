package ccmm;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Select {


public static void main(String[] args) {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\globeitzone.lk\\\\Desktop\\\\QA\\\\Selenium\\\\chromedriver.exe" );
ChromeDriver driver = new ChromeDriver();

driver.get("https://letcode.in/");
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[3]/app-menu/div/footer/a")).click();


//Select the apple using visible text
WebElement fruits= driver.findElement(By.xpath("//*[@id=\"fruits\"]"));
Select myFruits=new Select(fruits);
myFruits.selectByVisibleText("Apple");
myFruits.selectByVisibleText("Banana");
System.out.println(myFruits.getOptions());
List<WebElement> allFruits = myFruits.getOptions();
allFruits.forEach(i -> System.out.println(i.getText()));

//Select Argentina using value & print the selected value
WebElement country = driver.findElement(By.xpath("//*[@id=\"country\"]"));
Select myCountry = new Select(country);
myCountry.selectByValue("Argentina");
   WebElement selectedCountry=myCountry.getFirstSelectedOption();
   System.out.println(selectedCountry.getText());
   
   //Select your super hero's
   WebElement hero=driver.findElement(By.xpath("//*[@id=\"superheros\"]/option[1]"));
   Select heroes=new Select(hero);
   boolean isMul= heroes.isMultiple();
   System.out.println("Is Multiple?" + isMul);
   heroes.selectByIndex(1);
   heroes.selectByValue("bt");
   
   //TODO: loop
   List<WebElement> allHeros=heroes.getAllSelectedOptions();
   for (WebElement webElement : allHeros) {
    System.out.println(webElement.getText());
   }
   heroes .deselectByIndex(1);
   
   //boottrap dd
        driver.get("https://semantic-ui.com/modules/dropdown.html");
        driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[2]/div[2]"));
        driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[3]/div[2]/div[2]/div[2]"));
     
   //Select the programming language and print all the options
     
     
     
     

   





	}

}
