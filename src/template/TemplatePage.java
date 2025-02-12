package template;

public abstract class TemplatePage {
    public void header() {
        System.out.println("Header");
    }
    public void footer() {
        System.out.println("Footer");
    }
    public void menu(){
        System.out.println("Menu");
    }
//    body -> abstract
    public abstract void body();
//co dinh thuat toan
    public final void showPage(){
        header();
        menu();
        body();
        footer();
    }

}
