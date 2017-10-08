
class BankAccount{
    double balance;
    String accountOwner;

    public BankAccount(String owner){
        balance = 27;
        accountOwner = owner;
    }

    void deposit(double amount){
        balance = balance + amount;
    }

    @Override
    public boolean equals(Object o){
        return (((BankAccount) o).accountOwner).equals(accountOwner);
    }
}