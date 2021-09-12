package webdriverfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class EdgeBrowser {
    // Получение экземпляра драйвера браузера "Firefox"
    public static WebDriver getDriver() {
        //Настройка исполняемого файла драйвера
        WebDriverManager.chromedriver().setup();

        // Опции драйвера:
        EdgeOptions edgeOptions = new EdgeOptions();
        // - поведение при появлении алертов "Игнорирование"
        edgeOptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
        // - стратегия загрузки страницы "NORMAL"
        edgeOptions.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, PageLoadStrategy.NORMAL);
        // - режим "Инкогнито"
        edgeOptions.addArguments("--incognito");
        // - режим "Полный экран"
        edgeOptions.addArguments("--start-fullscreen");

        // Новый экземпляр драйвера
        return new EdgeDriver(edgeOptions);
    }
}
