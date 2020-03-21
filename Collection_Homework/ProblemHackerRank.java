package Activity_82;

import java.util.ArrayList;
import java.util.List;

public class ProblemHackerRank {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(12);
        list.add(0);
        list.add(1);
        list.add(78);
        list.add(12);
        System.out.println(list);
        //Them element 23 vao index 5
        list.add(5,23);
        System.out.println(list);
        //Remove element at index 0
        list.remove(0);
        System.out.println(list);
        //In dưới dạng 1 dãy các số nguyên phân biệt nhau bằng dấu cách
        for (int i = 0; i <list.size() ; i++) {
            System.out.printf("%d ",list.get(i));
        }
    }
}
