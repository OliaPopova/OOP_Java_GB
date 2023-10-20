import controller.CalculatorController;
import model.ComplexNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Приветствую Вас в калькуляторе!");
//        ComplexNumber number1 = new ComplexNumber(5,2);
//        System.out.println(number1);
        CalculatorController calculatorController = new CalculatorController();
        do {
            calculatorController.initCalculator();
            calculatorController.getResult();
            System.out.println("""
                Продолжить?
                1 - да
                2 - нет
                """);
        } while (!new Scanner(System.in).next().equals("2"));
    }
}