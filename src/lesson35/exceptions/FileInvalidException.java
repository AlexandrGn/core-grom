package lesson35.exceptions;

public class FileInvalidException extends Exception {
    public FileInvalidException() {
    }

    public FileInvalidException(String message) {
        super(message);
    }
}
