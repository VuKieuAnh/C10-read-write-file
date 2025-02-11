package proxy;

public class Client {
    public static void main(String[] args) {
        IGiamDoc truongphong = new Proxy(new GiamDoc(), "truongphong");
        IGiamDoc thuky = new Proxy(new GiamDoc(), "thuky");
//        truongphong.xetTangLuong();
        truongphong.diHop();
    }
}
