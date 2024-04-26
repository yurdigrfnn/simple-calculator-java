package test;

import repository.CalculatorRepository;
import repository.CalculatorRepositoryImpl;
import service.CalculatorService;
import service.CalculatorServiceImpl;
import view.CalculatorView;

public class CalculatorViewTest {
    public static void main(String[] args) {
        CalculatorRepository calculatorRepository = new CalculatorRepositoryImpl();
        CalculatorService calculatorService = new CalculatorServiceImpl(calculatorRepository);
        CalculatorView calculatorView = new CalculatorView(calculatorService);

        calculatorView.start();
    }
}
