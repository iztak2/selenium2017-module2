package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExcercise4 {
    public static void main (String[] args) throws InterruptedException {
        WebDriver myDriver = WebDriverFactory.getDriver("firefox");
        myDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        myDriver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
        WebElement link_portada = myDriver.findElement(By.linkText("Portada"));
        System.out.println(link_portada.getAttribute("href"));
//        WebElement Links_pagina = myDriver.findElements(By.partialLinkText("Página"));
        List<WebElement> Links_pagina = myDriver.findElements(By.partialLinkText("Página"));


        //WebElement mars = myDriver.findElement(By.partialLinkText("Mars"));
        //System.out.println(mars.getAttribute("href"));
        //WebElement input = myDriver.findElement(By.tagName("input"));
        //((System.out.println(input.getAttribute("id"));
        myDriver.quit();
    }
}
