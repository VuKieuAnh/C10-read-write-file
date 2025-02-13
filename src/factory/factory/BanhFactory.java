package factory.factory;

import factory.model.Banh;
import factory.model.BanhDeo;
import factory.model.BanhNuong;

public class BanhFactory {
    private static BanhFactory instance;

    private BanhFactory() {}

    public synchronized static BanhFactory getInstance() {
        if(instance == null) {
            instance = new BanhFactory();
        }
        return instance;
    }
    public Banh createBanh(String type) {
        switch (type) {
            case "BanhNuong":
                return new BanhNuong();
//                break;
            case "BanhDeo":
                return new BanhDeo();
            default:
                throw new IllegalArgumentException();
        }
    }
}
