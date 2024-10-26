public class Main {
    public static void main(String[] args) {
        SingletonImplementation s1 = SingletonImplementation.getInstance();
        SingletonImplementation s2 = SingletonImplementation.getInstance();
 
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
    }
}
