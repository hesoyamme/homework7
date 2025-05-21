public class Треугольник extends Фигура {
    double a, b, c;

    Треугольник(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getArea() {
    double s = getPerimeter() / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }
}
