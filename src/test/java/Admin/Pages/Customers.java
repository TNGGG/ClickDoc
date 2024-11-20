package Admin.Pages;

import asia.dev3.vitex.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Customers {
    //Khai báo driver cục bộ trong chính class này
    private WebDriver driver;

    //Khai báo hàm xây dựng, để truyền driver từ bên ngoài (Ham chung) vào chính class này sử dụng
    public Customers(WebDriver driver) {
        this.driver = driver;
        new Actions(driver); //Khởi tạo giá trị driver cho class Actions
    }

    //Khai báo các element dạng đối tượng By (phương thức tìm kiếm)
    private By customersMenu = By.xpath("//a[@href='http://dev3.vitex.asia:8009/en/admin/clients' and .//i[@class='fa fa-building-o']]");
    private By pageTitle = By.xpath("//li[normalize-space()='1 '?/.']");
    private By newCustomer = By.xpath("//a[contains(@class, 'datatable-redirect') and contains(@class, 'btn-secondary')]");
    private By copyTableButton = By.xpath("//i[@title='Copy']");
    private By exportDropdown = By.xpath("//button[(normalize-space(@class)='btn btn-default buttons-collection btn-secondary')]");
    private By printButton = By.xpath("//button[(normalize-space(@class)='btn btn-default buttons-print btn-secondary')]");
    private By colvis = By.xpath("//button[contains(@class, 'buttons-collection buttons-colvis')]");
    private By onlyDemo = By.xpath("//label[@for='only_demo_customers']");
    private By showBilling = By.xpath("//label[@for='show_billing_info']");
    private By searchInput = By.xpath("//input[@id='dt-search-0']");
    private By nameColumnTitle = By.xpath("//th[@data-field='name']");
    private By addressColumnTitle = By.xpath("//th[@data-field='client_address']");
    private By pmsColumnTitle = By.xpath("//th[@data-field='pms']");
    private By categoryColumnTitle = By.xpath("//th[@data-field='category_name']");
    private By demoColumnTitle = By.xpath("//th[@data-field='is_demo']");
    private By refColumnTitle = By.xpath("//th[@data-field='ref']");
    private By actionColumnTitle = By.xpath("//th[@data-field='action']");
    private By idColumnTitle = By.xpath("//th[@data-field='id']");
    private By countryColumnTitle = By.xpath("//th[@data-field='country_name']");
    private By installationIDColumnTitle = By.xpath("//th[@data-field='installation_id']");
    private By phoneColumnTitle = By.xpath("//th[@data-field='phone']");
    private By billingCustomerNrColumnTitle = By.xpath("//th[@data-field='billing_customer_number']");
    private By billingCompanyNameColumnTitle = By.xpath("//th[@data-field='billing_company_name']");
    private By billingAddressColumnTitle = By.xpath("//th[@data-field='billing_address']");
    private By dueDateColumnTitle = By.xpath("//th[@data-field='due_date']");
    private By billingVATNrColumnTitle = By.xpath("//th[@data-field='billing_vat_number']");
    private By editButton = By.xpath("(//i[@class='fa fa-pencil'])[1]");
    private By copyDemoClientButton = By.xpath("(//i[@class='fa fa-copy'])[1]");
    private By deleteButton = By.xpath("(//i[@class='fa fa-trash'])[1]");
    private By entriesPerPagedropdown = By.xpath("//select[@id='dt-length-0']");
    private By firstPageButton = By.xpath("//button[@data-dt-idx='first']");
    private By previousPageButton = By.xpath("//button[@data-dt-idx='previous']");
    private By nextPageButton = By.xpath("//button[@data-dt-idx='next']");
    private By lastPageButton = By.xpath("//button[@data-dt-idx='last']");
    private By page1Button = By.xpath("//button[@data-dt-idx='0']");
    private By page2Button = By.xpath("//button[@data-dt-idx='1']");

    //Actions
    public void clickCustomerMenu() {
        Actions.clickElement(customersMenu);
    }

    public void clickAddNewCustomerButton() {
       Actions.waitForOverlaysToDisappear(By.xpath("//div[@class='spinner']"));
       Actions.clickElement(newCustomer);
    }
//}
//
//
//    public void setEmail(String email) {
//        //driver.findElement(inputEmail).sendKeys(email);
//        WebUI.setText(inputEmail, email);
//    }
//
//    public void setPassword(String password) {
//        //driver.findElement(inputPassword).sendKeys(password);
//        WebUI.setText(inputPassword, password);
//    }


    //Assertions
    public void verifyAtAddNewCustomerPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("clients/create"), "FAIL. Not at Add New Customer Page");
    }

//    public void verifyLoginFail() {
//        Assert.assertTrue(driver.getCurrentUrl().contains("authentication"), "FAIL. Không còn ở trang Login");
//        Assert.assertTrue(driver.findElement(errorMessage).isDisplayed(), "Error message NOT displays");
//        Assert.assertEquals(driver.findElement(errorMessage).getText(), "Invalid email or password", "Content of error massage NOT match.");
//    }
//
//    public void verifyLoginFail(String message) {
//        Assert.assertTrue(driver.getCurrentUrl().contains("authentication"), "FAIL. Không còn ở trang Login");
//        Assert.assertTrue(driver.findElement(errorMessage).isDisplayed(), "Error message NOT displays");
//        Assert.assertEquals(driver.findElement(errorMessage).getText(), message, "Content of error massage NOT match.");
//    }
//
//    public void verifyLoginFailWithNullFields() {
//        Assert.assertTrue(driver.getCurrentUrl().contains("authentication"), "FAIL. Không còn ở trang Login");
//        Assert.assertTrue(driver.findElement(errorMessage1).isDisplayed(), "Error message 1 NOT displays");
//        Assert.assertTrue(driver.findElement(errorMessage2).isDisplayed(), "Error message 2 NOT displays");
//
////        String actualMessage1 = driver.findElement(errorMessage1).getText();
////        String actualMessage2 = driver.findElement(errorMessage1).getText();
//
//        Assert.assertEquals(WebUI.getTextElement(errorMessage1), "The Password field is required.", "Content of error massage 1 NOT match.");
//        Assert.assertEquals(WebUI.getTextElement(errorMessage2), "The Email Address field is required.", "Content of error massage 2 NOT match.");
//
}



