package tests.smartphones;

import org.junit.jupiter.api.Assertions;
import steps.SmartphoneProductPageSteps;

public class SmartphoneProductPageAssert2 {
    // Шаги на странице "Продукт. Смартфон"
    SmartphoneProductPageSteps smartphoneProductPageSteps;

    public SmartphoneProductPageAssert2(SmartphoneProductPageSteps smartphoneProductPageSteps) {
        this.smartphoneProductPageSteps = smartphoneProductPageSteps;
    }

    // Проверка / Утверждение (Матчер)
    public void pageTitleEquals(String expected) {
        String actual =smartphoneProductPageSteps.pageTitle();
        Assertions.assertEquals(expected, actual, "Ошибка! Заголовок страницы не соответствует ожидаемому!");
    }
}
