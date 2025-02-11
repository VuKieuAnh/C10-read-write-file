package proxy;


public class Proxy implements IGiamDoc {
    private IGiamDoc giamDoc;
    private String role;

    public Proxy(IGiamDoc giamDoc, String role) {
        this.giamDoc = giamDoc;
        this.role = role;
    }

    @Override
    public void xetTangLuong() {
        if (role.equals("truongphong")) {
            giamDoc.xetTangLuong();
        }
        else
        throw new IllegalArgumentException("Ong co phai truong phong ko?");
    }

    @Override
    public void diHop() {
        if (role.equals("thuky")) {
            giamDoc.diHop();
        }
        else
        throw new IllegalArgumentException("Chi thu ky moi goi di hop dc, vo van");
    }
}
