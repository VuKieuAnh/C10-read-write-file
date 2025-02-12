package observer.client;

import observer.observer.PhoneNotify;
import observer.subject.Account;
import observer.observer.AppNotify;
import observer.observer.EmailNotify;
import observer.observer.Observer;

public class Client {
    public static void main(String[] args) {
        Account account = new Account();
        Observer app = new AppNotify();
        Observer phone = new PhoneNotify();
        Observer email = new EmailNotify();
        account.attach(app);
        account.attach(phone);


        account.notifyObservers("Chuyen cho Loc 100K");
        account.detach(app);
        account.attach(email);
        account.notifyObservers("Chuyen cho Minh 200K");

    }
}
