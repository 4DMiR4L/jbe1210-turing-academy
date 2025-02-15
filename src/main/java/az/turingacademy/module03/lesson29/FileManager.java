package az.turingacademy.module03.lesson29;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public static void main(String[] args) {
        String path = "C:\\Users\\Acer\\Desktop\\jbe1210-turing-academy\\src\\main\\java\\az\\turingacademy\\module03\\lesson29";
        String fileName = "file.txt";

        try {
            FileWriter fileWriter = new FileWriter(path + "/" + fileName);
            fileWriter.write("Hello World");
            fileWriter.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("IO exception");
        }
    }
}
