package task17;

import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        // Написать лямбда выражение, которое принимает на вход объект типа HeavyBox и выводит на консоль сообщение “Отгрузили ящик с весом n”.
        // “Отправляем ящик с весом n” Используем функциональный интерфейс Consumer и метод по умолчанию andThen.
        HeavyBox box = new HeavyBox(500);
        Consumer<HeavyBox> res = (b) -> System.out.println("Отгрузили ящик с весом " + b.getN());
        res.andThen(b -> System.out.println("Отправляем ящик с весом " + b.getN())).accept(box);
    }
}
