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
        System.out.println("Enter any double value : ");
        d=sc.nextDouble();

        System.out.println("\n Wrapping : ");
		Integer A= Integer.valueOf(a);
		Character C= Character.valueOf(c);
		Float F= Float.valueOf(f);
		Double D= Double.valueOf(d);
        System.out.println(a);
		System.out.println(c);
		System.out.println(f);
		System.out.println(d);

        System.out.println("\n Unwrapping : ");
		aa=A.intValue();
		cc=C.charValue();
		ff=F.floatValue();
		dd=D.doubleValue();
        System.out.println(aa);
		System.out.println(cc);
		System.out.println(ff);
		System.out.println(dd);


        String str="Aftab 007";
        int l= str.length(); 
        int up=0,lw=0,sp=0,dg=0;
        for(int i=0;i<l;i++){
            Character n = str.charAt(i);
            if(Character.isUpperCase(n)){
                up++;

            }
            else if (Character.isLowerCase(n)){
                lw++;
            }
            else if(Character.isDigit(n)){
                dg++;
            }
            else{
                sp++;
            }
        }
        System.out.println("The no of Uppercase : "+up);
		System.out.println("The no of Lowercase : "+lw);
		System.out.println("The no of Whitespace : "+sp);
        System.out.println("The no of Digits : "+dg);
        Integer af = null;
        int af1= af;
        System.out.println(af1);

    }
}
