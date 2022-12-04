interface area{
    final public static float pi=3.14f;
    public abstract void cal_area();
}
class circle implements area{
    private float r,area;
    circle(float r){
        this.r=r;
    }
    public void cal_area(){
        area=pi*r*r;
        System.out.println(" The Area of Circle is : "+area);
    }
}
class rectangle implements area{
    private float l,b,area;
    rectangle(float l,float b){
        this.l=l;
        this.b=b;
    }
    public void cal_area(){
        area=l*b;
        System.out.println("The area of a rectangle is : "+area);
    }

}

public class assignment10 {
    public static void main(String[] args) {
        circle c1 =new circle(10);
        c1.cal_area();
        rectangle r1 =new rectangle(10, 20);
        r1.cal_area();
    }
}
