package filetext_sumnumbers;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File mynumber = new File("numbers.txt");
            mynumber.createNewFile();
            System.out.println("File created " +mynumber.getName());

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
