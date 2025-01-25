package Unit5HW2;

public class BankAccount
{
    int fee_p = 2; //percentage
    String name;
    double balance;
    int count;
    public BankAccount(String name, double balance)
    {
        this.balance = balance;
        this.name = name;
        this.fee_p = fee_p;
    }
    public void deposit(double amount)
    {
        double feeA = (fee_p / 100) * balance;
        if (feeA <= amount || feeA <= balance) {
            System.out.println("Your deposit was succesfull.");
            balance += amount;
            count++;
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Your deposit was unsuccesfull");
        }
    }

    public void withdraw(double amount)
    {
        double feeA = (fee_p / 100) * balance;
        if (balance - amount >= 0) {
            System.out.println("Your withdraw was succesfull.");
            balance -= amount;
            count++;
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Your withdraw was unsuccesfull");
        }
    }

    public void deductMonthlyCharge()
    {
        if (count > 10)
        {
            balance -= (count - 10) * 2.5;
            count = 0;
        } else{
            System.out.println("No charge needed. Did not exceed free transactions");
        }

    }
}
