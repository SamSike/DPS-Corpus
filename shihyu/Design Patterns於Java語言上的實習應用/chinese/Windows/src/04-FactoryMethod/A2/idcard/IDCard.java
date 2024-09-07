package idcard;
import framework.*;

public class IDCard extends Product {
    private String owner;
    private int serial;
    IDCard(String owner, int serial) {
        System.out.println("�إ�" + owner + "(" + serial + ")" + "���d�C");
        this.owner = owner;
        this.serial = serial;
    }
    public void use() {
        System.out.println("�ϥ�" + owner + "(" + serial + ")" + "���d�C");
    }
    public String getOwner() {
        return owner;
    }
    public int getSerial() {
        return serial;
    }
}
