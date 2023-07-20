import java.util.Scanner;

class node{
    public int data;
    public node prev;
    public node next;

    public node(int data){
        this.data = data;
        prev = null;
        next = null;
    }

    public void displayNode(){
        System.out.println(data);
    }
}

public class doublyLinkedList{
    node first;
    int size=0;
    public doublyLinkedList(){
        first = null;
    }
    public void insertAt(int data, int pos){
        node nl = new node(data);
        if(pos == 1){
            if(first == null){
                first = nl;
            }
            else{
                nl.next = first;
                first.prev = nl;
                first = nl;
                first.prev = null; 
            }
            size++;
        }
        else{
            node current = first;
            for(int i=1;i<pos-1;i++){
                current = current.next;
            }
            if(current.next == null){
                nl.prev = current;
                current.next = nl;
                nl.next = null;
            }
            else{
                nl.next = current.next;
                nl.prev = current;
                current.next.prev = nl;
                current.next = nl;
            }
            size++;
        }
    }
    public void display(){
        node current = first;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    public void displayReverse() {
        node current = first;
        while(current.next != null){
            current = current.next;
        }
        while(current!= null){
            current.displayNode();
            current = current.prev;
        }
    }
    public void sort(){
        for(node current=first; current.next != null; current = current.next){
            for(node temp = first; temp.next != null; temp = temp.next){
                if(temp.data > temp.next.data){
                    int a = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = a;
                }
            }
        }
    }
    public static void main(String args[]){
        doublyLinkedList dl = new doublyLinkedList();
        dl.insertAt(11, 1);
        dl.insertAt(1, 2);
        dl.insertAt(3, 3);
        dl.insertAt(10, 2);
        dl.insertAt(4, 3);
        dl.insertAt(5, 3);
        System.out.println("List: ");
        dl.display();
        System.out.println("Reversed list: ");
        dl.displayReverse();
        dl.sort() ;
        System.out.println("Sorted list: ");
        dl.display();
    }
}