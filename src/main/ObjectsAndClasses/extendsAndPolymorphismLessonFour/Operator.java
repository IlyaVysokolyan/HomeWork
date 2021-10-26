package extendsAndPolymorphismLessonFour;

public class Operator extends Employee {

    private static final double FIX_SALARY = 50000;

    public Operator() {
        setSalary(getMonthSalary());
    }

    //Генератор дохода менеджера
    public double getMonthSalary() {
        return FIX_SALARY;
    }
}
