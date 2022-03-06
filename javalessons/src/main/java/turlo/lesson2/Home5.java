package turlo.lesson2;

public class Home5 {
    public static void main(String[] args) {
        invertArray();

    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 1, 0, 0, 1, 1};
        int maxArr = arr.length;
        for (int i = 0; i < maxArr; i++) {
            System.out.print(i + "-" + arr[i] + " ");
        }
        System.out.print("");
        for (int i = 0; i < maxArr; i++)

            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
                for (int i1 = 0; i < maxArr; i++) {
                    System.out.print(i + "-" + arr[i] + " ");
                }
            }
    }
}