package turlo.lesson4;

class Cat extends Animal {

    private boolean swim;
    private int run;
    public static int count;

    public Cat(String name, int run, boolean swim) {
        super();
        this.name = name;
        this.run = run;
        this.swim = swim;
        count++;
    }

    public void catInfo() {
        System.out.println("Имя кота: " + name + " Пробежал: " + run + " метров" + " Проплыл:" + swim);
    }

    public void printCount() {
        System.out.println("Из них котов создано: " + Cat.count);
    }

}