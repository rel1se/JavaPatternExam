package task13;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        // Создать лямбда выражение, которое возвращает значение true,
        // если строка не null, используя функциональный интерфейс Predicate
        Predicate<String> res1 = (text) -> text != null;
        System.out.println(res1.test("hell"));
    }
}
