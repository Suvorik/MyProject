package turlo.lesson2;

public class Home4 {
    public static void main(String[] args) {
        printWordNTimes("Задание ", 4);
    }

    public static void printWordNTimes(String word, int times) {

        for (int i = 0; i < 4; i++) {
            System.out.print(word);
            System.out.println(times);
        }
    }

}
