package Stackkk;
import java.util.Stack;
public class reverseStr {
    public static String revStr(String str){
        Stack<Character> s =new Stack<>();
        int i=0;
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder Result=new StringBuilder();
        while(!s.isEmpty()){
            char curr=s.pop();
            Result.append(curr);
        }
        return Result.toString();


    }
    public static void main(String[] args) {
        String str ="abc";
        String Res=revStr(str);
        System.out.println(Res);
    }
}
