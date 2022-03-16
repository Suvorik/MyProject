package turlo.lesson4;

class Animal {

    public String name;
    public static int count;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public Animal() {
    }

    public void animalInfo() {
        System.out.println();

    }

    public void printCount() {
        System.out.println("Всего животных создано: " + Animal.count);


    }

}