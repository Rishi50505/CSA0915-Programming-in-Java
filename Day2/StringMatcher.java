public class Stringmatcher {
    public static int match(String s1, String s2) {
        int count = 0;
        
        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            if (Character.toLowerCase(s1.charAt(i)) == Character.toLowerCase(s2.charAt(i))) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        String S1 = "What";
        String S2 = "watch";
        
        System.out.println("Total number of matches:");
        System.out.println(match(S1, S2));
    }
}
