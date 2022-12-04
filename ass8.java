import java.util.*;
class bubble{
    Scanner sc =new Scanner(System.in);
    int n;
    int[] array;
    void get(){
        System.out.println("Enter array size: ");
        n=sc.nextInt();
        array=new int[n];
        System.out.println("\nEnter elements in array : ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        
    }
    void sort(){
        for(int i =0 ;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    void print(){
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+"  ");
        }
    }
}
class insertion{
    Scanner sc =new Scanner(System.in);
    int n;
    int[] array;
    void get(){
        System.out.println("\nEnter array size: ");
        n=sc.nextInt();
        array=new int[n];
        System.out.println("Enter elements in array : ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }       
    }
    void sort(){
        for(int i =0 ;i<n-1;i++){
            int key =array[i];
            int j=i-1;
            while (j>=0 && array[j]>key){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=key;
            }
        }
    
    void print(){
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+"  ");
        }
    }
}

public class ass8 {


    public static void main(String[] args) {
        bubble b1 = new bubble();
        b1.get();
        b1.sort();
        b1.print();
        insertion i1=new insertion();
        i1.get();
        i1.sort();
        i1.print();
    }
}
