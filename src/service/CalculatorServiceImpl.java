package service;

import entity.Calculator;
import repository.CalculatorRepository;

public class CalculatorServiceImpl implements CalculatorService{
    private final CalculatorRepository calculatorRepository;

    public CalculatorServiceImpl(CalculatorRepository calculatorRepository) {
        this.calculatorRepository = calculatorRepository;
    }

    @Override
    public int Calculate(double oprn1, double oprn2, String oprator) {
        Calculator calculator = new Calculator();
        calculator.setOperand1(oprn1);
        calculator.setOperand2(oprn2);
        calculator.setOperator(oprator);

        calculatorRepository.Calculate(calculator);

        return calculator.getResult();
    }
}
