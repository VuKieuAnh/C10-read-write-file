package observer.observer;

public class PhoneNotify implements Observer {
    @Override
    public void update(String message) {
        System.out.println("PhoneNotify: " + message);
    }
}
