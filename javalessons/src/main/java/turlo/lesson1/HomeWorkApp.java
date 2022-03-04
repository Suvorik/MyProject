package turlo.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers ();

    }
        public static void printThreeWords() {
            String a = "Orange";
            String b = "Banana";
            String c = "Apple";
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        public static void checkSumSign() {
            int a = 5;
            int b = 8;
            if (a + b >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }}
         public static void printColor() {
             int value = 200;
             if (value <= 0) {
                 System.out.println("Красный");
             }
                if (value > 0 && value <= 100) {
                    System.out.println("Жёлтый");
                }
                if (value > 100) {
                    System.out.println("Зелёный");
                }}
         public static void compareNumbers () {
                    int a=2;
                    int b=5;
                    boolean c=a>=b;
                    if(c==true){
                        System.out.println("a>=b");
                    }
                    else{
                        System.out.println("a<b");
                    }
                }
            }


