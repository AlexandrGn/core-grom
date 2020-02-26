package lesson35.exceptions;

public class BadRequestException extends Exception{
    public BadRequestException() {
    }

    public BadRequestException(String message) {
        super(message);
    }
}
