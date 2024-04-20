public class Calculator {
    private double firstOperand;
    private double secondOperand;
    private char operator;

    public Calculator() {
        firstOperand = 0;
        secondOperand = 0;
        operator = ' ';
    }

    public void setFirstOperand(double operand) {
        this.firstOperand = operand;
    }

    public void setSecondOperand(double operand) {
        this.secondOperand = operand;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double calculate() {
        switch (operator) {
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand == 0) {
                    // Handle division by zero
                    return Double.NaN;
                }
                return firstOperand / secondOperand;
            case '%':
                return firstOperand % secondOperand;
            case '^':
                return Math.pow(firstOperand, secondOperand);
            default:
                return secondOperand; // Return second operand if no operator is set
        }
    }
}