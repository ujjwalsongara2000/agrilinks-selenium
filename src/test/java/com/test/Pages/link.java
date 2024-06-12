package com.test.Pages;

import com.test.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class link extends BaseTest {


    @Test
    public void loginInfo() throws InterruptedException {

        WebDriver driver = getWebDriver();
        driver.get("https://qaadmin.agrilinks.in/");
              Thread.sleep(3000);
        WebElement element = driver.findElement(By.name("email"));
        element.sendKeys("tanishkapatil295@gmail.com");
        Thread.sleep(3000);
        WebElement elements = driver.findElement(By.name("password"));
        elements.sendKeys("Rishi@123");
        Thread.sleep(3000);
        WebElement radio1 = driver.findElement(By.className("accent-darkBlue"));
        radio1.click();
        Thread.sleep(3000);
        WebElement sing = driver.findElement(By.cssSelector("button[type='submit']"));
        sing.click();
        Thread.sleep(5000);
        WebElement vendor = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/aside/div/div[1]/div/div[2]/div[1]/p"));
        vendor.click();
        WebElement user = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/aside/div/div[1]/div/div[2]/div[2]/p[1]"));
        user.click();
        Thread.sleep(5000);
        WebElement addUser = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div/div[2]/button"));
        addUser.click();
        Thread.sleep(3000);
        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("test");
        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("0987654321");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("liseinfotech@gmail.com");
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("Testing@12");
        WebElement cPass = driver.findElement(By.name("confirmpassword"));
        cPass.sendKeys("Testing@12");
        Thread.sleep(5000);
        WebElement cancel = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[4]/div/div/div/div[6]/button[1]"));
        cancel.click();
        Thread.sleep(3000);
        WebElement company = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/aside/div/div[1]/div/div[2]/div[2]/p[2]"));
        company.click();
        Thread.sleep(4000);
        WebElement addCompany = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div/button"));
        addCompany.click();
        Thread.sleep(4000);
        WebElement comName = driver.findElement(By.name("name"));
        comName.sendKeys("test");

       WebElement drpdwn =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[1]/div/div[1]/div/div"));
       drpdwn.click();
       driver.findElement(By.xpath("//*[text()='2-5']")).click();
       Thread.sleep(2000);

        WebElement grade = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div/button[2]"));
        grade.click();
        WebElement selectUser = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[1]/div/div[4]/div/div[1]/div/div"));
        selectUser.sendKeys("test");
        selectUser.sendKeys(Keys.ENTER);

        WebElement industry = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[1]/div/div[5]/div/fieldset[2]"));
        industry.click();

        WebElement pan = driver.findElement(By.name("pan_number"));
        pan.sendKeys("ksbps3232r");

        WebElement address = driver.findElement(By.name("address"));
        address.sendKeys("hello this is a test site");

        WebElement create = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/button[2]"));
        create.click();

        Thread.sleep(10000);

        driver.close();
        driver.quit();

    }
}



//