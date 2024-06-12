package com.test.Pages;

import com.test.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class LoginPage extends BaseTest {

    //@FindBy(name = "email")
    //private WebElement mail;

    @Test
    public void loginInfo() throws InterruptedException {

        WebDriver driver = getWebDriver();
        driver.get("https://www.facebook.com/");
        //      Thread.sleep(3000);
        WebElement element = driver.findElement(By.name("email"));
        element.sendKeys("Helloworld@gmail.com");
        WebElement elements = driver.findElement(By.name("pass"));
        elements.sendKeys("Hello");
        WebElement create = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        create.click();
        Thread.sleep(2000);
        WebElement name = driver.findElement(By.name("firstname"));
        name.sendKeys("Hello");
        WebElement last = driver.findElement(By.name("lastname"));
        last.sendKeys("world");
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("Helloworld2@gmail.com");
        WebElement Reemail = driver.findElement(By.name("reg_email_confirmation__"));
        Reemail.sendKeys("Helloworld2@gmail.com");
        WebElement pass = driver.findElement(By.name("reg_passwd__"));
        pass.sendKeys("Helloworld@123");
//        WebElement password = driver.findElement(By.name(""));
//        password.sendKeys("Helloworld");
        Select day = new Select(driver.findElement(By.cssSelector("select[title='Day']")));
        day.selectByVisibleText("8");
        Select month = new Select(driver.findElement(By.cssSelector("select[title='Month']")));
        month.selectByVisibleText("Jul");
        Select year = new Select(driver.findElement(By.cssSelector("select[title='Year']")));
        year.selectByVisibleText("1999");
        WebElement radio1 = driver.findElement(By.name("sex"));
        radio1.click();
        WebElement sing = driver.findElement(By.name("websubmit"));
        sing.click();
        Thread.sleep(3000);
       driver.quit();
    }
}
