package turlo.lesson2;

public class Home41 {
    public static void main(String[] args) {

        LeapYear();
    }

    public static boolean LeapYear() {
        int год = 500;
        System.out.println();
        if ((год % 400 == 0) || ((год % 4 == 0) && (год % 100 != 0)))
            System.out.println(год + " -" + " високосный год");
        else
            System.out.println(год + " -" + " невисокосный год");


        return false;
    }
}