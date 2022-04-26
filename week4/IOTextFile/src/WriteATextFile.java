import java.io.FileWriter;
import java.io.IOException;

public class WriteATextFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Hello.text");
            writer.write("Hello !!! My name is Lala. I live in LalaLand. I'm green. ");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


