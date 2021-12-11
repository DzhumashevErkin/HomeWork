package HomeWork28;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("file2.txt");
        fileWriter.write("Nothing else matters Metallica «Power ballad» So close, no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And nothing else matters Never opened myself this way\n" +
                "Life is ours, we live it our way\n" +
                "All these words I don't just say\n" +
                "And nothing else matters");


        fileWriter.close();
        File file = new File("file2.txt");

        try {
            System.out.println(file.length());
            proverkaNaRazmer(file);
        }
        catch (FileNotFoundException fileEx){
            System.out.println("Нет файла " + fileEx.getMessage());

        }
        catch (IllegalStateException ise){
            System.out.println("Размер больше 100 " + ise.getMessage());

        }


    }


    static void proverkaNaRazmer(File file) throws IllegalStateException , FileNotFoundException{
        Scanner sc = new Scanner(file);
        if(file.length()>100)
            throw new IllegalStateException();
    }

}
