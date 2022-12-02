public class ComputerProfessional {
    private String EName,Prospect;
    private int DutyHour;
    ComputerProfessional(String EName,String Prospect,int DutyHour){
        this.DutyHour=DutyHour;
        this.EName=EName;
        this.Prospect=Prospect;
    }
    public static void main(String[] args) {
        
    }
}
class Developer extends ComputerProfessional{
    private int StudyHour;
}
class NetworkAdmin extends ComputerProfessional{
    private int PracticeHours;
}
class DataOperator extends ComputerProfessional{
    private int TypingSpeed;
}
class JavaProfessional extends Developer{
    private int ProficiencyLevel;
}
class PythonProfessional extends Developer{
    private int ProficiencyLevel;
}
