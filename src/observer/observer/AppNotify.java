package observer.observer;

public class AppNotify implements Observer {
    @Override
    public void update(String message) {
        System.out.println("AppNotify: " + message);
    }
}
