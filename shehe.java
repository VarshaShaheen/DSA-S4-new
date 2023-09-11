import java.util.Scanner;
class node{
    char data;
    node next;
    public node(char data){
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
    public void insert(char data){
        node nl = new node(data);
        if(head == null){
            head = nl;
            nl.next = null;
        }
        else{
            node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = nl;
            nl.next = null;
        }
    }
    public void replace(){
        node current = head;
        while(current != null){
           if(current.data == 's'){
              node temp1 = current;
              current = current.next;
              if(current.data == 'h'){
                node temp2 = current;
                current = current.next;
                if(current.data == 'e'){
                    node temp3 = current;
                    current = current.next;
                    temp1.data = 'h';
                    temp2.data = 'i';
                    temp3.data = 's';
                }
              }
           }
           else{
            current = current.next;
           }
        }
    }
    public void display_list(){
        for(node current = head;current != null;current = current.next){
            current.display_node();
        }
    }
}
class shehe{
    public static void main(String args[]){
        sll s = new sll();
        s.insert('a');
        s.insert('s');
        s.insert('h');
        s.insert('e');
        s.display_list();
        s.replace();
        s.display_list();
    }
}
