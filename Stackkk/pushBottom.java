package Stackkk;
import java.util.*;

public class pushBottom {
    public static void pushBot(Stack s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushBot(s, data);
        s.push(top);
    }
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        pushBot(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
