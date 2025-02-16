package az.turingacademy.module03.learning;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Acer\\Desktop\\jbe1210-turing-academy\\src\\main\\java\\az\\turingacademy\\module03\\learning";
        String fileName = "output.txt";

        String[] names = {"A", "B", "C", "D"};

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\" + fileName));
            bw.write("Salam yetqa");
            for (String name : names) {
                bw.write("\n" + name);
            }
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(path + "\\" + fileName));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
