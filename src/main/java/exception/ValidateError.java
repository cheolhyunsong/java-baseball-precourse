package exception;

public enum ValidateError {
    INVALID_DIGIT("수의 자릿수가 다릅니다."),
    INVALID_NUMBER("유효하지 않은 숫자입니다."),
    DUPLICATE_NUMBER("중복된 숫자가 존재합니다.");

    private String validateError;

    ValidateError(String validateError) {
        this.validateError = validateError;
    }

    public String getMessage() {
        return this.validateError;
    }
}
