package turlo.lesson4;

public class MainAnimal {
    public static void main(String[] args) {

        Animal animal = new Animal("Описание кота");
        Cat cat = new Cat("Борис", 200, false);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal animal2 = new Animal("Описание собаки");
        Dog dog = new Dog("Тузик", 500, 10);
        animal2.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

        animal.printCount();
        dog.printCount();
        cat.printCount();
    }
}
