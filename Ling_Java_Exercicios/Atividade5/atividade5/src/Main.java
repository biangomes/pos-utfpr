import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> myDoubles = new ArrayList<>();
        myDoubles.add(3.0);
        myDoubles.add(5.0);

        List<String> stringsOfDoubles = new ArrayList<>();

        Long l = 10L;

        for (Double ds : myDoubles) {
            System.out.println(ds.compareTo(30.0));
            stringsOfDoubles.add(String.valueOf(ds));
            System.out.println(stringsOfDoubles);
            l.compareTo(2L);
        }
    }
}