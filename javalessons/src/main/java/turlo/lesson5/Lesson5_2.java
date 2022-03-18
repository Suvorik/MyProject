package turlo.lesson5;

public class Lesson5_2 {
    public static void main(String[] args) {
        System.out.println("Создание коробки №1");
        Box box1 = new Box();
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        System.out.println("Вес коробки №1: " + box1.getWeight());
        System.out.println("Создание коробки №2");
        Box box2 = new Box();
        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());
        System.out.println("Вес коробки №2: " + box2.getWeight());

        System.out.println("Массы коробок " + (box1.compare(box2) ? "одинаковы" : "не одинаковы") + ".");
        System.out.println("В коробке №1 хранятся " + box1.getProduct().get(0).getClass().getSimpleName());
        Box box3 = new Box();
        System.out.println("Создание коробки №3");
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());

        System.out.println("Вес коробки №3: " + box3.getWeight());
        System.out.println("В коробке №3 хранятся " + box3.getProduct().get(0).getClass().getSimpleName());
        box1.shiftSingleItem(box3);
        System.out.println("Вес коробки №3: " + box3.getWeight());
        System.out.println("Вес коробки №1: " + box1.getWeight());

        try {
            box2.shiftSingleItem(box3);
        } catch (Сomparison e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки №3: " + box3.getWeight());
        System.out.println("Вес коробки №2: " + box2.getWeight());
        try {
            box3.add(new Orange());
            box3.add(new Orange());
            box3.add(new Orange());
        } catch (Сomparison e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки №3: " + box3.getWeight());
    }
}

