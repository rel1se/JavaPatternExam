package task20;

public class Test {
    public static void main(String[] args) {
        // Написать лямбда выражение для интерфейса Printable, который содержит один метод void print().
        // Переделать класс использующий Printable используя ссылку на статический метод
        Printable printable2 = () -> System.out.println("Hello, world!");
        printable2.print();
        Printable printable3 = MyPrintable::print;
        printable3.print();
    }
}
