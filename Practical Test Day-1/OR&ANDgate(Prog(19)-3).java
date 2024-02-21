public class LogicGates {

    public static void main(String[] args) {
        boolean input1 = true;
        boolean input2 = false;

        boolean outputOR = input1 || input2;
        System.out.println("OR output: " + outputOR);

        input1 = true;
        input2 = false;

        boolean outputAND = input1 && input2;
        System.out.println("AND output: " + outputAND);
    }
}
