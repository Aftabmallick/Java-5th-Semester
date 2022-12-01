public class Account {
    private int Acc_No,  Contact_No;
    private String C_Name;
    Account(int Acc_No, int Contact_No,String C_Name){
        this.Acc_No=Acc_No;
        this.Contact_No=Contact_No;
        this.C_Name=C_Name;
    }
    void Show(){
        System.out.println("\nCustomer Name : "+C_Name+"\nAccount No : "+Acc_No+"\nContact No : "+Contact_No);
    }
    public static void main(String[] args) {
        System.out.println("\t\t\tSavings Account");
        Savings_Ac sac = new Savings_Ac(061401,291900,"Aftab",7.0f,1583.25f);
        sac.compute();
        sac.display();
        System.out.println("\t\t\tCurrent Account\n");
        Current_Ac cac = new Current_Ac(061501,291900,"Aftab 2",5000f,200f);
        cac.compute();
        cac.display();
        System.out.println("\t\t\tTD Account\n");
        TD_Ac tdc = new TD_Ac(06160,291900,"Aftab 3",50000,12f,10f,100000);
        tdc.compute();
        tdc.display();

    }
}
class Savings_Ac extends Account{
    private float ROI, Acc_Balance,I;
    Savings_Ac(int Acc_No, int Contact_No,String C_Name, float ROI, float Acc_Balance){
        super(Acc_No,Contact_No,C_Name);
        this.ROI=ROI;
        this.Acc_Balance=Acc_Balance;
    }
    void compute(){
        I=Acc_Balance*ROI*12/100;
    }
    void display(){
        super.Show();
        System.out.println("Account Balance : "+Acc_Balance+"\nReturn of Investement : "+ROI);
        System.out.println("Interest = "+I);
        System.out.println("Total Balance : "+(Acc_Balance+I));
    }
}
class Current_Ac extends Account{
    private float Acc_Balance, Min_Balance;
    Current_Ac(int Acc_No, int Contact_No,String C_Name,float Acc_Balance, float Min_Balance){
        super(Acc_No,Contact_No,C_Name);
        this.Acc_Balance=Acc_Balance;
        this.Min_Balance=Min_Balance;
    }
    void compute() {
		if (Acc_Balance < Min_Balance) {
			System.out.println("\nYour ac Bal is less than min Bal");
		}
	}
    void display(){
        super.Show();
        System.out.println("Account Balance : "+Acc_Balance+"\nMinimum Balance : "+Min_Balance);
    }
}
class TD_Ac extends Account{
    private float Principal, Term, ROI, Maturity_Balance,Ci;
    TD_Ac(int Acc_No, int Contact_No,String C_Name,float Principal,float Term,float ROI,float Maturity_Balance){
        super(Acc_No,Contact_No,C_Name);
        this.Principal=Principal;
        this.Term=Term;
        this.ROI=ROI;
        this.Maturity_Balance=Maturity_Balance;
    }
    void compute() {
		Ci =(float) (Principal * Math.pow(1 + (ROI / 100), Term)) - Principal;
		Maturity_Balance = (Principal + Ci);
	}
    void display(){
        super.Show();
        System.out.println("Principle : "+Principal+"\nReturn of Investement : "+ROI+"\nMaturity Balance : "+Maturity_Balance+"\nTerm : "+Term);
        System.out.println("Compound Interest : "+Ci);
    }
}
