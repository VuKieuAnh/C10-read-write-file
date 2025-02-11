package facade;

public class Client {
    public static void main(String[] args) {
        ShopFacade s = ShopFacade.getInstance();
        s.buyProductByCashWithFreeShipping("email.com");
        s.buyProductByPaypalWithStandardShipping("fhasgf.com", "100");
    }
}
