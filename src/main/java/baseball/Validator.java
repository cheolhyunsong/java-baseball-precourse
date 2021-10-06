package baseball;

import common.Const;
import exception.ValidException;
import exception.ValidateError;

import java.util.HashSet;
import java.util.Set;

public class Validator {
    protected boolean checkDigit(String pitchingNumber) {
        return pitchingNumber != null && pitchingNumber.length() == Const.MAX_DIGIT;
    }

    protected boolean isValidNumber(String pitchingNumber) {
        return pitchingNumber.matches(Const.NUMBER_REG_EX);
    }

    protected boolean isDuplicated(String pitchingNumber) {
        Set<Character> pitchingSet = new HashSet<>();

        for(char charNum : pitchingNumber.toCharArray()) {
            pitchingSet.add(charNum);
        }

        return pitchingSet.size() != Const.MAX_DIGIT;
    }

    public void validNumber(String pitchingNumber) {
        if(!checkDigit(pitchingNumber)) {
            throw new ValidException(ValidateError.INVALID_DIGIT);
        }

        if(!isValidNumber(pitchingNumber)) {
            throw new ValidException(ValidateError.INVALID_VALUE);
        }

        if(isDuplicated(pitchingNumber)) {
            throw new ValidException(ValidateError.DUPLICATE_NUMBER);
        }
    }

    public void validGameStatusAnswer(String answer) {
        if(!(Const.START.equals(answer) || Const.END.equals(answer))) {
            throw new ValidException(ValidateError.INVALID_VALUE);
        }
    }
}
