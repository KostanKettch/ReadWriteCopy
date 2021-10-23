import java.io.*;

public class Read {
    public Read(File input) throws IOException {
        Reader reader = new InputStreamReader(new FileInputStream(input));
        int length;
        while ((length = reader.read()) != -1) {
            System.out.print((char) length);
        }
        System.out.println();
        reader.close();
    }
}
