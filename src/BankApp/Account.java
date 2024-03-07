package BankApp;

public class Account {

    private String name;
    private int balance;
    private String pin;
    private int number;

    public Account(String name,  String pin, int number) {
        this.name = name;
        this.pin = pin;
        this.number = number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumber(int accountNumber){
        return number;
    }

    public void deposit(int amount) {
        validateDeposit(amount);
        balance = amount + balance;

    }


    public int getBalance(){
        return balance;
    }

    public void withdraw(int amount,String pin) {
        validateWithdraw(amount, pin);
        validatePin(pin);
        balance -= amount;
    }

    public void checkBalance(int totalAmount, String pin) {
        totalAmount= balance;
    }




    public void validateWithdraw(int amount, String pin){
        if(amount <= 0)throw new InvalidAmountException("you cant withdraw negative number and zero");
        if(amount > balance) throw new InsufficientFundException("You have an insufficient fund to withdraw");
        if(!this.pin.equals(pin)) throw new InvalidPinException("Incorrect pin");
    }

    public void validateDeposit(int amount){
        if(amount <= 0) throw new InvalidAmountException("Amount should be valid");
    }
    public void validatePin(String pin){
       if(!this.pin.equals(pin)) throw new InvalidPinException("Incorrect pin");
    }



}