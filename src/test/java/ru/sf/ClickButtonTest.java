/*package ru.sf;*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;




    /*public class ClickButtonTest {
        public static void main(String[] args) {
            // Укажите путь к драйверу Chrome
            //setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

            // Создайте новый экземпляр ChromeDriver
            WebDriver driver = new ChromeDriver();

            try {
                // Откройте нужную страницу
                driver.get("https://www.skillfactory.ru");

                // Найдите кнопку по её селектору и кликните по ней
                WebElement button = driver.findElement(By.id("buttonId"));
                button.click();

                // Подождите, пока новая страница загрузится или новый элемент станет видимым
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Data Science")));

                // Можно выполнить дальнейшие действия на новой странице
                WebElement newElement = driver.findElement(By.id("Data Science"));
                System.out.println("Новый элемент найден: " + newElement.getText());

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Закройте драйвер
                //driver.quit();
            }
        }
    }*/
