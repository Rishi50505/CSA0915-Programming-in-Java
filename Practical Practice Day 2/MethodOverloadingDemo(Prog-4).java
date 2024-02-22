public class MethodOverloadingDemo {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int singleValue) {
        return singleValue;  
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public int sum(int a, int b, int c) { 
        return a + b + c;
    }

    public int add(int b, int a) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();

        System.out.println(demo.sum(5, 3));   
        System.out.println(demo.sum(5, 3, 2)); 
        System.out.println(demo.sum(5));    
        System.out.println(demo.sum(3.5, 2.4)); 
        System.out.println(demo.add(3, 5));    
    }
}
