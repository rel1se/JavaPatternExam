package Builder;

public class Test {
    public static void main(String[] args) {
        DirectorHouse directorHouse = new DirectorHouse();
        BuilderHouse builderHouse = new BuilderHouse();
        directorHouse.builtLargeHouse(builderHouse);
        House house = builderHouse.getResult();
        System.out.println(house);
    }
}
