class OuterClass {
        int x = 10;
      
        class InnerClass {
          int y = 5;
      
          public void accessOuter() {
            System.out.println("Inner Class accessing outer class variable: " + x);
          }
        }
      
        public void createInner() {
          InnerClass inner = new InnerClass();
          inner.accessOuter();
        }
      }
      
      public class Java {
        public static void main(String[] args) {
          OuterClass outer = new OuterClass();
          outer.createInner();
        }
      }