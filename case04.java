import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class case04 {
    public static void main(String[] args) {
        Map<Integer, String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
        Map<Integer, String> map = new HashMap<>();
        map.put(11, "один один");
        map.put(1, "два");
        map.put(2, "один");
        System.out.println(map); // {1=два, 2=один, 11=один один}
    }
}
