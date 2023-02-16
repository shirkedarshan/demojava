
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Hello {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        String fullPath = args[0];
        String parse = String.valueOf(parser.parse(new FileReader(fullPath)));
        System.out.println("Hello World : String: " + parse);
    }
}
