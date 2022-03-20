package turlo.lesson6;

import static java.lang.Integer.valueOf;

public class Main {
    public static void main(String[] args) {
        String[][] stringArray0 = new String[][]{
                {"2", "7", "8", "5"},
                {"7", "3", "i", "3"},
                {"2", "4", "3", "6"},
                {"1", "2", "9", "8"}
        };
        String[][] stringArray1 = new String[][]{
                {"8", "4.2", "6", "7"},
                {"5", "2", "4", "8"},
                {"6", "2", "3", "4"},
                {"7", "2", "2", "3"}
        };
        String[][] stringArray2 = new String[][]{
                {"1", "5", "9", "8"},
                {"7", "8", "2", "6"},
                {"5", "2", "8", "8"},
                {"5", "5", "7", "5"}
        };
        String[][] stringArray3 = new String[][]{
                {"3", "5", "7", "8"},
                {"1", "1", "2", "4"},
                {"3", "5", "7", "8"}
        };
        String[][] stringArray4 = new String[][]{
                {"6", "4", "6", "8"},
                {"2", "6", "4", "2"},
                {"5", "5", "4", "6", "8"}
        };
        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray0));
        } catch (ExceptionSize | ExceptionData e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray1));
        } catch (ExceptionSize | ExceptionData e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray2));
        } catch (ExceptionSize | ExceptionData e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray3));
        } catch (ExceptionSize | ExceptionData e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray4));
        } catch (ExceptionSize | ExceptionData e) {
            System.out.println(e);
        }
    }

    private static int transformAndSum(String[][] in) throws ExceptionSize, ExceptionData {
        int arrMass = 4;
        int sum = 0;
        if (in.length != 4) {
            throw new ExceptionSize(String.format("Размерность массива должна быть 4х4.", arrMass, arrMass));
        }
        for (int i = 0; i < in.length; i++) {
            if (in[i].length != 4) {
                throw new ExceptionSize(String.format("Размерность массива должна быть 4х4.", arrMass, arrMass));
            }
        }
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                try {
                    sum += valueOf(in[i][j]);
                } catch (NumberFormatException e) {
                    throw new ExceptionData(String.format("В позиции [%d][%d] массива находится не целое число %s."
                            , i, j, in[i][j]));
                }
            }
        }
        return sum;
    }

}
