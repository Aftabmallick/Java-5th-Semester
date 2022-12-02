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
        Shape r=new Rectangle();
        r.get();
        r.cal_area();
        r.put();
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
class Rectangle extends Shape{
    int a;
    void get(){
        System.out.println("Enter The length & Height: ");
        length = sc.nextInt();
        height = sc.nextInt();

    }
    void put(){
        System.out.println("Area = "+a);
    }
    void cal_area(){
        a=length*height;
    }
    
}
class triangle extends Shape{
    int a;
    void get(){
        System.out.println("Enter The length & Height: ");
        length = sc.nextInt();
        height = sc.nextInt();

    }
    void put(){
        System.out.println("Area = "+a);
    }
    void cal_area(){
        a=length*height;
    }

}
