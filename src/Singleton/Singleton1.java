// Порождающий паттерн проектирования.
// Он позволяет гарантировать, что будет существовать ровно один объект существующего класса.
// Реализация через метод getInstance() с ленивой инициализацией

package Singleton;

public class Singleton1 {
    private static Singleton1 instance;
    public static synchronized Singleton1 getInstance(){
        if (instance == null){
            instance = new Singleton1();
            return instance;
        }
        return instance;
    }
}
