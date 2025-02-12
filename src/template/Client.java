package template;

public class Client {
    public static void main(String[] args) {
        TemplatePage home  = new HomePage();
//        home.showPage();

        TemplatePage detail = new DetailPage();
        detail.showPage();
    }
}
