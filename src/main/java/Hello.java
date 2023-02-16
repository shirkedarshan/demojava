import java.io.FileReader;
import java.io.IOException;

public class Hello {
    public static void main(String[] args) {
        String fullPath = args[0];
        String parse = null;
        try {
            parse = String.valueOf(new FileReader(fullPath));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        System.out.println("Hello World : String: " + parse);
    }
}
