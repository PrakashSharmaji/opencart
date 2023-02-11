package koiu;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class uhk 
{

public static void main(String[] args) throws InterruptedException 
{
WebDriver d=new ChromeDriver();
d.manage().window().maximize();
d.get("https://www.goibibo.com/");
Thread.sleep(3000);
System.out.println("URL is: "+d.getCurrentUrl());
System.out.println(d.getTitle());
/*d.findElement(By.xpath("//span[@class='sc-iwjdpV jUsACy fswDownArrow']")).click();
String my1="December 2023";
String date="27";
while(true)
{
String my2=d.findElement(By.xpath("//div[@class=\"DayPicker-Caption\"]")).getText();
if (my1.equals(my2))
break;
d.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
}
List<WebElement>alldates=d.findElements(By.xpath("//div[@class=\"DayPicker-Day\"]"));

for(WebElement dt:alldates)
{
	if(dt.getText().equals(date))
	{
	dt.click();
	break;
	}
}*/

}
}








