package task19;

import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        // Написать лямбда выражение, которое возвращает случайное число от 0 до 10.
        // Используем функциональный интерфейс Supplier.
        Supplier<Integer> random = () -> (int)(Math.random()*11);
        System.out.println(random.get());
    }
}
