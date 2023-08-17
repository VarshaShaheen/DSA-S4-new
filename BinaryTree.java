class node{
    int data;
    node lchild;
    node rchild;

    public node(int data){
        this.data = data;
        lchild = rchild = null;
    }
}

public class BinaryTree{
    node head;
    public BinaryTree(){
        head = null;
    }
    public void insert(int x){
        node nl = new node(x);
        node current = head;
        node parent = current;
        if(head == null){
            head = nl;
            return;
        }
        while(true){
            if(x <= current.data){
                parent = current;
                current = current.lchild;
                if(current == null){
                    parent.lchild = nl;
                    return ;
                }
            }
            else{
                parent = current;
                current = current.rchild;
                if(current == null){
                    parent.rchild = nl;
                    return ;
                }
            }
        }
    }
    public void inorder(){
        inorder(head);
    }
    
    public void inorder(node current){
        if (current != null) {
            inorder(current.lchild);
            System.out.println(current.data);
            inorder(current.rchild);
        } 
    }
    
    public static void main(String args[]){
        BinaryTree b = new BinaryTree();
        b.insert(5);
        b.insert(2);
        b.insert(6);
        b.insert(1);
        b.insert(3);
        b.inorder();
    }
}