class Animal {
        String type;
      
        Animal(String type) {
          this.type = type;
          System.out.println("Animal: " + type + " is created.");
        }
      
        public void move() {
          System.out.println("Animal is moving.");
        }
      }
      
      class Dog extends Animal {
        String sound;
      
        Dog(String type, String sound) {
          super(type); 
          this.sound = sound;
          System.out.println("Dog: " + type + " is created.");
        }
      
        @Override
        public void move() {
          super.move(); 
          System.out.println("Dog is walking.");
        }
      
        public void bark() {
          System.out.println("Dog says " + sound);
        }
      }
      
      public class Java {
        public static void main(String[] args) {
          Dog dog = new Dog("Labrador", "Woof");
          dog.move();
          dog.bark();
        }
      }