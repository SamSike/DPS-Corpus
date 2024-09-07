public class UpDownBorder extends Border {
    private char borderChar;                        // �˹��r��
    public UpDownBorder(Display display, char ch) {   // �H�غc�l���wDisplay�M�˹��r��
        super(display);
        this.borderChar = ch;
    }
    public int getColumns() {                       // �r�ƦP���e���r��
        return display.getColumns();
    }
    public int getRows() {                          // ��ƭn�A�[�W���e�W�U���˹��r�������
        return 1 + display.getRows() + 1;
    }
    public String getRowText(int row) {             // ���w�Ӧ檺���e
        if (row == 0 || row == getRows() - 1) {
            return makeLine(borderChar, getColumns());
        } else {
            return display.getRowText(row - 1);
        }
    }
    private String makeLine(char ch, int count) { // �H�r��ch�A�إ߭���count�����s��r��
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
