package turlo.lesson4;

class Dog extends Animal {

    private int swim;
    private int run;
    public static int count;

    public Dog(String name, int run, int swim) {
        super();
        this.name = name;
        this.run = run;
        this.swim = swim;
        count++;
    }

    public void dogInfo() {
        System.out.println("Имя собаки: " + name + " Пробежал: " + run + " метров" + " Проплыл:" + swim);
    }

    public void printCount() {
        System.out.println("Из них собак создано: " + Dog.count);
    }
}