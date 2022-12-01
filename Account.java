public class Account {
    int Acc_No,  Contact_No;
    String C_Name;
    void Show(){
        System.out.println("\nCustomer Name : "+C_Name+"\nAccount No : "+Acc_No+"\nContact No : "+Contact_No);
    }
    public static void main(String[] args) {
        Account a1= new Savings_Ac();
        a1.Show();

    }
}
class Savings_Ac extends Account{
    private float ROI, Acc_Balance;
  
    void Show(){
        System.out.println("\nCustomer Name : "+super.C_Name+"\nAccount No : "+super.Acc_No+"\nContact No : "+super.Contact_No+"\nAccount Balance : "+Acc_Balance+"\nReturn of Investement : "+ROI);
    }
}
class Current_Ac extends Account{
    private float Acc_Balance, Min_Balance;
    void Show(){
        System.out.println("\nCustomer Name : "+super.C_Name+"\nAccount No : "+super.Acc_No+"\nContact No : "+super.Contact_No+"\nAccount Balance : "+Acc_Balance+"\nMinimum Balance : "+Min_Balance);
    }
}
class TD_Ac extends Account{
    private float Principal, Term, ROI, Maturity_Balance;
}
