package task12;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

public class Test{
    public static void main(String[] args) {
        // Написать лямбда выражение для интерфейса Printable, который содержит один метод void print().
        Printable printable1 = () -> System.out.println("Hello, world!");
        printable1.print();
    }
}
