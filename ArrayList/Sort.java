package ArrayList;
import java.util.*;
public class Sort {
    public static void main(String[] args){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(6);
        list.add(25);
        list.add(30);
        list.add(14);
        list.add(5);
        list.add(16);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
}
}
