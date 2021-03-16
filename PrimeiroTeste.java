package com.example.gerenciador;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpctedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.WeakHashMap;

public class PrimeiroTeste {

    private void exemploGoogleQuePesquisaPor(final String stringPesquisa){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");

        WebElement campoPesquisado = driver.findElement(By.name("q"));

campoPesquisado.clear();
campoPesquisado.sendkeys(stringPesquisa);

System.out.printn("O título da página é:"+ driver.getTitle());

campoPesquisado.submit();
        (new WebDriverWait(driver,10)).until(new ExpectecdCondition<Boolean>(){
            public Boolean apply(WebDriver objDriver){
               return objDriver.getTitle().tolowerCase().startsWith(stringPesquisa.toLowerCase());
            }

        });

        System.out.println("o título da página é:" + driver.getTitle());
        driver.quit();


    }

@Test
    public void googleExemploQueijo(){
        exemploGoogleQuePesquisaPor("teste de pesquisa para captura da tela!");

}
   @Test
   public void googleExemploLeite(){
        exemploGoogleQuePesquisaPor("Leite!");

   }

}
