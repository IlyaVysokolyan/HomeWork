package exceptionAndDebugLessonOne.Exceptions;

public class NumberPhoneException extends Exception{
    public NumberPhoneException() {
        System.out.println("Неверный формат ввода телефона, попробуйте в таком формате: +7 ХХХ ХХХ ХХ ХХ");
    }
}
