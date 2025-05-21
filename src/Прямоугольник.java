public class Прямоугольник extends Фигура {
    double a, b;

    Прямоугольник(double a, double b){
        this.a = a;
        this.b = b;
    }

    double getArea() {
        return a * b;
    }


    double getPerimeter() {
        return 2 * (a + b);
    }
}
