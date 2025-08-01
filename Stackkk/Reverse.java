package Stackkk;
import java.util.Stack;
public class Reverse {
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void reverSe(Stack<Integer> s){
        while(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverSe(s);
        pushAtBottom(s,top);
    }
     public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverSe(s);
       System.out.println(s.peek());
    }
   
}
