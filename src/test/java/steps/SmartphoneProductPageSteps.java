package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.SmartphoneProductPage;

public class SmartphoneProductPageSteps {
    private static Logger logger = LogManager.getLogger(SmartphoneProductPageSteps.class);

    // Ссылка на объект класса SmartphoneProductPage
    private SmartphoneProductPage smartphoneProductPage;

    public SmartphoneProductPageSteps(SmartphoneProductPage smartphoneProductPage) {
        // ***** Страница "Продукт. Смартфон" *****
        this.smartphoneProductPage = smartphoneProductPage;
        logger.info("Открыта страница [Продукт. Смартфон]");
    }

    // Получение заголовка текущей страницы
    public String pageTitle(){
        return smartphoneProductPage.getPageTitle();
    }
}
