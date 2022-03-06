package turlo.lesson2;

public class Home1 {
    public static void main(String[] args) {
        System.out.println("попадает в диапазон чисел 10-20: " + within10and20(3, 10));
    }

    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
