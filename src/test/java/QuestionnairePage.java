import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class QuestionnairePage {

    public WebDriver webDriver;
    public QuestionnairePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.webDriver = driver;
    }

    @FindBy(xpath = "//*[contains(@id, 'dataEmail')]")
    private WebElement emailField;

    @FindBy(xpath = "//*[contains(@id, 'dataName')]")
    private WebElement nameField;

    @FindBy(xpath = "//*[contains(@id, 'dataGender')]")
    private Select genderDropdownList;

    @FindBy(xpath = "//*[contains(@id, 'dataCheck11')]")
    private WebElement option1_1_1;

    @FindBy(xpath = "//*[contains(@id, 'dataCheck12')]")
    private WebElement option1_1_2;

    @FindBy(xpath = "//*[contains(@id, 'dataSelect21')]")
    private WebElement option2_2_1;

    @FindBy(xpath = "//*[contains(@id, 'dataSelect22')]")
    private WebElement option2_2_2;

    @FindBy(xpath = "//*[contains(@id, 'dataSelect23')]")
    private WebElement option2_2_3;

    @FindBy(xpath = "//*[contains(@id, 'dataSend')]")
    private WebElement addButton;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/button")
    private WebElement okButton;

    public void inputEmail(String email) { emailField.sendKeys(email); }

    public void inputName(String name) { nameField.sendKeys(name); }

    public void selectGender(String gender) {
        Select genderList = new Select(webDriver.findElement(By.id("dataGender")));
        genderList.selectByVisibleText(gender);
    }

    public void clickOption1_1_1() {
        option1_1_1.click();
    }

    public void clickOption1_1_2() {
        option1_1_2.click();
    }
    public void clickOption2_2_1() {
        option2_2_1.click();
    }

    public void clickOption2_2_2() {
        option2_2_2.click();
    }

    public void clickOption2_2_3() {
        option2_2_3.click();
    }

    public void clickAddButton() { addButton.click(); }

    public void clickOkButton() {
        okButton.click();
    }

}
