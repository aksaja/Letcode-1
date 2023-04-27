package ccmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		//Open browser

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\QA\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();



		//Open the URL

		driver.get("https://letcode.in/");

		driver.manage().window().maximize();



		//Click the workspace

		driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();



		// Click radio button

		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[2]/app-menu/div/footer/a")).click();



		//Select radio button1

		WebElement radio1 =driver.findElement(By.xpath("//*[@id=\"yes\"]"));

		radio1.click();

		System.out.println("Radio button option 1 is selected");



		//Select radio button2 and de_select radio button1

		WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"no\"]"));

		radio2.click();

		System.out.println("Radio button option 2 is selected");



		//Find the bug

		WebElement radio3 = driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[3]/div/label[2]"));

		radio3.click();

		WebElement radio4 = driver.findElement(By.xpath("//*[@id=\"nobug\"]"));

		radio4.click();



		if(radio3.isSelected())

		{

			System.out.println("Radio button option 3 is selected");

		}

		else if(radio4.isSelected()) {

			System.out.println("Radio button option 4 is selected");

		}





		//Confirm you can select only one radio button

		WebElement radio5 = driver.findElement(By.xpath("//*[@id=\"one\"]"));

		radio5.click();

		WebElement radio6 = driver.findElement(By.xpath("//*[@id='two']"));

		radio6.click();



		if(radio5.isSelected())

		{

			System.out.println("Radio button option 5 is selected");

		}

		else if(radio6.isSelected()) {

			System.out.println("Radio button option 6 is selected");

		}

		//Confirm last field isDisabled

		WebElement radio7 = driver.findElement(By.xpath("//*[@id=\"maybe\"]"));

		boolean isEnabled = radio7.isEnabled();

		radio7.click();

		if(isEnabled==true) {

			System.out.println("isEnabled");

		}

		System.out.println("isNotEnabled");


		//Confirm you can select only one radio button

		WebElement yesbutton = driver.findElement(By.xpath("//*[@id=\"one\"]"));

		WebElement nobutton = driver.findElement(By.xpath("//*[@id=\"two\"]"));


		boolean status1=yesbutton.isSelected();

		boolean status2=nobutton.isSelected();

		System.out.println(status1);

		System.out.println(status2);












	}

}
