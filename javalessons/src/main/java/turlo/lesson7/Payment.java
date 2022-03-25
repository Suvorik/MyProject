package turlo.lesson7;

import java.util.Arrays;

public class Payment {
    private String[] name;
    private int[][] price;

    public Payment() {
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int[][] getPrice() {
        return price;
    }

    public void setPrice(int[][] price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return Arrays.toString(name) + Arrays.deepToString(price);
    }
}

