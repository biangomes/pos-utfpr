import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingNIO2 {

    private static final String MY_FILE = "C:\\Users\\beana\\Documents\\Pos\\Modulo II" +
            "\\JavaII_Exercicios_e_Exemplos\\file-using-nio2.txt";


    private void writeFile() {
        final Path path = Paths.get(MY_FILE);
        System.out.println(path);
    }

    private void readFile() {

    }
    public static void main(String[] args) {
        new UsingNIO2();
    }
}
