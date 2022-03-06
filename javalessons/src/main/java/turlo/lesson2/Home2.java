package turlo.lesson2;

public class Home2 {
    public static void main(String[] args) {
        isPositiveOrNegative(-200);
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

}
