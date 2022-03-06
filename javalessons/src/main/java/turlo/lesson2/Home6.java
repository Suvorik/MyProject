package turlo.lesson2;

public class Home6 {
    public static void main(String[] args) {
        fillArray();
    }

    public static void fillArray() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }


    }
}