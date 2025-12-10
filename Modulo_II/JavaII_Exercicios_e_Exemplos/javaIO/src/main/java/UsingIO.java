import java.io.*;
import java.nio.file.Files;

public class UsingIO {

    private static final String MY_FILE = "C:\\Users\\beana\\Documents\\Pos\\Modulo II" +
            "\\JavaII_Exercicios_e_Exemplos\\file-using-io.txt";
    public UsingIO() throws IOException {
        writeFile();
        readFile();
    }

    private void writeFile() {
        try (final FileReader reader = new FileReader(MY_FILE)) {
            int content = reader.read();
            while (content != -1) {
                System.out.print((char) content);
                content = reader.read();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private void readFile() {
//        1 byte = 8 bits
//        1 char UTF-8 = 1 byte
//        1 char UTF-16 = 2 bytes
        try(final InputStream input = new FileInputStream(MY_FILE)) {
            int content;
            while ((content = input.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (FileNotFoundException ex1) {
            ex1.printStackTrace();
        } catch (IOException ex2) {
            ex2.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        UsingIO usingIO = new UsingIO();
    }
}
