import java.util.Hashtable;
import java.util.Map;

public class case05 {
    public static void main(String[] args) {
        Map<Integer, String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table);
    }
}
