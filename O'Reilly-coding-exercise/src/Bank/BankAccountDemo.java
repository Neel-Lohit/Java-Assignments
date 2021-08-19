package Bank;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount myAccount =new BankAccount("Neel",1000);
        BankAccount yourAccount = new BankAccount("abcd");

        System.out.println(myAccount.getOwner()+" has "+myAccount.getBalance()+" rupees");

        myAccount.deposit(200);
        System.out.println(myAccount.getOwner()+" has "+myAccount.getBalance()+" rupees");

        myAccount.withdraw(700);
        System.out.println(myAccount.getOwner()+" has "+myAccount.getBalance()+" rupees");

        myAccount.withdraw(900);

    }
}
