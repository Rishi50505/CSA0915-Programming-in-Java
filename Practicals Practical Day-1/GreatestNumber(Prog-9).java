public class GreatestNumber {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 35;

        int greatest = (num1 > num2) ? num1 : num2; 
        greatest = (greatest > num3) ? greatest : num3;  

        System.out.println("The greatest number is: " + greatest);
    }
}
