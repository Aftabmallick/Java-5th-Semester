import java.lang.*;
class runnabledemo implements Runnable{
    private Thread t;
    private String ThreadName;
    runnabledemo(String name){
        ThreadName=name;
        System.out.println("Creating  "+ThreadName);
    }
    public void run(){
        System.out.println("Running"+ThreadName);
        try{
            for(int i=4;i>0;i--){
                System.out.println("Thread  "+ThreadName+"  "+i);
                Thread.sleep(100);
            }
        }catch(InterruptedException e){
            System.out.println(ThreadName+"  Interrupted");
        }
        System.out.println(ThreadName + "  Exiting");
    }
    public void start(){
        System.out.println("starting thread "+ ThreadName);
        if(t==null){
            t=new Thread(this,ThreadName);
            t.start();
        }
    }
}
public class TestThread{
    public static void main(String[] args) {
        runnabledemo r1 = new runnabledemo("Thread 1");
        r1.start();
        runnabledemo r2 = new runnabledemo("Thread 2");
        r2.start();
    }
}
