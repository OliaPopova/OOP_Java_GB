package controller;

import service.CalculatorService;
import view.CalculatorView;

public class CalculatorController {
    private final CalculatorService calculatorService = new CalculatorService();
    CalculatorView calculatorView = new CalculatorView();

    public void initCalculator(){
        calculatorService.initCalculator();
        calculatorView.printOnConsole(String.format("Числа: %s, %s",calculatorService.getNumber1(),calculatorService.getNumber2()));
        startCalculating();
    }

    public void startCalculating(){
        calculatorService.start();
    }

    public void getResult(){
        calculatorView.printOnConsole(String.format("Результат операции %s",calculatorService.getResult()));
        System.out.println(calculatorService.getResult());
    }
}
