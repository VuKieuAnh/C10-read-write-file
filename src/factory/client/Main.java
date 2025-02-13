package factory.client;

import factory.factory.BanhFactory;
import factory.model.Banh;
import factory.model.BanhNuong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap vao loai banh");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        Banh a = BanhFactory.getInstance().createBanh(type);
    }
}
