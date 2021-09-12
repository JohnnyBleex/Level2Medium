package webdriverfactory;

public enum BrowserName {
    // Имена Браузеров
    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("edge");

    private String browserName;

    // Приватный конструктор
     BrowserName(String browserName){
        this.browserName = browserName;
    }

    // Переопределенный метод toString()
    @Override
    public String toString(){
         return String.valueOf(this.browserName);
    }

    // Возврат значения константы по строковому значению константы
    public static BrowserName fromString(String browserName){
         if(browserName != null){
             for (BrowserName b: BrowserName.values()){
                 if (browserName.equalsIgnoreCase(b.browserName)){
                     return b;
                 }
             }
         }
         return null;
    }

    // Получение имени браузера
    public String getBrowserName(){
         return this.browserName;
    }
}
