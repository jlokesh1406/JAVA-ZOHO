//dsa-data structure is way of organinzing data in computer so that it is efficient handle the data
//what do mean by efficient? ==> easy store,search and retrieve,modify the data

//time complextity :
// 1.bigo (O(1))
// 2.omege
// 3.theta
// O(1) <  O(log n) < O(n) < O(n log n)  < O(x^2)  < O(X^3)  < O(2^x) < O(n!)


//1.List Implementation using Array()
/*
import java.util.*;
class DynamicArray
{
    int arr[];
    static  int size = 0;
    int INITIAL_CAPACITY = 10; 
    DynamicArray() {
        size = 0;
        arr = new int[INITIAL_CAPACITY]; // Use INITIAL_CAPACITY
    }
    public void add(int num)
    {
        if(size==INITIAL_CAPACITY)
        {
            expandArray();
        }
        arr[size++]=num;
    }
    public void expandArray()
    {
        INITIAL_CAPACITY*=2;
        Arrays.copyOf(arr,INITIAL_CAPACITY);
    }
    public void delete()
    {
        size--;
    }
    public void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void insert(int pos,int num)
    {
        if(size==INITIAL_CAPACITY)
        {
            expandArray();
        }
        for(int i=size-1;i>=pos;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[pos]=num;
        size+=1;
    }
    public void deleteAt(int pos,int num)
    {
         //1 7 2 3
        for(int i=pos+1;i<size;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[pos]=num;
        size-=1;
    }
}

public class main1 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DynamicArray linkedlist = new DynamicArray();
        for(int i=0;i<3;i++)
        {
            linkedlist.add(scan.nextInt());
        }
        linkedlist.display();
        linkedlist.insert(1,7);
        linkedlist.display();
        linkedlist.deleteAt(1, 7);
        linkedlist.display();

    }
}
*/
//2.Linkedlist
//-- Node contians data and pointer is called as node data any thick like string ,integer,float...
//-- starting node is head
//-- ending node is tail
//-- ending node pointer should point to null value  

// -Array:A fixed-size, contiguous block of memory with fast indexed access but requires resizing to change its size.
// -Linked List: A dynamic, non-contiguous data structure with each element pointing to the next, allowing efficient insertions and deletions but slower access due to traversal.

//time complexity            Linked List             Array
//1.Insert At Beginning          O(1)                 O(n)
//2.Tranvers                     O(n)                 O(n)
//3.Read/updeate                 O(n)                 O(1)
//4.Insert at Pos                O(n)                 O(n)
//5.delete form pos              O(n)                 O(n)

//1.
class linkedlist
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public linkedlist() 
    {
        head=null;
    }  
    public void InsertAtBegin(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
    }
    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data);
            temp=temp.next;
        }
    }
}
public class main1
{
    public static void main(String[] args) {
        linkedlist obj1 = new linkedlist();
        obj1.InsertAtBegin(3);
        obj1.InsertAtBegin(33);
        obj1.InsertAtBegin(333);
        obj1.InsertAtBegin(3333);
        obj1.display();
    }
}