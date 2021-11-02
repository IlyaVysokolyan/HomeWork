package extendsAndPolymorphismLessonFive;

import extendsAndPolymorphismLessonFive.interfaces.printMen;

public class Tie extends Clothes implements printMen {

    private String clothesName = "Галстук";

    public Tie(Size size, int price, Color color) {
        super(size, price, color);
    }

    public String getClothesName() {
        return clothesName;
    }

    @Override
    public void printMen() {
        System.out.print("\nМужской " + getClothesName() + ": " +
                getSize().getDescription() +
                ", цена " + getPrice() + ", цвет " + getColor().getColor());
    }
}
