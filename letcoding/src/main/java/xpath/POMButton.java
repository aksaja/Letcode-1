package xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMButton  extends Initialition{

	@FindBy(xpath  ="//a[@href='/test']")
	public static WebElement workspace;

	@FindBy(xpath  ="//a[@href='/buttons']")
	public static WebElement button;

	@FindBy(xpath = "//*[@id=\"home\"]")
	public static WebElement gohome;

	@FindBy(xpath = "//*[@id=\"position\"]")
	public static WebElement findlocation;

	@FindBy(xpath ="//*[@id=\"color\"]" )
	public static WebElement color;

	@FindBy(xpath = "//*[@id=\"property\"]")
	public static WebElement heightwidth;

	@FindBy(xpath = "//*[@id=\"isDisabled\"]")
	public static WebElement confirm;

	@FindBy(xpath = "//*[@id=\"isDisabled\"]/div/h2")
	public static WebElement hold;
}
