package test;

import entity.Calculator;
import repository.CalculatorRepository;
import repository.CalculatorRepositoryImpl;

public class CalculatorRepositoryTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        CalculatorRepository calculatorRepository = new CalculatorRepositoryImpl();
        calculator.setOperand1(2);
        calculator.setOperand2(4);
        calculator.setOperator("*");
        calculatorRepository.Calculate(calculator);

        System.out.println(calculator.getResult());
    }
}
