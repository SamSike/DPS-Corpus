import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry {
    private String name;                    // �ؿ��W��
    private Vector dir = new Vector();      // �ؿ��i�J�I�����X
    public Directory(String name) {         // �غc�l
        this.name = name;
    }
    public String getName() {               // ���o�W��
        return name;
    }
    public int getSize() {                  // ���o�ؿ��e�q
        SizeVisitor v = new SizeVisitor();  
        accept(v);                          
        return v.getSize();                 
    }
    public Entry add(Entry entry) {         // �s�W�i�J�I
        dir.add(entry);
        return this;
    }
    public Iterator iterator() {
        return dir.iterator();
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
}
