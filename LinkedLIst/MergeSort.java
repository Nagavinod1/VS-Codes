package LinkedLIst;

import java.util.LinkedList;

public class MergeSort {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;//mid node
    }
    public static Node merge(Node h1,Node h2){
        Node MergeLL=new Node(-1);
        Node temp=MergeLL;
        while(h1!=null&&h2!=null){
            if(h1.data<=h2.data){
                temp.next=h1;
                h1=h1.next;
                temp=temp.next;
            }
            else{
                temp.next=h2;
                h2=h2.next;
                temp=temp.next;

            }
            
        }
        while(h1!=null){
            temp.next=h1;
            h1=h1.next;
            temp=temp.next;
        }
        while(h2!=null){
            temp.next=h2;
            h2=h2.next;
            temp=temp.next;
        }
        return MergeLL.next;//as head is dummy Node(-1)
    }
    public static Node mergeSort(Node Head){
        if(head==null ||head.next==null){
            return head;
        }
        //find mid
        Node Mid=getMid(head);
        Node RightHalf=Mid.next;
        Mid.next=null;
        //mergesort of left and right
        Node newleft=mergeSort(head);
        Node newRight=mergeSort(RightHalf);
        //merge the lists
        return merge(newleft, newRight);


    }
    public static void main(String[] args){
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        System.out.println(ll);
        mergeSort(head);
        System.out.println(ll);

    }
}
