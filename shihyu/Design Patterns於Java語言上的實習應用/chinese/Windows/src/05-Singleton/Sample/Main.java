public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1�Mobj2�O�P�@�������C");
        } else {
            System.out.println("obj1��obj2�ëD�P�@�������C");
        }
        System.out.println("End.");
    }
}
