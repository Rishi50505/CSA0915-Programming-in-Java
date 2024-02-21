public class Mavenproject2 {
   public static void main(String[] args) {
       
       System.out.println("Integer data types:");
       byte byteValue = 127;  
       short shortValue = 32767; 
       int intValue = 2147483647;  
       long longValue = 9223372036854775807L;  
       System.out.println("byte: " + byteValue);
       System.out.println("short: " + shortValue);
       System.out.println("int: " + intValue);
       System.out.println("long: " + longValue);

       System.out.println("\nFloating-point data types:");
       float floatValue = 3.14159F;  
       double doubleValue = 1.7976931348623157E+308;  
       System.out.println("float: " + floatValue);
       System.out.println("double: " + doubleValue);

       
       System.out.println("\nCharacter data type:");
       char charValue = 'a';
       System.out.println("char: " + charValue);

       
       System.out.println("\nBoolean data type:");
       boolean booleanValue = true;
       System.out.println("boolean: " + booleanValue);
   }
}