package turlo.lesson2;

public class Home8 {
    public static void main(String[] args) {
        fillDiagonal();
    }
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j]=(i==j || j==(4-i-1))? 1 : (int)(Math.random()*2);
                System.out.printf("%4d",arr[i][j]);

            }
            System.out.printf("\n");
            }
        }}