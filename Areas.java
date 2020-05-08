abstract class Figure{
    abstract double calculateArea();
}

public class Areas {

    public static class Circle extends Figure{

        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double calculateArea() {
            return radius *  radius *  Math.PI;
        }

        public String toString() {
            return "The area of the circle[radius = " + radius + "]: " + calculateArea();
        }


    }
    public static class Triangle extends Figure {
        private double a;
        private double b;
        private double c;
        private double hypotenuse;
        public Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
            hypotenuse = Math.max(a, Math.max(b, c));
        }

        public double calculateArea() {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        public String toString() {
            if ((hypotenuse * hypotenuse) == (a * a) + (b * b))
            return "The area of the triangle: " + calculateArea() + ", triangle is right-angle";
            else return "The area of the triangle: " + calculateArea() + ", triangle is non right-angle";
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(7);
        System.out.println(circle);
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);
    }
}
