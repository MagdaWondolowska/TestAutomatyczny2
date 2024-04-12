package myStore;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZadanieZaliczeniowe2 extends AbstractTest {

    HomePage homePage;
    LoginPage loginPage;
    YourAccountPage yourAccountPage;
    HummingbirdPage hummingbirdPage;
    ShopingCart shopingCart;
    AdressesPage adressesPage;
    ShippingMethodPage shippingMethod;
    PaymentPage paymentPage;
    OrderConfirmationPage orderConfirmationPage;
    OrderHistory orderHistory;

    @Before
    public void openBrowser() {
        setUp("chrome");
        homePage = new HomePage(driver);
        loginPage =  new LoginPage(driver);
        yourAccountPage = new YourAccountPage(driver);
        hummingbirdPage = new HummingbirdPage(driver, wait);
        shopingCart = new ShopingCart(driver, wait);
        adressesPage = new AdressesPage(driver);
        shippingMethod = new ShippingMethodPage(driver);
        paymentPage = new PaymentPage(driver);
        orderConfirmationPage = new OrderConfirmationPage(driver);
        orderHistory = new OrderHistory(driver);
    }



    @Test
    public void zadanieZaliczeniowe2() {
        homePage.goToHomePage();
        homePage.goToLoginPage();
        loginPage.logIn("qliooldricbaioejyj@cazlv.com", "12345");
        yourAccountPage.chooseCategory();
        hummingbirdPage.checkDiscount("20");
        hummingbirdPage.chooseSize("xl");
        hummingbirdPage.chooseQuantity(5);
        hummingbirdPage.addToCart();
        hummingbirdPage.proceedToCheckout();
        shopingCart.proceedToCheckOut();
        adressesPage.checkAdress();
        shippingMethod.chooseShippingMethod();
        paymentPage.payment();
        String generatedOderValue = orderConfirmationPage.generatedOrderValue();
        orderConfirmationPage.screenShot();
        orderConfirmationPage.goToAccountDetails();
        yourAccountPage.goToOrderHistory();
        orderHistory.orderStatusVeryfication("Awaiting check payment");
        orderHistory.orderValueVeryfication(generatedOderValue);

    }

}
