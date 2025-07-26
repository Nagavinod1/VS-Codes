package LinkedLIst;
public class isCycleorNot {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static Node Head;
    public static Node Tail;
    public static boolean isCycle(){
        Node slow=Head;
        Node fast=Head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        Head=new Node(1);
        Head.next=new Node(2);
        Head.next.next=new Node(3);
        Head.next.next.next=new Node(4);
        System.out.println(isCycle());
    }
}
