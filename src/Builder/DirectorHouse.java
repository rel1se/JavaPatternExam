package Builder;

public class DirectorHouse {
    public void builtSmallHouse(Builder builder){
        builder.makeBase(60);
        builder.makeRooms(2);
        builder.makeGarage(false);
    }
    public void builtLargeHouse(Builder builder){
        builder.makeBase(200);
        builder.makeRooms(6);
        builder.makeGarage(true);
    }
}
