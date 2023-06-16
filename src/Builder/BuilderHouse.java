package Builder;

public class BuilderHouse implements Builder{
    House house = new House();
    @Override
    public void makeBase(int square) {
        house.buildBase(square);
    }

    @Override
    public void makeRooms(int roomCount) {
        house.buildRooms(roomCount);
    }

    @Override
    public void makeGarage(boolean hasGarage) {
        house.buildGarage(hasGarage);
    }

    @Override
    public House getResult() {
        return house;
    }
}
