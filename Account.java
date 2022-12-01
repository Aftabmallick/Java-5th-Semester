public class Account {
    double Acc_No,  Contact_No;
    String C_Name;
    void Show(){
        System.out.println("\nCustomer Name : "+C_Name+"\nAccount No : "+Acc_No+"\nContact No : "+Contact_No);
    }
    public static void main(String[] args) {
        System.out.println("\t\t\tSavings Account\n");
        Account sac = new Savings_Ac();
        sac.Show();
        System.out.println("\t\t\tCurrent Account\n");
        Account cac = new Current_Ac();
        cac.Show();
        System.out.println("\t\t\tTD Account\n");
        Account tdc = new TD_Ac();
        tdc.Show();

    }
}
class Savings_Ac extends Account{
    private float ROI, Acc_Balance;
    Savings_Ac(int Acc_No, int Contact_No,String C_Name, float ROI, float Acc_Balance){
        
    }
    void Show(){
        System.out.println("\nCustomer Name : "+super.C_Name+"\nAccount No : "+super.Acc_No+"\nContact No : "+super.Contact_No+"\nAccount Balance : "+Acc_Balance+"\nReturn of Investement : "+ROI+"\n\n");
    }
}
class Current_Ac extends Account{
    private float Acc_Balance, Min_Balance;
    void Show(){
        System.out.println("\nCustomer Name : "+super.C_Name+"\nAccount No : "+super.Acc_No+"\nContact No : "+super.Contact_No+"\nAccount Balance : "+Acc_Balance+"\nMinimum Balance : "+Min_Balance+"\n\n");
    }
}
class TD_Ac extends Account{
    private float Principal, Term, ROI, Maturity_Balance;
    void Show(){
        System.out.println("\nCustomer Name : "+super.C_Name+"\nAccount No : "+super.Acc_No+"\nContact No : "+super.Contact_No+"\nPrinciple : "+Principal+"\nReturn of Investement : "+ROI+"\nMaturity Balance : "+Maturity_Balance+"\nTerm : "+Term+"\n\n");
    }
}
