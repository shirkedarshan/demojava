import java.io.FileReader;
import java.io.IOException;

public class Hello {
    public static void main(String[] args) throws IOException {
        String fullPath = args[0];
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fullPath);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.print((char) i);
        }
        fileReader.close();

        System.out.println("Hello World : String: " + fileReader);
    }
}
