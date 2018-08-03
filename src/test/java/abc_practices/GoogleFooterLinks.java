package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleFooterLinks {

	public static void main(String[] args) throws InterruptedException {
	       
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();  // You can use any other web browser.
        driver.get("https://www.google.com/");
		   
        driver.findElement(By.linkText("Privacy")).click();
        if(driver.getPageSource().contains("Privacy"))
        	System.out.println("The test passed");
        else
        	System.out.println("The test failed");
        Assert.assertEquals(true, driver.getPageSource().contains("Privacy"));
        Assert.assertEquals(0, 2-2);
        Thread.sleep(2000);
        driver.navigate().back();
        
        driver.findElement(By.linkText("Terms")).click();
        if(driver.getPageSource().contains("Terms"))
        	System.out.println("The test passed");
        else
        	System.out.println("The test failed");
        Assert.assertEquals(true, driver.getPageSource().contains("Terms"));
        Thread.sleep(2000);
        driver.navigate().back();
        
        driver.findElement(By.linkText("Settings")).click();
        if(driver.getPageSource().contains("Settings"))
        	System.out.println("The test passed");
        else
        	System.out.println("The test failed");
        Assert.assertEquals(true, driver.getPageSource().contains("Settings"));
        Thread.sleep(2000);
        driver.navigate().back();
        driver.close();
        
   }

}
