package extendsAndPolymorphismLessonFour;

//Возможнасти компании
public interface Capability {
    void hire(Employee employee);

    void hireAll(Employee employee, int countEmployee);

    void fire(int count);
}
