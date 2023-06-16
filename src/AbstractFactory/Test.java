package AbstractFactory;

public class Test {
    public static void main(String[] args) {
        CarsFactory factory1;
        factory1 = new AudiFactory();
        factory1.createCoupe();
        factory1.createSedan();
    }
}
