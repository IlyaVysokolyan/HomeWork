package extendsAndPolymorphismLessonThree;

public class Cat implements Actions {
    private String name;
    private int jumpHeight;
    private int runLength;

    public Cat(String name, int jumpHeight, int runLength) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int jumpHeight() {
        return jumpHeight;
    }

    @Override
    public int runLength() {
        return runLength;
    }

    @Override
    public void run() {
        System.out.println("Кот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает");
    }
}
