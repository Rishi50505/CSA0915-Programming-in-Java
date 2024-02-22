public class ConstructorDemo {
   int a, b;

   ConstructorDemo() {
       this(20, 25); 
   }
   ConstructorDemo(int a, int b) {
       this.a = a;
       this.b = b;
   }
   void disp() {
       System.out.println("a = " + a + ", b = " + b);
   }
   public static void main(String[] args) {
       ConstructorDemo obj1 = new ConstructorDemo();   
       ConstructorDemo obj2 = new ConstructorDemo(30, 40);  
       obj1.disp();
       obj2.disp();
   }
}
