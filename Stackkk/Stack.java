package Stacks;

import java.util.ArrayList;

//IMPLEMENTATIONS USING ARRAYLIST AND LINKED LIST
//ArrayLIST
public class Stack {
    static class StackAL{
        static ArrayList<Integer> list=new ArrayList<>();
        public boolean isempty(){
                return list.size()==0;
        }
        public void push(int data){
            list.add(data);
        }
        public int pop(){
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public int peek(){
           return list.get(list.size()-1);
        }
        public void print(){
            System.out.println(list);
        }
    }
    //LINKEDLIST IMPLEMENTATION
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    public boolean isEmpty(){
        return head==null;
    }
    public void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;

    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
    public void print(Node head){
        if(isEmpty()){
            System.out.println("EMPTY LL");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    
    public static void main(String[] args){
       // StackAL s=new StackAL();
       Stack s=new Stack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.print(head);
     //   System.out.println(s.pop());
        s.print(head);
        System.out.println(s.peek());

        
    }
}
