public class DataTypeConversionDemo {

    public static void main(String[] args) {

        byte byteValue = 127;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        System.out.println("Implicit conversions:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);

        intValue = (int) doubleValue;
        shortValue = (short) intValue;
        byteValue = (byte) shortValue;

        System.out.println("\nExplicit conversions:");
        System.out.println("double to int: " + intValue);
        System.out.println("int to short: " + shortValue);
        System.out.println("short to byte: " + byteValue);

        intValue = 2147483647;
        longValue = intValue + 1;

        System.out.println("\nOverflow:");
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);

        byteValue = -128;
        byteValue--;

        System.out.println("\nUnderflow:");
        System.out.println("byte: " + byteValue);

    }
}