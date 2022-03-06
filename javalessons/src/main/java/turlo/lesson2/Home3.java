package turlo.lesson2;

public class Home3 {
    public static void main(String[] args) {

        System.out.println("Число отрицательное: " + isNegative(0));
    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;

        } else {
            return false;

        }
    }

}

