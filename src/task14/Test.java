package task14;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        // Создать лямбда выражение, которое проверяет, что строка не пуста,
        // используя функциональный интерфейс Predicate.
        Predicate<String> predicate = (text) -> !text.equals("");
        System.out.println(predicate.test(""));
    }
}
