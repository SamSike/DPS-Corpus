import game.Memento;
import game.Gamer;
import java.io.*;

public class Main {
    public static final String SAVEFILENAME = "game.dat";       
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);               // �@�}�l��������`�B��100
        Memento memento = loadMemento();            // �q�ɮ׸��J
        if (memento != null) {
            System.out.println("�q�e�^�x�s�����G�}�l�C");
            gamer.restoreMemento(memento);
        } else {
            System.out.println("���s�}�l�C");
            memento = gamer.createMemento();
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);        // ��X����
            System.out.println("�{�p:" + gamer);    // ��X�D�H�Ϊ��ثe���A

            gamer.bet();    // �i��C��

            System.out.println("��������`�B��" + gamer.getMoney() + "���C");

            // �M�w�p��B�zMemento
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    �]�]���w�gĹ�F���֡A�G���x�s�ثe���A�^");
                memento = gamer.createMemento();
                saveMemento(memento);   // �x�s���ɮ�
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    �]�]���w�g��F�ܦh�A�G��_��e�����A�^");
                gamer.restoreMemento(memento);
            }

            // ����
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("");
        }
    }
    public static void saveMemento(Memento memento) {   
        try {
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(SAVEFILENAME));
            out.writeObject(memento);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Memento loadMemento() {               
        Memento memento = null;
        try {
            ObjectInput in = new ObjectInputStream(new FileInputStream(SAVEFILENAME));
            memento = (Memento)in.readObject();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("" + e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return memento;
    }
}
