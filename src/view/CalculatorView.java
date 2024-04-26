package view;

import service.CalculatorService;

import java.util.Scanner;

public class CalculatorView {
    private final CalculatorService calculatorService;

    public CalculatorView(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my Calculator");

        while (true) {
            System.out.print("Enter operand 1: ");
            double operand1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            String operator = scanner.next();

            System.out.print("Enter operand 2: ");
            double operand2 = scanner.nextDouble();

            try {
                System.out.println("Result: " + calculatorService.Calculate(operand1, operand2, operator));
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("Do you want to perform another calculation? (Y/N): ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("Y")) {
                break;
            }
        }

        System.out.println("Thank you for using this Calculator");
        scanner.close();
    }
}
