public class Arithmetic {
    private int a;
    private float b;
    private char c;
    private double d, sum;
    Arithmetic(int a, float b, char c, double d) {
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

    void display() {
        System.out.println("Sum = " + this.sum);
    }

    public static void main(String[] args) {
        Arithmetic a1 = new Arithmetic(10, 10.5f, 'a', 500);
        a1.add(10, 10);
        a1.display();
        a1.add(10, 10.5f, 20);
        a1.display();

    }
}
