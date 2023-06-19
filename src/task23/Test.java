package task23;

public class Test {
    // Создать класс реализующий Runnable
    // a. Создать класс, реализующий интерфейс Runnable.
    // b. Переопределить run() метод. Создать цикл for. В цикле распечатываем значения от 0 до 100 делящиеся на 10 без остатка.
    // c. Используем статический метод Thread.sleep(), чтобы сделать паузу.
    // d. Создать три потока, выполняющих задачу распечатки значений.
    public static void main(String[] args) {
        NewRunnable run = new NewRunnable();
        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        Thread thread3 = new Thread(run);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
