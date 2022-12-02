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
        System.out.println("\tSquare");
        Shape sq=new Square();
        sq.get();
        sq.cal_area();
        sq.put();
        System.out.println("\tRectangle");
        Shape r=new Rectangle();
        r.get();
        r.cal_area();
        r.put();
        System.out.println("\tTraingle");
        Shape t=new triangle();
        t.get();
        t.cal_area();
        t.put();
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
        a=length*height/2;
    }

}
