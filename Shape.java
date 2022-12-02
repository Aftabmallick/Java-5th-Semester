import java.util.*;
public class Shape {
    protected int length,height;
    Scanner sc = new Scanner(System.in);
    void get(){

    }
    void put(){
    
    }
    void cal_area(){

    }
   public static void main(String[] args) {
        Shape sq=new Square();
        sq.get();
        sq.cal_area();
        sq.put();
   } 
}
class Square extends Shape{
    int a;
    void get(){
        System.out.println("Enter The length : ");
        length=sc.nextInt();

    }
    void put(){
        System.out.println("Area = "+a);
    }
    void cal_area(){
        a=length*length;
    }

}
