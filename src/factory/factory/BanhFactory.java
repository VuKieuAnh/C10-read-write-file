package factory.factory;

import factory.model.Banh;
import factory.model.BanhDeo;
import factory.model.BanhNuong;

public class BanhFactory {

    public static Banh createBanh(String type) {
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
