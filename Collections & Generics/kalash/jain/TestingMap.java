package kalash.jain;

import java.util.Map;
import java.util.HashMap;

public class TestingMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("kalash", 77);
        map.put("sahil", 175);
        map.put("rohan", 43);
        map.put("darshan", 134);

        System.out.println(map.size());
        System.out.println(map.get("kalash"));
        System.out.println(map.containsKey("sahil"));
        System.out.println(map.containsKey("aman"));
        System.out.println(map.remove("sahil"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n", key, map.get(key));
        }
    }
}
