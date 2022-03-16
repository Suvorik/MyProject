package turlo.lesson4;

public class MainCatsPlates {
    public static void main(String[] args) {

        Cats[] cats = {new Cats("Вася", 11), new Cats("Кузя", 12),
                new Cats("Барс", 13), new Cats("Мурка", 14),
                new Cats("Уголёк", 15)};
        Plate plate = new Plate(10);

        for (Cats cat : cats) {
            cat.eat(plate);
            cat.info();
            plate.addFood(5);
            plate.info();
        }


    }
}
