package ArrayList;

import java.util.*;

public class MultiArrList {
public static void main(String[] args){
    ArrayList<ArrayList<Integer>> Mainlist =new ArrayList<>();
        ArrayList<Integer> list1 =new ArrayList<>();
        list1.add(6);
        list1.add(25);
        list1.add(30);
        list1.add(14);
        list1.add(5);
        list1.add(16);
    ArrayList<Integer> list2 =new ArrayList<>();
        list2.add(6);
        list2.add(25);
        list2.add(30);
        list2.add(14);
        list2.add(5);
        list2.add(16);
    Mainlist.add(list1);
    Mainlist.add(list2);
    System.out.println(Mainlist);
    for(int i=0;i<Mainlist.size();i++){
        System.out.println(Mainlist.get(i));
    }
}
}