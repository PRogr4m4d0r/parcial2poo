import java.util.Arrays;

class Square extends Rectangle {

    private double[] sides = {1.0, 1.0};

    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
        this.sides[0] = side;
        this.sides[1] = side;
    }

    @Override
    public double getArea() {
        return sides[0] * sides[1];
    }

    @Override
    public double getPerimeter() {
        return 4 * sides[0];
    }

    @Override
    public String toString() {
        return "Square{sides=" + Arrays.toString(sides) + '}';
    }

    public double[] getSides() {
        return sides;
    }

    public void setSides(double[] sides) {
        this.sides = sides;
    }
    public double getSide() {
        return sides[0];
    }
}