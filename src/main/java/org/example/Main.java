package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            WebDriver driver = new ChromeDriver();

            try {
                    String url = "http://10.56.160.77/acesso/index2.php?x=13";
                    driver.get(url);
                    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                    driver.switchTo().alert().accept();

                    System.out.print("Digite sua identidade militar: ");
                    String idmilitar = sc.nextLine();
                    driver.findElement(By.xpath("//*[@id=\"txUsuario\"]")).sendKeys(idmilitar);

                    System.out.print("Digite sua senha: ");
                    String senhamilitar = sc.nextLine();
                    driver.findElement(By.xpath("//*[@id=\"txSenha\"]")).sendKeys(senhamilitar);
                    driver.findElement(By.xpath("//*[@id=\"conteudo_topo\"]/div[1]/form/fieldset/table/tbody/tr[3]/td[3]/input")).click();
                    driver.switchTo().alert().accept();
                    driver.findElement(By.xpath("//*[@id=\"meni_div\"]/div/ul/ul/ul/li[2]")).click();
                    driver.findElement(By.xpath("//*[@id=\"meni_div\"]/div/ul/ul/ul/li[2]/ul/li/a")).click();
                    String elementos = String.valueOf(driver.findElement(By.className("arranchar")));

                    for (int i = 0; i <= elementos.length(); i++) {
                            if (i < elementos.length()){
                                    driver.findElement(By.className("arranchar")).click();
                            }



                    }
            }catch (Exception e){
                    System.out.println("Arranchamento concluido! ");
            }

            driver.quit();
        }
    }
