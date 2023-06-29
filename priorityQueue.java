import java.util.*;

class Link{
    public Link next;
    public int data;

    public Link(int data){
        this.data = data;
        this.next = null;
    }

    public void displayLink(){
        System.out.println(data);
    }
}

class singlyLinkedList{
    public Link first;
    public int count = 0;

    public singlyLinkedList(){
        first = null;
    }

    public boolean isEmpty(){
        return(first == null);
    }

    public void insert(int data){
        if(first == null || data>=first.data){
            Link nl = new Link(data);
            nl.next = first;
            first = nl;
        }
        else{
            Link nl = new Link(data);
            Link temp1 = first;
            while(data>=temp1.data && temp1.next != null){
                temp1 = temp1.next;
            }
            nl.next = temp1.next;
            temp1.next = nl;

        }
    
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        count--;
        return temp;
    }

    public void displayList(){
        Link temp = first;
        while(temp != null){
            temp.displayLink();
            temp = temp.next;
        }
    }

    public void insertAt(int pos, int data){
        Link temp = first;
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
        }
        Link temp2 = new Link(data);
        temp2.next = temp.next;
        temp.next = temp2;
        count++;
    }

    public Link deleteAt(int pos){
        Link temp = first;
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
        }
        Link temp2 = temp.next;
        temp.next = temp.next.next;
        count--;
        return temp2;
    }

    public void displayCount(){
        System.out.println("The number of element in list is:" + count);
    }

}

public class priorityQueue{
    public static void main(String args[]){
        singlyLinkedList list = new singlyLinkedList();
        list.insert(4);
        list.insert(1);
        list.insert(3);
        list.insert(5);
        list.insert(10);
        list.insert(0);
        list.displayList();
    }
}