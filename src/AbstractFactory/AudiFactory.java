package AbstractFactory;

public class AudiFactory implements CarsFactory{
    @Override
    public Coupe createCoupe() {
        return new AudiCoupe();
    }

    @Override
    public Sedan createSedan() {
        return new AudiSedan();
    }
}
