package examples.partner_matcher;

public class Regular {

    public static void main(String[] args) {
        Square square = new Square(37, 13);
        Circle circle = new Circle(25.0);

        System.out.println("The square area is: " + calculateArea(square));
        System.out.println("The circle area is: " + calculateArea(circle));
    }

    interface Shape {
    }

    static class Square implements Shape {
        final Integer high;
        final Integer width;

        public Square(Integer high, Integer width) {
            this.high = high;
            this.width = width;
        }
    }

    static class Circle implements Shape {
        final Double radius;

        public Circle(Double radius) {
            this.radius = radius;
        }
    }

    public static Double calculateArea(Shape shape) {
        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return Math.PI * Math.pow(c.radius, 2);
        }

        if (shape instanceof Square) {
            Square s = (Square) shape;
            return (double) (s.high * s.width);
        }

        return 0.0;
    }


}
