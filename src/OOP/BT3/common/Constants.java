package OOP.BT3.common;

public class Constants {
    public static String browser;
    public static boolean report;
    public static boolean headless;

    public Constants(String browser, boolean report, boolean headless) {
        Constants.browser = browser;
        Constants.report = report;
        Constants.headless = headless;
    }

    public static String getBrowser() {
        return browser;
    }

    public static void setBrowser(String browser) {
        Constants.browser = browser;
    }

    public static boolean isReport() {
        return report;
    }

    public static void setReport(boolean report) {
        Constants.report = report;
    }

    public static boolean isHeadless() {
        return headless;
    }

    public static void setHeadless(boolean headless) {
        Constants.headless = headless;
    }
}
