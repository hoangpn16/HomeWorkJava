package Activity_82;

import java.util.ArrayList;
import java.util.List;

public class List_HomeWork {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        System.out.println(list);
        //Them Yellow vao vi tri thu 3
        list.add(3,"Yellow");
        System.out.println(list);
    }
}
