package extendsAndPolymorphismLessonFive;


import extendsAndPolymorphismLessonFive.interfaces.menСlothing;
import extendsAndPolymorphismLessonFive.interfaces.womanClothing;

public class Studio implements womanClothing, menСlothing {
    @Override
    public void dressMan(Clothes[] arr) {
        for (Clothes clothes : arr) {
            if (clothes instanceof Tshirt) {
                ((Tshirt) clothes).printMen();
            } else if (clothes instanceof Pants) {
                ((Pants) clothes).printMen();
            } else if (clothes instanceof Tie) {
                ((Tie) clothes).printMen();
            }
        }
    }

    @Override
    public void dressWoman(Clothes[] arr) {
        for (Clothes clothes : arr) {
            if (clothes instanceof Tshirt) {
                ((Tshirt) clothes).printWoman();
            } else if (clothes instanceof Pants) {
                ((Pants) clothes).printMen();
            } else if (clothes instanceof Skirt) {
                ((Skirt) clothes).printWoman();
            }
        }

    }

}
