package BankApp;

public class InvalidPinException extends RuntimeException{
    public InvalidPinException(String incorrectPin) {
        super(incorrectPin);
    }
}
