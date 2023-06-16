// Порождающий паттерн
// Позволяет создавать семейства определенных объектов.
// Фактически является расширением паттерна «Фабричный метод».


package AbstractFactory;

public interface CarsFactory {
    Sedan createSedan();
    Coupe createCoupe();
}
