package turlo.lesson4;

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n) {
        int x = food - n;
        if (x < 0)
            return false;
        food -= n;
        return true;
    }

    public void addFood(int food) {
        this.food += food;
    }

    public void info() {
        System.out.println("На тарелке " + food);
    }

}
