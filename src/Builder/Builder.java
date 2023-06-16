// Порождающий паттерн
// Разделяет создание объекта на отдельные шаги,
// а также позволяет использовать один и тот же код создания для получения различных представлений


package Builder;

public interface Builder {
    void makeBase(int square);
    void makeRooms(int roomCount);
    void makeGarage(boolean hasGarage);
    House getResult();
}
