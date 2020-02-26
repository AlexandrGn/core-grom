package lesson35.exceptions;

public class InvalidInput extends Exception{
    public InvalidInput() {
    }

    public InvalidInput(String message) {
        super(message);
    }
}
