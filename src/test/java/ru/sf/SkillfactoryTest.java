package ru.sf;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SkillfactoryTest {

        //public ChromeDriver driver;
        public WebDriver webDriver;
        public WebDriverWait wait;


        @Before
        public void init() {

            WebDriverManager.chromedriver().setup();

            webDriver = new ChromeDriver();

            webDriver.manage().window().maximize();

            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            wait = new WebDriverWait(webDriver, Duration.ofSeconds(300));

        }

    @Test
    public void mainPageTitle() {

            webDriver.navigate().to("https://www.skillfactory.ru");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.className("title")));

            String ActualTitle = webDriver.getTitle();

            String ExpectedTitle = "Онлайн-школа Skillfactory — онлайн-обучение востребованным IT-профессиям";

            Assert.assertEquals(ExpectedTitle, ActualTitle);

            System.out.println("Test - Title ist verified");

    }

    @Test
    public void clickAllCourses() {

            webDriver.navigate().to("https://www.skillfactory.ru");

            WebElement AllCoursesButton = webDriver.findElement(By.className("directions__list-link_green"));

            AllCoursesButton.click();

            wait.until(ExpectedConditions.elementToBeClickable(By.className("directions__list-link_green")));

    }

    @Test
    public void clickContacts() {

            webDriver.navigate().to("https://www.skillfactory.ru");

            WebElement Contacts = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='контакты']"));

            Contacts.click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='main__nav']//*[text()='контакты']")));

    }

    @Test
    public void clickProgrammirovanie() {

            webDriver.navigate().to("https://www.skillfactory.ru");

            WebElement Programmirovanie = webDriver.findElement(By.partialLinkText("Программирование"));

            Programmirovanie.click();

            wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Программирование")));

    }

    @Test
    public void clickTestirovanie() {

            webDriver.navigate().to("https://www.skillfactory.ru");

            WebElement Testirovanie = webDriver.findElement(By.partialLinkText("Тестирование"));

            Testirovanie.click();

            wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Тестирование")));

    }

    @Test
    public void clickOnlineCourses() {

            webDriver.navigate().to("https://www.skillfactory.ru");

            WebElement OnlineCourses = webDriver.findElement(By.className("t978__tm-link"));

            OnlineCourses.click();

            wait.until(ExpectedConditions.elementToBeClickable(By.className("t978__tm-link")));

    }

    @Test
    public void clickOnlineCoursesInfrastructure() {

        webDriver.navigate().to("https://www.skillfactory.ru");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("main__nav")));

        WebElement OnlineCoursesInfrastructure = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='онлайн-курсы']"));

        OnlineCoursesInfrastructure.click();

        OnlineCoursesInfrastructure.sendKeys("Инфраструктура");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Инфраструктура']"))).click();

    }

    @Test
    public void clickMenuPython() {

            webDriver.navigate().to("https://www.skillfactory.ru");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.className("main__nav")));

            WebElement MenuPython = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='онлайн-курсы']"));

            MenuPython.click();

            MenuPython.sendKeys("Python");

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Python']"))).click();

    }

    @Test
    public void clickMenuBackendDevelopment() {

            webDriver.navigate().to("https://www.skillfactory.ru");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.className("main__nav")));

            WebElement MenuBackendDevelopment = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='онлайн-курсы']"));

            MenuBackendDevelopment.click();

            MenuBackendDevelopment.sendKeys("Backend-разработка");

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Backend-разработка']"))).click();

    }

    @Test
    public void clickMenuWebDevelopment() {

            webDriver.navigate().to("https://www.skillfactory.ru");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.className("main__nav")));

            WebElement MenuWebDevelopment = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='онлайн-курсы']"));

            MenuWebDevelopment.click();

            MenuWebDevelopment.sendKeys("Веб-разработка");

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Веб-разработка']"))).click();

    }

    @Test
    public void clickMenuApplicationDevelopment() {

            webDriver.navigate().to("https://www.skillfactory.ru");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.className("main__nav")));

            WebElement MenuApplicationDevelopment = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='онлайн-курсы']"));

            MenuApplicationDevelopment.click();

            MenuApplicationDevelopment.sendKeys("Разработка приложений");

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Разработка приложений']"))).click();

    }

    @Test
    public void clickMenuIntensiveСourses() {

            webDriver.navigate().to("https://www.skillfactory.ru");

            wait.until(ExpectedConditions.presenceOfElementLocated(By.className("main__nav")));

            WebElement MenuIntensiveCourses = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='онлайн-курсы']"));

            MenuIntensiveCourses.click();

            MenuIntensiveCourses.sendKeys("Интенсивные курсы");

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Интенсивные курсы']"))).click();

            //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='t978__link-inner_left']//*[text()='Интенсивные курсы']"))).click();
    }

    @Test
    public void clickDataScience() {

            webDriver.navigate().to("https://www.skillfactory.ru");

            WebElement DataScience = webDriver.findElement(By.partialLinkText("Data Science"));

            DataScience.click();

            wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Data Science")));

    }

    @Test
    public void clickAnalitikaDannyh() {

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement AnalitikaDannyh = webDriver.findElement(By.partialLinkText("Аналитика данных"));

        AnalitikaDannyh.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Аналитика данных")));

    }

    @Test
    public void clickDesign() {

            webDriver.navigate().to("https://www.skillfactory.ru");

            WebElement Design = webDriver.findElement(By.partialLinkText("Дизайн"));

            Design.click();

            wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Дизайн")));

    }

    @Test
    public void clickCorporativnoyeObuchenye() {

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement CorporativnoyeObuchenye = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='корпоративное обучение']"));

        CorporativnoyeObuchenye.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='main__nav']//*[text()='корпоративное обучение']")));

    }

    @Test
    public void clickBlog() {

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement Blog = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='Медиа']"));

        Blog.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='main__nav']//*[text()='Медиа']")));

    }

    @Test
    public void clickCareerCenter() {

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement CareerCenter = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='центр карьеры']"));

        CareerCenter.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='main__nav']//*[text()='центр карьеры']")));

    }

    @Test
    public void clickFreeEvents() {

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement FreeEvents = webDriver.findElement(By.xpath("//*[@class='main__nav']//*[text()='БЕСПЛАТНО']"));

        FreeEvents.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='main__nav']//*[text()='БЕСПЛАТНО']")));

    }

    @Test
    public void clickCardLinkWhiteHacker() {

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement CardLinkWhiteHacker = webDriver.findElement(By.cssSelector("#HACKER"));

        CardLinkWhiteHacker.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#HACKER")));

    }


    @Test
    public void clickLocatorRecordNegativeTest() {

            // Проверка формы "Оставьте контакты, и мы поможем подобрать IT-курс для вашей цели" на заполнение некорректных данных

            webDriver.navigate().to("https://www.skillfactory.ru");

            WebElement Namefield = webDriver.findElement(By.xpath("//*[@id=\"form625408054\"]/div[2]/div[1]/div/input"));

                Namefield.sendKeys("Test");

            WebElement Emailfield = webDriver.findElement(By.xpath("//*[@id=\"form625408054\"]/div[2]/div[2]/div/input"));

                Emailfield.sendKeys("Test");

            WebElement Telephonenumberfield = webDriver.findElement(By.xpath("//*[@id=\"input_1676828667932\"]"));

                Telephonenumberfield.sendKeys("0000000000");

            WebElement Sendbutton = webDriver.findElement(By.xpath("//*[@id=\"form625408054\"]/div[2]/div[5]/button"));

                Sendbutton.click();

                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form625408054\"]/div[2]/div[5]/button")));

    }

    @Test
    public void clickLocatorRecordNegativeTestDuble() {

         /* Данный вариант теста работал исправно до появления на сайте рекламного баннера */
        /* В варианте выше показанно как получилось обойти падение данного теста.
        При попытки использовать другие локаторы (name, className и т.д.) и методы к ним не увенчались успехом. В исправлении падения теста. */

        // Проверка формы записи "Оставьте контакты, и мы поможем подобрать IT-курс для вашей цели" на заполнение некорректных личных данных

        webDriver.navigate().to("https://www.skillfactory.ru");

        WebElement Namefield = webDriver.findElement(By.name("name"));

        Namefield.sendKeys("Test");

        WebElement Emailfield = webDriver.findElement(By.name("email"));

        Emailfield.sendKeys("Test");

        WebElement Telephonenumberfield = webDriver.findElement(By.name("tildaspec-phone-part[]"));

        Telephonenumberfield.sendKeys("0000000000");

        WebElement Sendbutton = webDriver.findElement(By.className("t-submit"));

        Sendbutton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.className("t-submit")));
    }

    @Test
    public void clickFormrecordingsNegativeTest1() {

            /* Данный тест также срабатывал в отсутствии рекламного баннера */

            // Проверка формы записи "Оставьте контакты, и мы поможем подобрать IT-курс для вашей цели" без заполнение необходимых личных данных

            webDriver.navigate().to("https://skillfactory.ru");

            WebElement SendButton = webDriver.findElement(By.xpath("//*[@id=\"form625408054\"]/div[2]/div[5]/button"));

            SendButton.click();

            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='t-submit']//*[text()='Отправить']")));
            //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='t-submit']//*[text()='Отправить']")));

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form625408054\"]/div[2]/div[5]/button")));

    }

    @Test
    public void clickNegativTestAdvertisingBanner() {

        //Проверка работы рекламного баннера без заполнения необходимых личных данных

        webDriver.navigate().to("https://skillfactory.ru");

        WebElement Buttontsubmit = webDriver.findElement(By.className("tn-elem__8114159181722593034290"));

        Buttontsubmit.click();

        WebElement Buttonsubmit1 = webDriver.findElement(By.className("t-form__submit"));

        Buttonsubmit1.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='t-submit']//*[text()='Записаться']")));

        //WebElement close = webDriver.findElement(By.xpath("//*[@class='t-popup__block-close-button']//*[text()='Закрыть диалоговое окно']"));

        WebElement close = this.webDriver.findElement(By.className("t-popup__close-icon"));

        close.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.className("t-popup__close-icon")));

        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"rec811415971\"]/div/div/div[1]/button")));

    }

    @After
    public void closeBrowser() {
            //driver.quit();
            webDriver.quit();
    }

}

