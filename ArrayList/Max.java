package ArrayList;
import java.util.*;
public class Max {
    public static void main(String[] args){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(6);
        list.add(25);
        list.add(30);
        list.add(14);
        list.add(5);
        list.add(16);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            
            max=Math.max(max,list.get(i));
        }
        System.out.println(" MAX IS : "+ max);
            
        }

    }

