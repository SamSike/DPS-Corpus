public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1�Mobj2�O�P�@��ҡC");
        } else {
            System.out.println("obj1��obj2�ëD�P�@��ҡC");
        }
        System.out.println("End.");
    }
}
