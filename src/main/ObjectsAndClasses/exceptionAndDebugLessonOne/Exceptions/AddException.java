package exceptionAndDebugLessonOne.Exceptions;

public class AddException extends Exception{
    public AddException() {
        System.out.println("Неверный формат ввода покупателя, нужно по шаблону:\n" +
                "add ИМЯ ФАМИЛИЯ ПОЧТА ТЕЛЕНФОН");
    }
}
