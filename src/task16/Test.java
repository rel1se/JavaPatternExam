package task16;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        // Написать программу, которая проверяет,
        // что строка начинается буквой “J”или “N” и заканчивается “A”.
        // Используем функциональный интерфейс Predicate.
        Predicate<String> res = (text) -> text.startsWith("J");
        System.out.println(res.or((text) -> text.startsWith("N")).and((text) -> text.endsWith("A")).test("NavA"));
    }
}
