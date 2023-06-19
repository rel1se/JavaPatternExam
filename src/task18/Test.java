package task18;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        // Написать лямбда выражение, которое принимает на вход число и
        // возвращает значение “Положительное число”, “Отрицательное число” или  “Ноль”.
        // Используем функциональный интерфейс Function.
        Function<Integer, String> num = (n) -> {
            if (n < 0) return "Отрицательное число";
            else if (n > 0) return "Положительное число";
            return "Ноль";
        };
        System.out.println(num.apply(10));
    }
}
