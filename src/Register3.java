
//package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Register3 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://webloadmpstore.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testRegister3Mpstore() throws Exception {
    driver.get("http://webloadmpstore.com/");
    driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]")).click();
    driver.findElement(By.xpath("//form[@id='form1']/table/tbody/tr[4]/td[2]/a")).click();
    driver.findElement(By.cssSelector("input[name=\"name\"]")).clear();
    driver.findElement(By.cssSelector("input[name=\"name\"]")).sendKeys("Einstein");
    driver.findElement(By.cssSelector("input[name=\"email\"]")).clear();
    driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("einstein@aol.com");
    driver.findElement(By.cssSelector("input[name=\"phone\"]")).clear();
    driver.findElement(By.cssSelector("input[name=\"phone\"]")).sendKeys("9734456700");
    driver.findElement(By.xpath("//input[@name='login']")).clear();
    driver.findElement(By.xpath("//input[@name='login']")).sendKeys("supergenius1");
    driver.findElement(By.xpath("//input[@name='password']")).clear();
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tep123");
    driver.findElement(By.xpath("//input[@name='password2']")).clear();
    driver.findElement(By.xpath("//input[@name='password2']")).sendKeys("tep123");
    driver.findElement(By.name("Submit")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
