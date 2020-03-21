package List_LinkedList_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lesson3 {
    public static void main(String[] args) {
        List<Integer> old = new ArrayList<>();
        old.add(1);
        old.add(1);
        old.add(2);
        old.add(3);

        Set<Integer> set=new HashSet<>();
        set.addAll(old);
        System.out.println(set);
    }
}
