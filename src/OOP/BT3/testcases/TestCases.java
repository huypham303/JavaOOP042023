package OOP.BT3.testcases;

import OOP.BT3.common.BaseTest;

public class TestCases extends BaseTest {
    public TestCases(String browser, boolean report, boolean headless) {
        super(browser, report, headless);
    }

    public static void login(){
        System.out.println("TC1: Login to " + getBrowser());
        System.out.println("Step 1: Open browser");
        System.out.println("Step 2: go to " + getBrowser());
        System.out.println("Step 3: Enter email");
        System.out.println("Step 4: Enter password");
        System.out.println("Step 5: Click on login button");
        System.out.println("Success.");

    }

    public static void addCategory(){
        System.out.println("\nTC2: Add Category");
        System.out.println("Step 1: add course");
        System.out.println("Step 2: CLick buy button");
        System.out.println("Success.");
    }

    public static void main(String[] args) {

        //Login
        createDriver();
        login();
        addCategory();
        closeDriver();


    }
}
