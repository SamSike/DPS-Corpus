import java.util.Iterator;
import java.util.Vector;

public class FileFindVisitor extends Visitor {
    private String filetype;
    private Vector found = new Vector();
    public FileFindVisitor(String filetype) {           // �]�w�ɦb���ɦW�e�[�W.�A�p".txt"
        this.filetype = filetype;
    }
    public Iterator getFoundFiles() {                   // ���o��쪺�ɮ�
        return found.iterator();
    }
    public void visit(File file) {                  // �X���ɮ׮ɧY�I�s
        if (file.getName().endsWith(filetype)) {
            found.add(file);
        }
    }
    public void visit(Directory directory) {   // �X�ݥؿ��ɧY�I�s
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
    }
}
