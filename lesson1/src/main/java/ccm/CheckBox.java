package ccm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Open browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\QA\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Open the URL
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();

		//Click the workspace
		driver.findElement(By.xpath("/html/body/app-root/app-main/section[2]/div[1]/div[1]/div[1]/div/div/a")).click();

		//Click radio button
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[2]/app-menu/div/footer/a")).click();

		// Selecting CheckBox		
		WebElement option1 = driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input"));							

		// This will Toggle the Check box 		
		option1.click();			

		// Check whether the Check box is toggled on 		
		if (option1.isSelected()) {					
			System.out.println("Checkbox is Toggled On");					

		} else {			
			System.out.println("Checkbox is Toggled Off");
		}

		// Accept the T&C
		driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[7]/label[2]/input")).click();

		//isSelected(): Checks whether a checkbox is selected or not.
		//isDisplayed(): Checks whether a checkbox displays on the web page or not.
		//isEnabled(): Checks whether a checkbox is enabled or not


		//Validate Checkbox1 isSelected method and click

		/*WebElement checkBoxElement1 = driver.findElement((SearchContext) By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]"));
		boolean isSelected = checkBoxElement1.isSelected();
		System.out.println(isSelected);
		//performing click operation if element is not checked
		if(isSelected == false) {
		checkBoxElement1.click();



		//Validate Checkbox2 using isDisplayed() and click


		WebElement checkBoxElement2 = driver.findElement((SearchContext) By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input"));
		boolean isDisplayed = checkBoxElement2.isDisplayed();
		System.out.println(isDisplayed);
        // performing click operation if element is displayed
		if (isDisplayed == true) {
		checkBoxElement2.click();


	    //Validate checkbox3 using isEnabled() and then click


	     WebElement checkBoxElement3 = driver.findElement( By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]"));
		 boolean isEnabled = checkBoxElement3.isEnabled();
         System.out.println(isEnabled);
		// performing click operation if element is enabled
		if (isEnabled == true) {
		checkBoxElement3.click();*/
	}



}






