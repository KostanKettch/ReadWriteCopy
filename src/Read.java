import java.io.*;

public class Read {
    public Read(File input) {
        try (Reader reader = new InputStreamReader(new FileInputStream(input))) {
            int length;
            while ((length = reader.read()) != -1) {
                System.out.print((char) length);
            }
            System.out.println();
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Возникла ошибка при чтении файла " + ex.getMessage());
        }
    }
}
