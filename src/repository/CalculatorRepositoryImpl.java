package repository;

import entity.Calculator;

public class CalculatorRepositoryImpl implements CalculatorRepository{

    @Override
    public void Calculate(Calculator calt) {
        double operand1 = calt.getOperand1();
        double operand2 = calt.getOperand2();
        String operator = calt.getOperator();
        int result;

        switch (operator) {
            case "+":
                result = (int) (operand1 + operand2);
                break;
            case "-":
                result = (int) (operand1 - operand2);
                break;
            case "*":
                result = (int) (operand1 * operand2);
                break;
            case "/":
                if (operand2 != 0) {
                    result = (int) (operand1 / operand2);
                } else {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }

        calt.setResult(result);
    }
}
