package Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        workWithList(myList);
    }

    public static List<Integer> workWithList(List<Integer> list) {
        list.add(10);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(56);
        list.add(-11);
        list.add(105);
        list.add(87);
        list.add(96);
        list.add(7);

        list.remove(0);
        list.remove(new Integer(2));

        int lastElem = list.size() - 1;
        list.remove(lastElem);

        System.out.println(list);
        return list;
    }
}
