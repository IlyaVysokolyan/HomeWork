package StringNumbersDatesLesson2;

public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        return Math.PI*Math.pow(radius,2);
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        return 4/3*Math.PI*Math.pow(radius,3) ;
    }

    public static boolean isTriangleRightAngled(double a, double b, double c) {
        if (a+b>c||a+c>b||b+c>a){
            return true;
        }else

        return false;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTriangleRightAngled, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {

        if(isTriangleRightAngled(a,b,c)){
            double p=(a+b+c)/2;
            return Math.sqrt((p*(p-a)*(p-b)*(p-c)));
        }else return -1;
    }
}
