import java.util.Scanner;
class node{
    int data;
    node next;
    public node(int data){
        this.data = data;
        next = null;
    }
    public void display_node(){
        System.out.println(this.data);
    }
}

class sll{
    node head;
    public sll(){
        head = null;
    }
    public void insert_at(int a, int pos){
        node nl = new node(a);
        node current;
        if(head == null & pos == 1){
            head = nl;
            nl.next = null;
        }
        else if(pos == 1){
            nl.next = head;
            head = nl;
        }
        else{
            current = head;
            for(int i = 0;i<pos-2;i++){
                current = current.next;
            }
            if(current.next == null){
                current.next = nl;
                nl.next = null;
            }
            else{
                nl.next = current.next;
                current.next = nl;
            }
        }
    }
    public node delete_first(){
        node temp;
        if(head == null){
            System.out.println("List empty");
            return null;
        }
        else if(head.next == null){
            temp = head;
            head = null;
            return temp;
        }
        else{
            temp = head;
            head = head.next;
            return temp;
        }
    }
    public node delete_at(int pos){
        node temp;
        node current = head;
        if(head == null){
            System.out.println("List empty");
            return null;
        }
        else if(pos == 1 & head.next == null){
            temp = head;
            head = null;
            return temp;
        }
        else if(pos==1){
            temp = head;
            head = head.next;
            return temp;
        }
        else{
            for(int i =0;i<pos-2;i++){
                current = current.next;
            }
            temp = current.next;
            current.next = current.next.next;
            return temp;
        }
        
    }
    public void count(){
        int c = 0;
        for(node current = head;current.next != null;current = current.next){
            c++;
        }
        System.out.println("Count = "+ c);
    }
    public void display_list(){
        for(node current = head;current != null;current = current.next){
            current.display_node();
        }
    }
}
class LL1{
    public static void main(String args[]){
        sll list = new sll();
        list.insert_at(0, 1);
        list.display_list();
        System.out.println("efhgf");
        list.delete_first();
        list.insert_at(0,1);
        list.insert_at(1,2);
        list.insert_at(2,3);
        list.insert_at(3,2);
        list.display_list();
        System.out.println("efhgf");
        list.delete_at(2);
        list.display_list();
    }
}