package List_LinkedList_HashSet;

import java.util.ArrayList;
import java.util.List;

public class Lesson1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(3,4);

        System.out.println(list);

        list.remove(1);

        System.out.println(list);

        int x = list.get(1);
        System.out.println(x);

    }
}
