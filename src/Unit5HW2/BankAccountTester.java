package Unit5HW2;

public class BankAccountTester {
    public static void main(String[] args)
    {
        BankAccount ArmoAccount = new BankAccount("Armo", 100.0);
        ArmoAccount.deposit(10.0);
        System.out.println(ArmoAccount.balance);
        ArmoAccount.withdraw(10);
        System.out.println(ArmoAccount.balance);
        for (int i = 0; i<10; i++)
        {
            ArmoAccount.deposit(10.0); //repeats this 10 times so I can see if the monthly deduct works or not
        }
        System.out.println(ArmoAccount.balance);
        ArmoAccount.deductMonthlyCharge();
        System.out.println(ArmoAccount.balance);
    }
}
