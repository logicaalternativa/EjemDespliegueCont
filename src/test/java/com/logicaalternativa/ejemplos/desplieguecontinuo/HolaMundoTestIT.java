package com.logicaalternativa.ejemplos.desplieguecontinuo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class HolaMundoTestIT {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	 driver = new HtmlUnitDriver();
	 // driver = new FirefoxDriver();
	 baseUrl = "http://localhost:8088/";
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testHolaMundoIT() throws Exception {
    driver.get(baseUrl + "home.xhtml");
    WebElement elemento = driver.findElement( By.id( "mensaje" ));
    
    String mensaje = elemento.getText();
   
   	assertEquals("Hola Mundo!", mensaje );
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

 
}
