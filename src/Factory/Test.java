package Factory;

public class Test {
    public static void main(String[] args) {
        EspressoCreator espressoCreator = new EspressoCreator();
        espressoCreator.coffeeMake();
        CappucinoCreator cappucinoCreator = new CappucinoCreator();
        cappucinoCreator.coffeeMake();
    }
}
