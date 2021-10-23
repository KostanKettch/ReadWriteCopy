import java.io.*;
import java.nio.charset.StandardCharsets;

public class Write {
    public Write(String input, File output) throws IOException {
        Writer writer = new OutputStreamWriter(new FileOutputStream(output));
        writer.write(input);
        writer.close();
    }
}
