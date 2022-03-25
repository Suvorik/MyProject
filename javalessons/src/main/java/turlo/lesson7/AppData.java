package turlo.lesson7;

import java.io.*;

public class AppData {
    public static void main(String[] args) throws IOException {
        Cat();
    }

    public static void Cat() {
        Cat cat = new Cat();
        cat.setColor(new String[]{"Barsik", "Myrka", "Kisa"});
        cat.setWeight(new int[][]{{3, 4, 5}, {1, 2, 3}});
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new File("test.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < cat.getColor().length; i++) {
            writer.write(cat.getColor()[i] + ";");
        }
        writer.write("\n");
        for (int i = 0; i < cat.getWeight().length; i++) {
            for (int j = 0; j < cat.getWeight()[i].length; j++) {
                writer.write(cat.getWeight()[i][j] + ";");
            }
            writer.write("\n");
        }
        writer.close();
        BufferedReader csvReader = null;
        try {
            csvReader = new BufferedReader(new FileReader("test.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String str1 = "";
        while (true) {
            try {
                if (!((str1 = csvReader.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            // String[] data = str1.split(",");
            System.out.println((str1));
        }
        try {
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
