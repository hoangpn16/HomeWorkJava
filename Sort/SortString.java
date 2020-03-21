package Sort;

import java.util.List;
import java.util.*;

public class SortString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        // add elements to list
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("PHP");
        list.add("Python");

        // Ascending
        Collections.sort(list);
        System.out.println(list);


        //Descending
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(list);
    }
}
