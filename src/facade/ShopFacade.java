package facade;

public class ShopFacade {
    private static ShopFacade shopFacade;
    private ShopFacade() {}
    public synchronized static ShopFacade getInstance() {
        if (shopFacade == null) {
            shopFacade = new ShopFacade();
        }
        return shopFacade;
    }
    private AccountService accountService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    public void buyProductByCashWithFreeShipping(String email) {
        accountService.getAccount(email);
        paymentService.paymentByCash();
        System.out.println("Done\n");
    }

    public void buyProductByPaypalWithStandardShipping(String email, String mobilePhone) {
        accountService.getAccount(email);
        paymentService.paymentByPaypal();
        shippingService.standardShipping();
        System.out.println("Done\n");
    }
    public void buyProductByCreditWithExpress(String email, String mobilePhone) {
        accountService.getAccount(email);
        paymentService.paymentByCreditCard();
        shippingService.expressShipping();
        System.out.println("Done\n");
    }
}
