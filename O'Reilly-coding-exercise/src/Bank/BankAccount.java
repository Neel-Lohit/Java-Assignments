package Bank;

public class BankAccount {
    private String owner;
    private double balance;
    public BankAccount(String owner)
    {
        this(owner,0);
    }
    public BankAccount(String owner, double balance)
    {
        this.owner=owner;
        this.balance=balance;
    }
    public void deposit(double amount)
    {
        if(amount>0)
            balance+=amount;
        else
            System.out.println("amount to deposit must be greater than 0");
    }
    public void withdraw(double amount)
    {
        if(amount >0 && amount <= balance)
            balance-=amount;
        else
            System.out.println("Insufficient funds");
    }

    public String getOwner() {
        return owner;
    }
    public double getBalance()
    {
        return balance;
    }
}

