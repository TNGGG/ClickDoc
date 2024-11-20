package Admin.Testcases.Customers;

import Admin.Pages.Customers;
import Common.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T1CustomersPage extends BaseTest {
    Customers Customers;
    @Test(priority = 1)
    public void login() {
        driver.get("http://dev3.vitex.asia:8009/admin/login");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("clickdoc.dev@gmail.com");
        driver.findElement(By.id("password")).sendKeys("nnN3ZYjw");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test(priority = 2)
    public void accessCustomersPage(){
        Customers = new Customers(driver);
        Customers.clickCustomerMenu();
    }
    @Test(priority = 3)
    public void accessAddNewCustomerPage(){
        Customers = new Customers(driver);
       Customers.clickAddNewCustomerButton();
        Customers.verifyAtAddNewCustomerPage();
    }
}
