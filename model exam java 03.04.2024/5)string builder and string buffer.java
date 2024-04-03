public class Java {

        public static void main(String[] args) {
          StringBuilder message = new StringBuilder("Hello, ");
          message.append("World!").append(" This is a string built with StringBuilder.");
          System.out.println(message);
          StringBuffer buffer = new StringBuffer("Java ");
          buffer.append("offers ").insert(5, "powerful ").append("string manipulation capabilities.");
          System.out.println(buffer);
        }
      }