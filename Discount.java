import java.util.*;
public class Discount{
    Scanner sc=new Scanner(System.in);
    private float discount,SalesAmount;
    private void input(){
        System.out.println("Enter sales amount: ");
        this.SalesAmount=sc.nextFloat();
    }
    private void compute1(){
        
        if(this.SalesAmount > 40000f)
            this.discount=.1f;
        else if (this.SalesAmount > 20000f)
            this.discount=.05f;
        else if (this.SalesAmount > 10000f)
            this.discount=.03f;
        else
            this.discount=0;
        this.discount=this.SalesAmount*this.discount;
    }
    private void compute2(){
        (this.SalesAmount > 40000f)?(this.discount=.1f):(this.SalesAmount > 20000f)?(this.discount=.05f):(this.SalesAmount > 10000f)?(this.discount=.03f):(this.discount=0);
    }
    private void display(){
        System.out.println("Discount: "+this.discount);
    }
    public static void main(String[] args) {
        Discount d1 =new Discount();
        d1.input();
        d1.compute1();
        d1.display();
        Discount d2 =new Discount();
        d2.input();
        d2.compute1();
        d2.display();
    }
}