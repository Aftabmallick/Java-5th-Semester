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
