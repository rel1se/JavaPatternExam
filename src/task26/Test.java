package task26;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Существует некий ArrayList<String>,
        // напишите реализацию удаления каждого 5-го элемента. Используйте потоки API stream
        ArrayList<String> array = new ArrayList<>();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");
        array.add("f");
        array.add("g");
        array.add("h");
        array.add("s");
        array.add("q");
        array.stream().filter(el -> (array.indexOf(el) + 1) % 5 != 0).forEach(el -> System.out.println(el));
    }
}
