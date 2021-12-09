package HomeWork27;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Song song = new Song();
        song.setName("Hello");
        song.setExecutor("NoName");
        song.setGenre("Jazz");
        song.setText("Nothing else matters Metallica «Power ballad» So close, no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And nothing else matters Never opened myself this way\n" +
                "Life is ours, we live it our way\n" +
                "All these words I don't just say\n" +
                "And nothing else matters");
        FileWriter fileWriter = new FileWriter("file1.txt");
        fileWriter.write(
                song.getName() + "\n" +
                    song.getExecutor() + "\n" +
                    song.getGenre() + "\n" +
                    song.getText());
        fileWriter.close();
        Song song2 = new Song();
        FileReader fileReader = new FileReader("file1.txt");
        Scanner sc = new Scanner(fileReader);
        int i = 1;
        while (sc.hasNextLine()){
            switch (i) {
                case 1 -> song2.setName(sc.nextLine());
                case 2 -> song2.setExecutor(sc.nextLine());
                case 3 -> song2.setGenre(sc.nextLine());
                default -> song2.addText(sc.nextLine());
            }
            i++;
        }
        System.out.println(song2);
        fileReader.close();

    }
}
