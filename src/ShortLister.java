import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ShortLister {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);

        File selectedFile = fileChooser.getSelectedFile();
        if (selectedFile != null && selectedFile.isFile()) {
            try {
                Scanner scanner = new Scanner(selectedFile);
                ArrayList<String> words = new ArrayList<>();
                while (scanner.hasNext()) {
                    words.add(scanner.next());
                }
                scanner.close();

                ShortWordFilter shortWordFilter = new ShortWordFilter();
                ArrayList<String> shortWords = Main.collectAll(words.toArray(new String[0]), shortWordFilter);

                System.out.println("Short words: " + shortWords);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}