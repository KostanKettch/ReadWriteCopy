import java.io.*;
import java.nio.charset.StandardCharsets;

public class Write {
    public Write(String input, File output) {
        try (Writer writer = new OutputStreamWriter(new FileOutputStream(output))) {
            writer.write(input);
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Возникла ошибка при чтении файла " + ex.getMessage());
        }
    }
}
