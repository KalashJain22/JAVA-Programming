package kalash.jain.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TestingCollection {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();

        numList.add(5);
        numList.add(8);
        numList.add(2);
        numList.add(-76);
        Utility.print(numList);

        Collections.sort(numList);
        Utility.print(numList);

        Collections.reverse(numList);
        Utility.print(numList);

        List<Integer> unmodifiable = Collections.unmodifiableList(numList);
        unmodifiable.add(87);
    }
}