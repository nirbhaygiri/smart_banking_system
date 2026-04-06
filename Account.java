public abstract class Account{
    private String accountNumber = "1234567890"; //default account number, can be changed when creating an account
    protected double balance;

    public Account() {
       
        this.balance = 1000.0; //default balance, can be changed when creating an account
    }

   public boolean checkAccount(String inputNo) {
        return this.accountNumber.equals(inputNo);
    }

  public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double displayBalance() {
        System.out.println("Current balance: "+balance);
        return balance;
    }
 }