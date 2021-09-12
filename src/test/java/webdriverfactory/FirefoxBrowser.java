package webdriverfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

public class FirefoxBrowser {
    // Получение экземпляра драйвера браузера "Firefox"
    public static WebDriver getDriver() {
        //Настройка исполняемого файла драйвера
        WebDriverManager.chromedriver().setup();

        // Опции драйвера:
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        // - поведение при появлении алертов "Игнорирование"
        firefoxOptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
        // - стратегия загрузки страницы "NORMAL"
        firefoxOptions.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, PageLoadStrategy.NORMAL);
        // - режим "Инкогнито"
        firefoxOptions.addArguments("--private");
        // - режим "Полный экран"
        firefoxOptions.addArguments("-kiosk");

        // Новый экземпляр драйвера
        return new FirefoxDriver(firefoxOptions);
    }
}
