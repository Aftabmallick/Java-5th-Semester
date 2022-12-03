import java.util.*;

public class Assignment7 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int a,aa;
        char c,cc;
        float f,ff;
        double d,dd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value : ");
        a =sc.nextInt();
        System.out.println("Enter Character value : ");
        c=sc.next().charAt(0);
        System.out.println("Enter floating value : ");
        f=sc.nextFloat();
        System.out.println("nter any double value : ");
        d=sc.nextDouble();

        System.out.println("\n Wrapping : ");
		int A= Integer.valueOf(a);
		char C= Character.valueOf(c);
		float F= Float.valueOf(f);
		double D= Double.valueOf(d);
        System.out.println(a);
		System.out.println(c);
		System.out.println(f);
		System.out.println(d);

        System.out.println("\n Unwrapping : ");
		aa=A.intValue();
		cc=C.charValue();
		ff=F.floatValue();
		dd=D.doubleValue();
        System.out.println(a);
		System.out.println(c);
		System.out.println(f);
		System.out.println(d);

    }
}
