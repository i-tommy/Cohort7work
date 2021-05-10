package africa.semicolon.tddClass;

public class Calculator {
    public int add(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public int multiply(int firstNumber, int secondNumber) {
        int multiply = firstNumber * secondNumber;
        return multiply;

    }

    public int subtract(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber){
            firstNumber = firstNumber + secondNumber;
            secondNumber = firstNumber - secondNumber;
            firstNumber = firstNumber - secondNumber;
        }
        System.out.println(firstNumber + " "+ secondNumber);
        int subtract = firstNumber - secondNumber;
        return subtract;

    }

    public double divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return 0.0;
        }
        else{
            return (double) firstNumber / secondNumber;
        }
        }

    public static void main(String [] args){
        Calculator calculator = new Calculator();
        System.out.println(calculator.subtract(5, 10));
    }

}
