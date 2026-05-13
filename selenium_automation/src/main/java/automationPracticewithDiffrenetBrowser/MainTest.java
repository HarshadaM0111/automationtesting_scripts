package automationPracticewithDiffrenetBrowser;

public class MainTest {

    public static void main(String[] args) {

        String[] browsers = {"chrome", "edge", "firefox"};

        for(String browser : browsers) {

            PositiveLoginTest p = new PositiveLoginTest();
            p.positiveLoginTest(browser);

            NegativeUsernameTest n1 = new NegativeUsernameTest();
            n1.negativeUsernameTest(browser);

            NegativePasswordTest n2 = new NegativePasswordTest();
            n2.negativePasswordTest(browser);

            System.out.println("=======================");
        }
    }
}