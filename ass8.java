import java.util.Scanner;
class Sorting {
    protected int a[], n;

    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the size of Array : ");
        n = sc.nextInt();
        a = new int[n];
        System.out.println(" Enter the element's of Array : ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

    }

    void bubble() {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    void insertion() {
        int temp, j;
        for (int i = 1; i < n; i++) {
            temp = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = temp;
        }
    }

    void display() {
        System.out.println(" After sorting the array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

public class ass8 {
    public static void main(String args[]) {
        int c;
        Sorting a1 = new Sorting();
        System.out.println(" Enter 1 for Bubble sorting \n Enter 2 for Insertion sorting \n Enter 3 for Exit");
        System.out.print(" Enter your choice : ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            c = sc.nextInt();
            switch (c) {
                case 1:
                    a1.get();
                    a1.bubble();
                    a1.display();
                    break;
                case 2:
                    a1.get();
                    a1.insertion();
                    a1.display();
                    break;
                case 3:
                    return;
            }
        }
    }

}