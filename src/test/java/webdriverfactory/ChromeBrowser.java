package webdriverfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class ChromeBrowser {
    // Получение экземпляра драйвера браузера "Google Chrome"
    public static WebDriver getDriver(){
        //Настройка исполняемого файла драйвера
        WebDriverManager.chromedriver().setup();

        // Опции драйвера:
        ChromeOptions chromeOptions = new ChromeOptions();
        // - поведение при появлении алертов "Игнорирование"
        chromeOptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
        // - стратегия загрузки страницы "NORMAL"
        chromeOptions.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, PageLoadStrategy.NORMAL);
        // - режим "Инкогнито"
        chromeOptions.addArguments("--incognito");
        // - режим "Полный экран"
        chromeOptions.addArguments("--start-maximized");

        // Новый экземпляр драйвера
        return new ChromeDriver(chromeOptions);
    }
}
