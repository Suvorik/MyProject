package turlo.lesson7;

import java.util.Arrays;

public class Cat {
    private String[] color;
    private int[][] weight;

    public Cat(String[] color, int[][] weight) {
        this.color = color;
        this.weight = weight;
    }

    public Cat() {
    }

    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public int[][] getWeight() {
        return weight;
    }

    public void setWeight(int[][] weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return Arrays.toString(color) + Arrays.deepToString(weight);
    }
}

