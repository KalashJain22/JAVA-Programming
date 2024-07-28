package kalash.jain.collection;

import java.util.List;
import java.util.ArrayList;

public class TestingList {
    public static void main(String[] args) {
        List<String> strlist = new ArrayList<>();

        strlist.add("kalash");
        strlist.add("jain");
        // strlist.add(54);

        strlist.add(1, " ");
        strlist.remove(0);

        if(strlist.contains("jain")) {
            System.out.println(strlist.indexOf("jain"));
        }

        for(int i = 0; i <  strlist.size(); i++) {
            System.out.print(strlist.get(i));
        }

        for(String str : strlist) {
            System.out.print(str);
        }
    }
}