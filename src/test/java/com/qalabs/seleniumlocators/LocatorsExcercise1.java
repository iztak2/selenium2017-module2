package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsExcercise1 {
    public static void main (String[] args) throws InterruptedException{
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.get("https://www.mercadolibre.com.mx/");
        System.out.println("Page URL.-" + myDriver.getCurrentUrl());
        System.out.println("Page Title.-" + myDriver.getTitle());
        WebElement myElement = myDriver.findElement(By.name("as_word"));
        myElement.sendKeys("Selenium");
        myElement = myDriver.findElement(By.className("nav-search-btn"));
        myElement.click();
        myElement = myDriver.findElement(By.className("main-title"));
        myElement.click();

    }

}
