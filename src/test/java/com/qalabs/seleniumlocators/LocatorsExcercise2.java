package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LocatorsExcercise2 {
    public static void main (String[] args) throws InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        myDriver.get("https://www.google.com.mx");
        System.out.println("Page URL.-" + myDriver.getCurrentUrl());
        System.out.println("Page Title.-" + myDriver.getTitle());
        WebElement myElement = myDriver.findElement(By.name("Wrong element name"));
        myDriver.quit();
    }
}
