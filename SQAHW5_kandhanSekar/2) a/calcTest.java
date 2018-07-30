import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
public class calcTest {

	public static void checkdivision() throws InterruptedException
	{
	     WebDriver driver = new FirefoxDriver();
	     driver.get("http://sod73.asu.edu/~jbalasoo/cse464/hw5/modified/math1.php");
	     driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	     WebElement ip1 = driver.findElement(By.name("num1"));
	     WebElement ip2 = driver.findElement(By.name("num2"));
	     CharSequence num1[]={"20"};
	     CharSequence num2[]={"5"};
	     ip1.sendKeys(num1);
	     ip2.sendKeys(num2);
	     List oRadioButton = driver. findElements(By. name("operation"));
	     ((WebElement) oRadioButton.get(3)).click();
	     WebElement subbutt = driver.findElement(By.name("submit"));
    	 subbutt.click();
	     WebElement res = driver.findElement(By.name("result"));
	     if(res.getAttribute("value").equals("4"))
	    		 {
	    	 System.out.println("Division Passed");
	    		 }
	}
	public static void checkmultiplication() throws InterruptedException
	{
	     WebDriver driver = new FirefoxDriver();
	     driver.get("http://sod73.asu.edu/~jbalasoo/cse464/hw5/modified/math1.php");
	     driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	     WebElement ip1 = driver.findElement(By.name("num1"));
	     WebElement ip2 = driver.findElement(By.name("num2"));
	     CharSequence num1[]={"12"};
	     CharSequence num2[]={"2"};
	     ip1.sendKeys(num1);
	     ip2.sendKeys(num2);
	     List oRadioButton = driver. findElements(By. name("operation"));
	     ((WebElement) oRadioButton.get(2)).click();
	     WebElement subbutt = driver.findElement(By.name("submit"));
    	 subbutt.click();
	     WebElement res = driver.findElement(By.name("result"));
	     if(res.getAttribute("value").equals("24"))
	    		 {
	    	 System.out.println("Multiplication Passed");
	    		 }
	}
	
	public static void checksubtraction() throws InterruptedException
	{
	     WebDriver driver = new FirefoxDriver();
	     driver.get("http://sod73.asu.edu/~jbalasoo/cse464/hw5/modified/math1.php");
	     driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	     WebElement ip1 = driver.findElement(By.name("num1"));
	     WebElement ip2 = driver.findElement(By.name("num2"));
	     CharSequence num1[]={"10"};
	     CharSequence num2[]={"2"};
	     ip1.sendKeys(num1);
	     ip2.sendKeys(num2);
	     List oRadioButton = driver. findElements(By. name("operation"));
	     ((WebElement) oRadioButton.get(1)).click();
	     WebElement subbutt = driver.findElement(By.name("submit"));
    	 subbutt.click();
	     WebElement res = driver.findElement(By.name("result"));
	     if(res.getAttribute("value").equals("8"))
	    		 {
	    	 System.out.println("Subtraction Passed");
	    		 }
	}
	public static void checkaddition() throws InterruptedException
	{
	     WebDriver driver = new FirefoxDriver();
	     driver.get("http://sod73.asu.edu/~jbalasoo/cse464/hw5/modified/math1.php");
	     driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	     WebElement ip1 = driver.findElement(By.name("num1"));
	     WebElement ip2 = driver.findElement(By.name("num2"));
	     CharSequence num1[]={"12"};
	     CharSequence num2[]={"24"};
	     ip1.sendKeys(num1);
	     ip2.sendKeys(num2);
	     List oRadioButton = driver. findElements(By. name("operation"));
	     ((WebElement) oRadioButton.get(0)).click();
	     //WebElement op = driver.findElement(By.name("operation"));
	     //op.click();
	     WebElement subbutt = driver.findElement(By.name("submit"));
    	 subbutt.click();
	     WebElement res = driver.findElement(By.name("result"));
	     if(res.getAttribute("value").equals("36"))
	    		 {
	    	 System.out.println("Addition Passed");
	    		 }
	}
	public static void main(String[] args) throws InterruptedException{
   checkaddition();
   checksubtraction();
   checkmultiplication();
   checkdivision();
	}  
}
