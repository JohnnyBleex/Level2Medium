package steps;

import helpers.JSExec;
import models.valueobjects.Company;
import models.valueobjects.Ram;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.SmartphonesPageWithElements;

public class SmartphonesPageSteps {
    private static Logger logger = LogManager.getLogger(SmartphonesPageSteps.class);

    // Ссылка на объект класса SmartphonesPageWithElements
    private SmartphonesPageWithElements smartphonesPage;

    public SmartphonesPageSteps(SmartphonesPageWithElements smartphonesPage) {
        // ***** Страница "Смартфоны" *****
        this.smartphonesPage = smartphonesPage;
        logger.info("Открыта страница [Смартфоны]");
    }

    // Установка сортировки "Сначала дорогие"
    public void orderByExpensiveFirst() {
        // Нажатие на выпадашку "Сортировка"
        smartphonesPage.accordeonSortClick();
        // Установка сортировки "Сначала дорогие"
        smartphonesPage.rbtnExpensiveClick();
    }

    // Установка фильтра "Производитель"
    public void filterByCompany(Company company) {
        // Прокрутка страницы вниз
        JSExec.scrollBy(0, 900);
        // Установка фильтра "Производитель"
        smartphonesPage.chbxCompanyClick(company.getCompany());
    }

    // Установка фильтра "Объем оперативной памяти"
    public void filterByRAM(Ram ram) {
        // Прокрутка страницы вниз
        JSExec.scrollBy(0, 300);
        // Нажатие на гармошку "Объем оперативной памяти"
        smartphonesPage.accordeonRAMClick();
        // Прокрутка страницы вниз
        JSExec.scrollBy(0, 300);
        // Установка фильтра "Объем оперативной памяти"
        smartphonesPage.chbxRAMClick(ram.getRam() + " Гб");
    }

    // Нажатие на кнопку "Применить"
    public void clickButtonApply() {
        // Прокрутка страницы вниз
        JSExec.scrollBy(0, 500);
        // Нажатие на кнопку "Применить"
        smartphonesPage.btnApplyClick();
    }

    // Нажатие на ссылку первого продукта в списке
    public void clickLinkFirstProduct(String product) {
        // Прокрутка страницы вверх
        JSExec.scrollBy(0, -1500);
        // Нажатие на ссылку первого продукта в списке
        smartphonesPage.linkFirstProductClick("Смартфон Samsung Galaxy Z Flip3 256 ГБ бежевый");
        //smartphonesPage.linkFirstProductClick("Смартфон Samsung Galaxy S20 FE 128 ГБ белый");
    }
}
