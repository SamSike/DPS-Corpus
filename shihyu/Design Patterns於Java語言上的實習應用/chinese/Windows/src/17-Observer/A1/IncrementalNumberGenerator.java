public class IncrementalNumberGenerator extends NumberGenerator {
    private int number;                     // �ثe�ƭ�
    private int end;                        // �����ƭȡ]���t���ȡ^
    private int inc;                        // �W�[�Y�z
    public IncrementalNumberGenerator(int start, int end, int inc) {
        this.number = start;
        this.end = end;
        this.inc = inc;
    }
    public int getNumber() {                // ���o�ƭ�
        return number;
    }
    public void execute() {
        while (number < end) {
            notifyObservers();
            number += inc;
        }
    }
}
