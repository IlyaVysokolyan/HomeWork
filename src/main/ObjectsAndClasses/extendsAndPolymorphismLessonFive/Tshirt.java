package extendsAndPolymorphismLessonFive;

import extendsAndPolymorphismLessonFive.interfaces.printMen;
import extendsAndPolymorphismLessonFive.interfaces.printWoman;

public class Tshirt extends Clothes implements printMen, printWoman {

    private String clothesName = "Футболка";

    public Tshirt(Size size, int price, Color color) {
        super(size, price, color);
    }

    public String getClothesName() {
        return clothesName;
    }

    @Override
    public void printMen() {
        System.out.print("\nМужская " + getClothesName() + ": " +
                getSize().getDescription() +
                ", цена " + getPrice() + ", цвет " + getColor().getColor());
    }

    @Override
    public void printWoman() {
        System.out.print("\nЖенская " + getClothesName() + ": " +
                getSize().getDescription() +
                ", цена " + getPrice() + ", цвет " + getColor().getColor());
    }

}
