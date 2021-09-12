package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.StartPageWithElements;

public class StartPageSteps {
    private static Logger logger = LogManager.getLogger(StartPageSteps.class);

    // Ссылка на объект класса StartPageWithElements
    private StartPageWithElements startPage;

    public StartPageSteps(StartPageWithElements startPage) {
        this.startPage = startPage;
        logger.info("Открыта страница [Стартовая страница DNS]");
    }

    // Нажатие на ссылку "Смартфоны"
    public void clickLinkSmarts() {
        // Наведение курсора мыши на ссылку "Смартфоны и гаджеты"
        startPage.linkSmartsAndGadgetsMove();
        // Нажатие на ссылку "Смартфоны"
        startPage.linkSmartsClick();
    }
}
