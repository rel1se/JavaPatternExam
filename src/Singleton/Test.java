package Singleton;

public class Test {
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s1a = Singleton1.getInstance();
        System.out.println(s1 + " " + s1a + " " + s1.equals(s1a));
        Singleton2 s2 = Singleton2.getInstance();
        Singleton2 s2a = Singleton2.getInstance();
        System.out.println(s2 + " " + s2a + " " + s2.equals(s2a));
    }
}
