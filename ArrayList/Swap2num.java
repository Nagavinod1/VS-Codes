package ArrayList;
import java.util.*;
public class Swap2num {
    public static void Swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        

    }
    public static void main(String[] args){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(6);
        list.add(25);
        list.add(30);
        list.add(14);
        list.add(5);
        list.add(16);
        System.out.println(list);
        Swap(list, 2, 4);
        System.out.println(list);



    }
}
