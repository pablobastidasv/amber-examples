package examples.partner_matcher;

public class Amber {

    public static void main(String[] args) {
        Regular.Square square = new Regular.Square(37, 13);
        Regular.Circle circle = new Regular.Circle(25.0);

        System.out.println("The square area is: " + calculateArea(square));
        System.out.println("The circle area is: " + calculateArea(circle));
    }

    interface Shape {}
    record Square (Integer high, Integer width) implements Regular.Shape {}
    record Circle(Double radius) implements Regular.Shape{}

    public static Double calculateArea(Regular.Shape shape) {
        if (shape instanceof Regular.Circle c) {
            return Math.PI * Math.pow(c.radius, 2);
        }

        if (shape instanceof Regular.Square s) {
            return (double) (s.high * s.width);
        }

        return 0.0;
    }

}
