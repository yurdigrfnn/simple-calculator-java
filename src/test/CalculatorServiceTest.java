package test;

import entity.Calculator;
import repository.CalculatorRepository;
import repository.CalculatorRepositoryImpl;
import service.CalculatorService;
import service.CalculatorServiceImpl;

public class CalculatorServiceTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        CalculatorRepository calculatorRepository = new CalculatorRepositoryImpl();
        CalculatorService calculatorService = new CalculatorServiceImpl(calculatorRepository);

        System.out.println(calculatorService.Calculate(7,4,"*"));
    }
}
