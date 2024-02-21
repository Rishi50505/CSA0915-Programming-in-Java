public class StringManipulations {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" ");
        builder.append("World");
        String result1 = builder.toString();
        System.out.println("StringBuilder result: " + result1);

        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" ");
        buffer.append("World");
        String result2 = buffer.toString();
        System.out.println("StringBuffer result: " + result2);

        int iterations = 1000000;
        long startTime, endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            builder = new StringBuilder();
            builder.append("String");
        }
        endTime = System.nanoTime();
        long builderTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            buffer = new StringBuffer();
            buffer.append("String");
        }
        endTime = System.nanoTime();
        long bufferTime = endTime - startTime;

        System.out.println("StringBuilder time: " + builderTime + " ns");
        System.out.println("StringBuffer time: " + bufferTime + " ns");
        System.out.println("Performance difference: " + (bufferTime - builderTime) + " ns");
    }
}
