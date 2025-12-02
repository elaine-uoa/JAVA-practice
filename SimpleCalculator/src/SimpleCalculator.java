import java.util.Scanner;

public class SimpleCalculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Simple Calculator!");
        System.out.println("Enter first number: ");

        //validate the first input, make sure it is a number
        String firstInput = sc.nextLine();
        while (!isNumber(firstInput)) {
            System.out.println("Invalid input. Please enter a number: ");
            firstInput = sc.nextLine();
        }

        //store the result temporarily
        double result = Double.parseDouble(firstInput);

        //ask for operator 
        while (true) {
            System.out.println("Enter operator (+, -, *, /) or = to calculate: ");
            String operator = sc.nextLine();
            if (operator.equals("=")) {
                System.out.println("Result: " + result);
                break;
            }

            //validate operator, make sure it is a valid operator
            if (!isOperator(operator)) {
                System.out.println("Invalid operator. Please enter a valid operator: ");
                continue;
            }

            //validate the second input, make sure it is a number
            System.out.println("Enter next number: ");
            String secondInput = sc.nextLine();

            while (!isNumber(secondInput)) {
                System.out.println("Invalid input. Please enter a number: ");
                secondInput = sc.nextLine();
            }
            
            double secondNumber = Double.parseDouble(secondInput);

            //calculate the result
            switch (operator) {
                case "+":
                    result += secondNumber;
                    break;
                case "-":
                    result -= secondNumber;
                    break;
                case "*":
                    result *= secondNumber;
                    break;
                case "/": 
                    if (secondNumber != 0) {
                        result /= secondNumber;
                    } else {
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                    break;
            }

            System.out.println(result);

        }

        sc.close();
   
    }

    private static boolean isNumber(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperator(String operator) {
        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/");
    }

}
