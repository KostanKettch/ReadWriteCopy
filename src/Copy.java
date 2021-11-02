import java.io.*;

public class Copy {
    public Copy(File input, File output) {
        try (Reader fis = new InputStreamReader(new FileInputStream(input));
             Writer fos = new OutputStreamWriter(new FileOutputStream(output))) {
            char[] buffer = new char[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Возникла ошибка при копировании " + ex.getMessage());
        }
    }
}