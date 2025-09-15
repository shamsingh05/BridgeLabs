public class Main {
    public static void main(String[] args) {
        SavingsAccount sAcc = new SavingsAccount("SA1001", 2000);
        CurrentAccount cAcc = new CurrentAccount("CA2001", 5000);

        sAcc.displayInfo();
        cAcc.displayInfo();

        sAcc.withdraw(1300);
        cAcc.withdraw(1000);

        cAcc.transfer(cAcc, sAcc, 500);

        System.out.println("After transactions:");
        sAcc.displayInfo();
        cAcc.displayInfo();
    }
}
