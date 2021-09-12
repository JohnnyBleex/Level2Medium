package tests.smartphones;

import helpers.JSExec;
import models.Smartphone;
import models.SmartphoneBuilder;
import models.SmartphoneVO;
import models.valueobjects.Company;
import models.valueobjects.Ram;
import org.junit.jupiter.api.Test;
import pages.SmartphoneProductPage;
import pages.SmartphonesPageWithElements;
import pages.StartPageWithElements;
import tests.BaseTest2;

public class SmartphonesProductPage9_Test extends BaseTest2 {
    @Test
    public void selectedProduct_Is_SamsungGalaxyNote20Ultra256GBWhite(){
        // 1. Arrange
        SmartphoneBuilder builder = new SmartphoneBuilder(
                new Ram(8),
                new Company("Samsung"))
                .setRom(256)
                .setModel("S20");
        Smartphone smartphone = builder.build();

        // 2. Act
        SmartphoneProductPage smartphoneProductPage = getProductPage(smartphone);

        // 3. Assert
        String expected = "Купить 6.7\" Смартфон Samsung Galaxy Z Flip3 256 ГБ бежевый в интернет магазине DNS. Характеристики, цена Samsung Galaxy Z Flip3 | 4845670";
        SmartphoneProductPageAssert smartphoneProductPageAssert = new SmartphoneProductPageAssert(smartphoneProductPage);
        smartphoneProductPageAssert.pageTitleEquals(expected);
    }

    // Получение страницы с продуктом
    public SmartphoneProductPage getProductPage(Smartphone smartphone){
        // Открыть страницу https://www.dns-shop.ru/
        driver.get("https://www.dns-shop.ru/");
        // ***** Стартовая страница сайта DNS *****
        StartPageWithElements startPage = new StartPageWithElements(driver);
        // Наведение курсора мыши на ссылку "Смартфоны и гаджеты"
        startPage.linkSmartsAndGadgetsMove();
        // Нажатие на ссылку "Смартфоны"
        startPage.linkSmartsClick();

        // ***** Страница "Смартфоны" *****
        SmartphonesPageWithElements smartphonesPage = new SmartphonesPageWithElements(driver);
        // Нажатие на выпадашку "Сортировка"
        smartphonesPage.accordeonSortClick();
        // Установка сортировки "Сначала дорогие"
        smartphonesPage.rbtnExpensiveClick();
        // Прокрутка страницы вниз
        JSExec.scrollBy(0, 900);
        // Установка фильтра "Производитель"
        smartphonesPage.chbxCompanyClick(smartphone.getCompany().getCompany());
        // Прокрутка страницы вниз
        JSExec.scrollBy(0, 300);
        // Нажатие на гармошку "Объем оперативной памяти"
        smartphonesPage.accordeonRAMClick();
        // Прокрутка страницы вниз
        JSExec.scrollBy(0, 300);
        // Установка фильтра "Объем оперативной памяти"
        smartphonesPage.chbxRAMClick(smartphone.getRam().getRam() + " Гб");
        // Прокрутка страницы вниз
        JSExec.scrollBy(0, 500);
        // Нажатие на кнопку "Применить"
        smartphonesPage.btnApplyClick();
        // Прокрутка страницы вверх
        JSExec.scrollBy(0, -1500);
        // Нажатие на ссылку первого продукта в списке
        smartphonesPage.linkFirstProductClick("Смартфон Samsung Galaxy Z Flip3 256 ГБ бежевый");
        return new SmartphoneProductPage(driver);
    }
}
