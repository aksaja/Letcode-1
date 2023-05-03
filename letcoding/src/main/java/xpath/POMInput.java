package xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMInput extends Initialition{

	@FindBy(xpath = "//a[@id = 'testing']")
	public static WebElement workspace;

	@FindBy(xpath = "//a[@class = 'card-footer-item' ]")
	public static WebElement input;

	@FindBy(xpath = "//input[@id = 'fullName']")
	public static WebElement fullname;

	@FindBy(xpath = "//input[@id = 'join']")
	public static WebElement keyboardtab;
	
	@FindBy(xpath = "//*[@id=\"getMe\"]")
	public static WebElement insidebox;
	
	@FindBy(xpath = "//*[@id=\"clearMe\"]")
	public static WebElement cleartext;
	
	@FindBy(xpath = "//*[@id=\"noEdit\"]")
	public static WebElement disabled;
	
	@FindBy(xpath = "//*[@id=\"dontwrite\"]")
	public static WebElement readonly;
}
