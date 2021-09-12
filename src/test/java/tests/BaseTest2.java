package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import webdriverfactory.BrowserName;
import webdriverfactory.WebDriverFactory;

public class BaseTest2 {
    // Драйвер браузера
    protected static WebDriver driver;

    // Логгер
    private Logger logger = LogManager.getLogger(BaseTest2.class);

    // Перед каждым тестом
    @BeforeEach
    public void setUp(){
        // Получаем параметр запуска тестов через Maven -Dbrowser
        String browser = System.getProperty("browser", "chrome");
        // Получаем экземпляр драйвера браузера
        driver = WebDriverFactory.getDriver(BrowserName.fromString(browser));

        logger.info("Драйвер запущен!");
    }

    // После каждого теста
    @AfterEach
    public void setDown(){
        // Если драйвер еще существует
        if (driver != null){
            // Закрываем его
            driver.quit();
            logger.info("Драйвер остановлен!");
        }
    }
}
