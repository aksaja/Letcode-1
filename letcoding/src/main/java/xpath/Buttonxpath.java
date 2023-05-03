package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Buttonxpath extends POMButton{
	public static void main(String[] args) {


		// TODO Auto-generated method stub

		POMButton page = new POMButton();
		page.settings();
		PageFactory.initElements(driver, page);
		workspace.click();
		button.click();
		//gohome.click();



		//Get the X,Y co-ordinates

		Point point=findlocation.getLocation();
		int x=point.getX();
		int y=point.getY();
		System.out.println("X=>"+x+"Y=>"+y);


		//Find the color of the button

		String colors=color.getCssValue("background-color");
		System.out.println(color);

		//Find the width and height of the button

		Rectangle rect=heightwidth.getRect();
		System.out.println(rect.getWidth());
		System.out.println(rect.getHeight());
		System.out.println(rect.getPoint());

		Dimension dime=rect.getDimension();
		System.out.println(dime);
		System.out.println(dime.getWidth());
		System.out.println(dime.getHeight());

		//Confirm button is disabled
		boolean isDisabled= confirm.isEnabled();
		System.out.println(isDisabled);

		//Hold button

		Actions actions=new Actions(driver);
		actions.clickAndHold(hold).build().perform();
	}




}
