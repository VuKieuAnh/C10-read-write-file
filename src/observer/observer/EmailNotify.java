package observer.observer;

public class EmailNotify implements Observer {
    @Override
    public void update(String message) {
        System.out.println("EmailNotify: " + message);
    }
}
