import java.io.*;

public class Copy {
    public Copy(File input, File output) throws IOException {

        Reader fis = new InputStreamReader(new FileInputStream(input));
        Writer fos = new OutputStreamWriter(new FileOutputStream(output));

        char[] buffer = new char[1024];
        int length;

        while ((length = fis.read(buffer)) > 0) {

            fos.write(buffer, 0, length);

        }
        fis.close();
        fos.close();
    }
}