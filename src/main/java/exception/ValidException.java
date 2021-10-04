package exception;

public class ValidException extends RuntimeException{
    public ValidException() {
        super();
    }

    public ValidException(ValidateError validateError) {
        super(validateError.getMessage());
    }
}
