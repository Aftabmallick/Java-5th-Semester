public class Arithmatic {
    private int a;
    private float b;
    private char c;
    private double d, sum;
    Arithmatic(int a, float b, char c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    void add(int a, double d) {
        //a = this.a;
        //d = this.d;
        this.sum = a + d;
    }
    void add(int a, float b, double d){
      /*  a = this.a;
        b = this.b;
        d = this.d;*/
        this.sum = a + b + d;

    }
    void add(float b, int a, double d){
        /*  a = this.a;
        b = this.b;
        d = this.d;*/
        this.sum = a + b + d;
    }
    Arithmatic add(Arithmatic A2){
        /*this.a=A2.a;
        this.b=A2.b;
        this.c=A2.c;
        this.d=A2.d;*/
        this.sum=A2.a+A2.b+A2.c+A2.d;
        return this;
    }

    void display() {
        System.out.println("Sum = " + this.sum);
    }

    public static void main(String[] args) {
        Arithmatic a1 = new Arithmatic(10, 10.5f, 'a', 500);
        a1.add(10, 10);
        a1.display();
        a1.add(10, 10.5f, 20);
        a1.display();
        a1.add(10.5f, 10, 20);
        a1.display();
        Arithmatic a2 = new Arithmatic(50, 50.5f, 'd', 100);
        System.out.println("Addition of Two Objects ");
        a1.add(a2);
        a1.display();

    }
}
