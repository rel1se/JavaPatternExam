package Factory;

public class Espresso extends CoffeeMachine{
    @Override
    public void grind() {
        System.out.println("Making espresso...");
    }
}
