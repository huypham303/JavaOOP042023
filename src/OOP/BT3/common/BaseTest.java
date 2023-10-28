package OOP.BT3.common;

public class BaseTest extends Constants{
//    public static void main(String[] args) {
//        createDriver();
//        closeDriver();
//    }
    public static void createDriver(){
        System.out.println("Create Driver");
        System.out.println("Browser: "+ Constants.getBrowser());
        System.out.println("Report: " + Constants.isReport());
        System.out.println("Headless: " + Constants.isHeadless() + "\n");
    }

    public static void closeDriver(){
        System.out.println("\n" + Constants.getBrowser() + " is closed.");
    }


    public BaseTest(String browser, boolean report, boolean headless) {
        super(browser, report, headless);
    }
}
