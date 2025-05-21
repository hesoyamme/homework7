public class Круг extends Фигура {
    double radius;

    Круг(double r){
        radius = r;
    }


    double getArea() {
        return 3.14 * radius * radius;
    }


    double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}
