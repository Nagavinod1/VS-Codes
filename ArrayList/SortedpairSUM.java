package ArrayList;
//height is here a list name dont panic about it

import java.util.*;
public class SortedpairSUM {
    public static Boolean SortP(ArrayList<Integer> height,int target){
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                if(height.get(i)+height.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
    //2 pointer technique
    public static Boolean TwoPtrSort(ArrayList<Integer> height,int target){
        int lp=0,rp=height.size()-1;
        while(lp<rp){
            if(height.get(lp)+height.get(rp)==target){
                return true;
            }
            if(height.get(lp)+height.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
            
        }
        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> height =new ArrayList<>();
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
    int target=5;
    System.out.println(SortP(height, target));
    System.out.println(TwoPtrSort(height, target));
}
}