package muthusir.exceptionhandler;

public class StudentNotFound extends RuntimeException {
    public StudentNotFound(String message) {
        super(message);
    }
}
