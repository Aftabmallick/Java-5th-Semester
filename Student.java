public class Student {
    private String S_Name,  Batch,  Stream;
    private int Roll_No,Year_of_Adm;
    Student(String sn, int rn){
        S_Name=sn;
        Roll_No=rn;
    }
    Student(String sn, int rn, String b){
        S_Name=sn;
        Roll_No=rn;
        Batch=b;
    }
    Student(String sn, int rn, String b, int yr){
        S_Name=sn;
        Roll_No=rn;
        Batch=b;
        Year_of_Adm=yr;
    }
    Student(String sn, int rn, String b, int yr, String s){
        S_Name=sn;
        Roll_No=rn;
        Batch=b;
        Year_of_Adm=yr;
        Stream=s;
    }
    void showdata( ){
        System.out.println("Name : "+S_Name+"\nRoll no : "+Roll_No+"\nBatch : "+Batch+"\nYear of admission : "+Year_of_Adm+"\nStream : "+Stream+"\n\n");
    }
    public static void main(String[] args) {
        Student s1 =new Student("Aftab", 60);
        s1.showdata();
        Student s2 =new Student("Aftab", 60,"5th");
        s2.showdata();
        Student s3 =new Student("Aftab", 60,"5th",2020);
        s3.showdata();
        Student s4 =new Student("Aftab", 60,"5th",2020,"DS");
        s4.showdata();
    }
}
