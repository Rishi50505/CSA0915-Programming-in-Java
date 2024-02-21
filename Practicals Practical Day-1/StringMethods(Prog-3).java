public class StringExample {

    public static void main(String[] args) {

        // String constructors
        String str1 = "Hello world!"; // String literal
        String str2 = new String("Another string"); // Using constructor
        String str3 = new String(new char[] {'C', 'h', 'a', 'r'}); // From char array
        String str4 = new String("Welcome" + " home"); // Concatenation in constructor

        System.out.println("String literals: " + str1);
        System.out.println("Using constructor: " + str2);
        System.out.println("From char array: " + str3);
        System.out.println("Concatenation in constructor: " + str4);

        // String methods
        int length = str1.length();
        boolean isEmpty = str2.isEmpty();
        char firstChar = str3.charAt(0);
        String upperCase = str4.toUpperCase();
        String lowerCase = str1.toLowerCase();
        boolean startsWithH = str2.startsWith("H");
        boolean endsWithD = str3.endsWith("d");
        int substringIndex = str4.indexOf("home");
        String substring = str1.substring(7);

        System.out.println("\nString methods:");
        System.out.println("Length: " + length);
        System.out.println("IsEmpty: " + isEmpty);
        System.out.println("First char: " + firstChar);
        System.out.println("ToUpper: " + upperCase);
        System.out.println("ToLower: " + lowerCase);
        System.out.println("StartsWithH: " + startsWithH);
        System.out.println("EndsWithD: " + endsWithD);
        System.out.println("IndexOf substring: " + substringIndex);
        System.out.println("Substring: " + substring);

    }
}