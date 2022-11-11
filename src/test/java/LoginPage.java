import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver webDriver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.webDriver = driver;
    }

    @FindBy(xpath = "//*[contains(@id, 'loginEmail')]")
    private WebElement emailField;

    @FindBy(xpath = "//*[contains(@id, 'loginPassword')]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[contains(@id, 'authButton')]")
    private WebElement authButton;

    public void inputEmail(String email) { emailField.sendKeys(email); }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickAuthButton() { authButton.click(); }
}
