import java.*;
import java.util.Scanner;
public class ass9 {
    Scanner sc =new Scanner(System.in);
    int row, column,row1, column1;
    int [][] array;
    int [][] array1;
    int [][] mul;
    void get(){
        System.out.println("Enter row and column size array 1: ");
        row=sc.nextInt();
        column=sc.nextInt();
        array=new int[row][column];
        System.out.println("\nEnter elements in array 1 : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                array[i][j]=sc.nextInt();
        }
        System.out.println("Enter row and column size array 2: ");
        row1=sc.nextInt();
        column1=sc.nextInt();
        array1=new int[row1][column1];
        System.out.println("\nEnter elements in array 2 : ");
        for(int i=0;i<row1;i++){
            for(int j=0;j<column1;j++)
                array1[i][j]=sc.nextInt();
        }
        
    }
    void multiply(){
        if (column!= row1){
            System.out.println("Multiplication Not possible.");
        }
        else{
            mul=new int[row][column1];
            for (int i=0;i<row;i++) {
                for(int j=0;j<column1;j++){
                    mul[i][j]=0;
                    for(int k=0;k<row1;k++){
                        mul[i][j]=mul[i][j]+(array[i][k]*array1[k][j]);
                    }
                }
            }
        }
    }
    void display(){
        System.out.println("Multiplication Result: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column1;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    
    public static void main(String[] args) {
        ass9 a1 =new ass9();
        a1.get();
        a1.multiply();
        a1.display();

        
    }
}
