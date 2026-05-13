class Bank {
    void interestRate(){
        System.out.println("General bank interest rate");
    }

}
class SBI extends Bank {
    void interestRate(){
        System.out.println("SBI interest rate is 10%");
    }
}
class HDFC extends Bank {
    void interestRate(){
        System.out.println("HDFC interest rate is 12%");
    }
}
class ICICI extends Bank {
    void interestRate(){
        System.out.println("ICICI interest rate is 14%");
    }
}
public class Banking {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.interestRate();

        SBI s = new SBI();
        s.interestRate();

        HDFC h = new HDFC();
        h.interestRate();

        ICICI i = new ICICI();
        i.interestRate();
    }
}