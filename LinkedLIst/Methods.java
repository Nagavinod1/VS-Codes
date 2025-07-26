package LinkedLIst;

import java.util.*;
public class Methods {
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
        public static int size;
        public void addFirst(int data){
            Node newNode=new Node(data);
            size++;
            if(Head==null){
                Head=Tail=newNode;

                return;
            }
            newNode.next=Head;
            Head=newNode;
        }
        public void addLast(int data){
            Node newNode=new Node(data);
            size++;
            if(Head==null){
                Head=Tail=newNode;
                return ;

            }
            Tail.next=newNode;
            Tail=newNode;

        }
        public void print(){
            Node temp=Head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public void add(int index,int data){
            
            Node newNode=new Node(data);
            size++;
            //for empty ll
            if(index==0){
                addFirst(data);;
                return;
            }
            //temp is a pointer not an object
            Node temp=Head;
            int i=0;
            while(i<index-1){
                temp=temp.next;
                i++;
            }
            //points prev.next node adress to the newNode.next
            newNode.next=temp.next;
            //newNode data points towards the previous
            temp.next=newNode;

        }
        public void removeFirst(){
            if(size==0){
                System.out.println("LinkedList is Empty");
                return;
            }
            else if(size==1){
                Head=Tail=null;
                size=0;
                return; 
            }
            else{
            //more than one node cases
            Head=Head.next;
            size--;
            return ;
            }

        }
        public void removeLast(){
            if(size==0){
                System.out.println("LL is empty");
                return;
            }
            else if(size==1){
                Head=Tail=null;
                return;
            }
            else{
                Node prev=Head;
                for(int i=0;i<size-2;i++){
                    prev=prev.next;
                }
                prev.next=Tail.next; //or null
                size--;
                return;
            }
        }
        //Iterator Search
        public int ItrSearch(int val){
            Node temp=Head;
            int i=0;
            while(temp!=null){
                if(temp.data==val){
                    return i;
                }
                temp=temp.next;
                i++;
            }
            //val not found
            return -1;

        }
        //REcursive search
        public int helper(Node Head,int key){
            if(Head==null){
                return -1;
            }
            if(Head.data==key){
                return 0;

            }
            
            int idx=helper(Head.next, key);
            if(idx==-1){
                return -1;
            }
            return idx+1; 
        }
        public int RecSearch(int key){
            return helper(Head, 3);
        }
        //Reverse a LL
        public void Reverse(){
            Node prev=null;
            Node curr=Tail=Head;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Head=prev;
        }
        //Palindrome or not using LL
        public Node Findmid(Node Head){
            Node slow=Head;
            Node fast=Head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
        public boolean Palindrome(){
            //find mid
            Node Mid=Findmid(Head);
            //Reverse the LL
            while(Head==null||Head.next==null){
                return true;//case for empty and single element is always a palindrome
            }
            Node prev=null;
            Node curr=Mid;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;

            }
            
        //case after reverse prev become head as it become last position to first position in second half 
            Node right=prev;
            Node left=Head;
            while(right!=null){
                if(left.data!=right.data){
                    return false;
                }
                left=left.next;
                right=right.next;

            }
            return true;


        }

        //FIND AND REMOVE nth index from last
        public void RemoveFromLast(int idx){
            //cal size for sifferent situation
            int sz=0;
            Node temp=Head;
            while(temp!=null){
                temp=temp.next;
                sz++;
            }
            if(sz==idx){
                Head=Head.next;
                return;
            }
            int i=1;
            int iToFind=sz-idx;
            Node prev=Head;
            while(i<iToFind){
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;
            return;
        }
        public Node getMid(Node Head){
        Node slow=Head;
        Node fast=Head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;//mid node
    }
    public Node merge(Node h1,Node h2){
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
    public Node mergeSort(Node Head){
        if(Head==null ||Head.next==null){
            return Head;
        }
        //find mid
        Node Mid=getMid(Head);
        Node RightHalf=Mid.next;
        Mid.next=null;
        //mergesort of left and right
        Node newleft=mergeSort(Head);
        Node newRight=mergeSort(RightHalf);
        //merge the lists
        return merge(newleft, newRight);


    }
    //zigZag using LL
    public void zigZag(){
        //find mid with first half end as mid
        Node slow=Head;
        Node fast=Head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        Node Mid=slow;
        //reverse the 2nd half
        Node curr=Mid.next;
        Mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        Node left=Head;
        Node right =prev;
        //zigzag merge
        Node nextL,nextR;
        while(left!=null&&right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

        //update the left,right
        left=nextL;
        right=nextR;
        }

    }
    public static void main(String[] argd){
        Methods ll = new Methods();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addLast(1);
        ll.add(2,3);

        System.out.println(size);
        ll.print();
       // ll.removeFirst();
      // ll.removeLast();
       // System.out.println(size);
      //  ll.print();
      //  System.out.println(ll.ItrSearch(4));
       // System.out.println("AT INDEX : "+ll.RecSearch(3));
       // ll.Reverse();
       // ll.print();
      //  System.out.println(size);
      //  ll.RemoveFromLast(3);
        //ll.print();
        //System.out.println("LL PALINDROME STATUS : "+ll.Palindrome());
        //Head=ll.mergeSort(Head);
        ll.zigZag();
        ll.print();

    }
}
