package turlo.lesson7;

import java.io.*;

public class AppData {
    public static void main(String[] args) throws IOException {
        Payment();
    }

    public static void Payment() {
        Payment payment = new Payment();
        payment.setName(new String[]{"Bread", "Butter", "Tea"});
        payment.setPrice(new int[][]{{300, 400, 115}, {280, 420, 100}});
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("test.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < payment.getName().length; i++) {
            writer.write(payment.getName()[i] + ";");
        }
        writer.write("\n");
        for (int i = 0; i < payment.getPrice().length; i++) {
            for (int j = 0; j < payment.getPrice()[i].length; j++) {
                writer.write(payment.getPrice()[i][j] + ";");
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
            System.out.println((str1));
        }
        try {
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
