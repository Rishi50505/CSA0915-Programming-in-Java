public class NestedIfGreatest {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 35;
        int greatest = num1;

        if (num1 > num2) {
            greatest = num1;
        } else {
            if (num2 > num3) {
                greatest = num2;
            } else {
                greatest = num3;
            }
        }

        System.out.println("The greatest value is: " + greatest);
        if (greatest == num1) {
            System.out.println("Found in the first if statement.");
        } else if (greatest == num2) {
            System.out.println("Found in the second if statement.");
        } else {
            System.out.println("Found in the third if statement.");
        }
    }
}
