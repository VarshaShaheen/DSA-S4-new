import java.util.*;

class node{
    public int coeff;
    public int exp;
    public node next;

    public node(int coeff,int exp){
        this.coeff = coeff;
        this.exp = exp;
        next = null;
    }
}

class Polynomial{
    node first;

    public Polynomial(){
        first = null;
    }

    public void addTerm(int coeff, int exp){
        node nl = new node(coeff,exp);
        if(first == null){
            first = nl;
            nl.next = null;
        }
        else{
            node temp = first;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = nl;
        }
    }
    public Polynomial addPolynomial(Polynomial pol1, Polynomial pol2){
        Polynomial result = new Polynomial();
        node temp1 = pol1.first;
        node temp2 = pol2.first;
        while(temp1 != null || temp2 != null){
            if(temp1.exp > temp2.exp){
                result.addTerm(temp1.coeff, temp1.exp);
                temp1 = temp1.next;
            }
            else if(temp2.exp > temp1.exp){
                result.addTerm(temp2.coeff, temp2.exp);
                temp2 = temp2.next;
            }
            else{
                result.addTerm((temp1.coeff + temp2.coeff), (temp1.exp));
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        while (temp1 != null) {
            result.addTerm(temp1.coeff, temp1.exp);
            temp1 = temp1.next;
        }
        
        while (temp2 != null) {
            result.addTerm(temp2.coeff, temp2.exp);
            temp2 = temp2.next;
        }
       return result; 
    }

    public void display(){
        node current = first;
        while (current != null) {
            System.out.print(current.coeff + "x^" + current.exp);
            if (current.next != null) {
                System.out.print(" + ");
            }
            current = current.next;
        }
        System.out.println();
    }
}

public class LLPolynomialAdd{
    public static void main(String args[]){
        Polynomial p1 = new Polynomial();
        p1.addTerm(3, 2);
        p1.addTerm(4, 1);
        p1.addTerm(2, 0);

        Polynomial p2 = new Polynomial();
        p2.addTerm(1, 3);
        p2.addTerm(2, 2);
        p2.addTerm(5, 0);

        Polynomial sum = p1.addPolynomial(p1, p2);
        sum.display();
    }
}

