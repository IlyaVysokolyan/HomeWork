package exceptionAndDebugLessonOne.Exceptions;

public class EmailException extends Throwable {
    public EmailException() {
        System.out.println("Неверный формат ввода ПОЧТЫ, попробуйте в таком формате: 123ABCD@MAIL.RU");
    }
}
