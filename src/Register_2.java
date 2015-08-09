//package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Register_2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.webloadmpstore.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testRegister2Mpstore() throws Exception {
    driver.get("http://www.webloadmpstore.com/");
    long currentTime = System.currentTimeMillis();
    driver.findElement(By.linkText("LOGIN")).click();
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.cssSelector("input[name=\"name\"]")).clear();
    driver.findElement(By.cssSelector("input[name=\"name\"]")).sendKeys("Gio55447");
    driver.findElement(By.cssSelector("input[name=\"email\"]")).clear();
    driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("gio561@aol.com");
    driver.findElement(By.name("phone")).clear();
    driver.findElement(By.name("phone")).sendKeys("9735610074");
    driver.findElement(By.name("login")).clear();
    driver.findElement(By.name("login")).sendKeys("gio50" + currentTime);
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("Tep123");
    driver.findElement(By.name("password2")).clear();
    driver.findElement(By.name("password2")).sendKeys("Tep123");
    driver.findElement(By.name("Submit")).click();
    
   // driver.findElement(By.linkText("Back to Homepage")).click();
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
