package Day2;

public class TernaryOperator {
    public static void main(String[] args) {

        //ternary operator ? = Return 1 of 2 values if a condition is true
        //variable = (condition) ? ifTrue : ifFalse;

        int score = 70;

       /* if (score >= 60) {
            System.out.println("You passed!");
        }
        else {
            System.out.println("You failed!");
        }*/

        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        System.out.println(passOrFail);

    }
}
