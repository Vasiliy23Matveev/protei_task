import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class LoginQuestionnaireTest {
    public static LoginPage loginPage;
    public static QuestionnairePage questionnairePage;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        WebDriver driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        questionnairePage = new QuestionnairePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @Test
    public void loginTest() {
        loginPage.inputEmail(ConfProperties.getProperty("email"));
        loginPage.inputPassword(ConfProperties.getProperty("password"));
        loginPage.clickAuthButton();
        System.out.println("Login successfully!");
    }

    @Test
    public void dataTest() {
        questionnairePage.inputEmail(ConfProperties.getProperty("email"));
        questionnairePage.inputName(ConfProperties.getProperty("name"));
        questionnairePage.selectGender("Женский");
        questionnairePage.clickOption1_1_1();
        questionnairePage.clickOption2_2_1();
        questionnairePage.clickAddButton();
        questionnairePage.clickOkButton();
        System.out.println("User added");

        questionnairePage.selectGender("Мужской");
        questionnairePage.clickOption1_1_2();
        questionnairePage.clickOption2_2_2();
        questionnairePage.clickAddButton();
        questionnairePage.clickOkButton();
        System.out.println("User added");

        questionnairePage.selectGender("Женский");
        questionnairePage.clickOption1_1_1();
        questionnairePage.clickOption2_2_3();
        questionnairePage.clickAddButton();
        questionnairePage.clickOkButton();
        System.out.println("User added");
    }
}

