import java.util.Vector;

public class MultiStringDisplay extends Display {
    private Vector body = new Vector();             // �C�L���r��
    private int columns = 0;                        // �̤j�r��
    public void add(String msg) {                   // �s�W�r��
        body.add(msg);
        updateColumn(msg);
    }
    public int getColumns() {                       // �r��
        return columns;
    }
    public int getRows() {                          // ���
        return body.size();
    }
    public String getRowText(int row) {             // �Ӧ檺���e
        return (String)body.get(row);
    }
    private void updateColumn(String msg) {         // ��s�r��
        if (msg.getBytes().length > columns) {
            columns = msg.getBytes().length;
        }
        for (int row = 0; row < body.size(); row++) {
            int fills = columns - ((String)body.get(row)).getBytes().length;
            if (fills > 0) {
                body.set(row, body.get(row) + spaces(fills));
            }
        }
    }
    private String spaces(int count) {              // ���ͪť�
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(' ');
        }
        return buf.toString();
    }
}
