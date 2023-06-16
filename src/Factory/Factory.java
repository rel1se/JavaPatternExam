// Порождающий паттерн,
// Определяет интерфейс создания объектов, позволяя подклассам менять тип создаваемых объектов

package Factory;

public abstract class Factory {
    public CoffeeMachine coffeeMake(){
        CoffeeMachine coffee = doCoffee();
        coffee.grind();
        return coffee;
    }
    protected abstract CoffeeMachine doCoffee();
}
