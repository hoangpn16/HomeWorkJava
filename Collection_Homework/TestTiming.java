package Collection_Homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestTiming {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10000 ; i++) {
            list.add(i);
        }
        long start=System.nanoTime();
        list.get(5000);
        list.get(4545);
        list.get(4567);
        long end=System.nanoTime();
        long result=end-start;
        System.out.println("RunningList's time : "+result);
        
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addAll(list);
        long stars=System.nanoTime();
        linkedList.get(5000);
        linkedList.get(4545);
        linkedList.get(4567);
        long ends=System.nanoTime();
        System.out.println("RunningLinkedList's time : "+(ends-stars));


    }
}
