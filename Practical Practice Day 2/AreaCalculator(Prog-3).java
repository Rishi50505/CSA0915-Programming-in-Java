public class AreaCalculator {

    public static class Shape {
        public void area(int a) {
            System.out.println("Area of square: " + a * a);
        }
    }

    public static class Rectangle extends Shape {
        public void area(int length, int width) {
            System.out.println("Area of rectangle: " + length * width);
        }
    }

    public static void main(String[] args) {
        Shape square = new Shape();
        Rectangle rectangle = new Rectangle();

        square.area(5); 
        rectangle.area(4, 3);
    }
}
