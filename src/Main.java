public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);


        System.out.println("El radio del círculo es: " + circle.getRadius());


        Rectangle rectangle = new Rectangle(10, 20);


        System.out.println("El ancho del rectángulo es: " + rectangle.getWidth());
        System.out.println("El alto del rectángulo es: " + rectangle.getHeight());


        Square square = new Square(10);


        System.out.println("El lado del cuadrado es: " + square.getSide());


    }
}