public class ComputerProfessional {
    private String EName,Prospect;
    private int DutyHour;
    ComputerProfessional(String EName,String Prospect,int DutyHour){
        this.DutyHour=DutyHour;
        this.EName=EName;
        this.Prospect=Prospect;
    }
    void show(){
        System.out.println("Employee Name : "+EName);
        System.out.println("Prospect : "+Prospect);
        System.out.println("Hours of Duty: "+DutyHour);
    }
    public static void main(String[] args) {
        System.out.println("\tComputer Professional");
        ComputerProfessional cp1 =new ComputerProfessional("Aftab", "What??", 8);
        cp1.show();
        System.out.println("\tDeveloper");
        Developer d1 = new Developer("AftabDev", "WTF", 12, 6);
        d1.display();
        System.out.println("\tNetwork Admin");
        NetworkAdmin n1 = new NetworkAdmin("AftabNA", "WTF1", 10, 5);
        n1.display();
        System.out.println("\tData Operator");
        DataOperator da1 = new DataOperator("AftabDA", "WTF2", 9, 4);
        da1.display();
        System.out.println("\tJava Professional");
        JavaProfessional j1 = new JavaProfessional("AFtabJava", "WTF3", 8, 5, "Beginner");
        j1.display();
        System.out.println("\tPython Professional");
        PythonProfessional p1 = new PythonProfessional("AftabPy", "WTF4", 8, 4, "Pro");
        



        
    }
}
class Developer extends ComputerProfessional{
    private int StudyHour;
    Developer(String EName,String Prospect,int DutyHour,int StudyHour){
        super(EName,Prospect,DutyHour);
        this.StudyHour=StudyHour;
    }
    void display(){
        super.show();
        System.out.println("Study Hours: "+StudyHour);
    }

}
class NetworkAdmin extends ComputerProfessional{
    private int PracticeHours;
    NetworkAdmin(String EName,String Prospect,int DutyHour,int PracticeHours){
        super(EName,Prospect,DutyHour);
        this.PracticeHours=PracticeHours;
    }
    void display(){
        super.show();
        System.out.println("Practice Hours: "+PracticeHours);
    }
}
class DataOperator extends ComputerProfessional{
    private int TypingSpeed;
    DataOperator(String EName,String Prospect,int DutyHour,int TypingSpeed){
        super(EName,Prospect,DutyHour);
        this.TypingSpeed=TypingSpeed;

    }
    void display(){
        super.show();
        System.out.println("Typing Speed: "+TypingSpeed);
    }
}
class JavaProfessional extends Developer{
    private String ProficiencyLevel;
    JavaProfessional(String EName,String Prospect,int DutyHour,int StudyHour,String ProficiencyLevel){
        super(EName, Prospect, DutyHour, StudyHour);
        this.ProficiencyLevel=ProficiencyLevel;
    }
    void display(){
        super.display();
        System.out.println("Proficiency Level : "+ProficiencyLevel);
    }


}
class PythonProfessional extends Developer{
    private String ProficiencyLevel;
    PythonProfessional(String EName,String Prospect,int DutyHour,int StudyHour,String ProficiencyLevel){
        super(EName, Prospect, DutyHour, StudyHour);
        this.ProficiencyLevel=ProficiencyLevel;
    }
    void display(){
        super.display();
        System.out.println("Proficiency Level : "+ProficiencyLevel);
    }
}
