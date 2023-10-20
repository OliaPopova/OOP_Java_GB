package service;

import model.ComplexNumber;
import model.ComplexNumberCalculator;
import model.IComplexNumber;
import model.Operator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculatorService implements ICalculatorService {
    private static ComplexNumberCalculator complexNumberCalculator;
    private ComplexNumber result = null;

    @Override
    public ComplexNumber createComplexNumber() {
        IComplexNumber number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Создание комплексного числа вида a + bi.");
        System.out.println("Введите a: ");
        double real = sc.nextDouble();
        System.out.println("Введите b: ");
        double imaginary = sc.nextDouble();
        return new ComplexNumber(real, imaginary);
    }

    public void initCalculator() {
        complexNumberCalculator = new ComplexNumberCalculator(createComplexNumber(), createComplexNumber());
    }

    @Override
    public void add() {
        double realPart = complexNumberCalculator.getNumber1().getReal() + complexNumberCalculator.getNumber2().getReal();
        double imaginaryPart = complexNumberCalculator.getNumber1().getImaginary() + complexNumberCalculator.getNumber2().getImaginary();
        result = new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public void sub() {
        double realPart = complexNumberCalculator.getNumber1().getReal() - complexNumberCalculator.getNumber2().getReal();
        double imaginaryPart = complexNumberCalculator.getNumber1().getImaginary() - complexNumberCalculator.getNumber2().getImaginary();
        result = new ComplexNumber(realPart, imaginaryPart);
    }

    /**
     * формула сложения комплексных чисел (a+bi)*(c+di) = (ac-bd) + (ad+bc)i
     */
    @Override
    public void mul() {
        double realPart = (complexNumberCalculator.getNumber1().getReal() * complexNumberCalculator.getNumber2().getReal()) - (complexNumberCalculator.getNumber1().getImaginary() * complexNumberCalculator.getNumber2().getImaginary());
        double imaginaryPart = (complexNumberCalculator.getNumber1().getReal() * complexNumberCalculator.getNumber2().getImaginary()) + (complexNumberCalculator.getNumber1().getImaginary() * complexNumberCalculator.getNumber2().getReal());
        result = new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public void div() {
        System.out.println("Выполняется...");
    }

    public void start() {
        Map<String, Operator> operatorMap = new HashMap<>();
        operatorMap.put("+", Operator.ADD);
        operatorMap.put("-", Operator.SUB);
        operatorMap.put("*", Operator.MUL);
        operatorMap.put("/", Operator.DIV);
        System.out.println("""
                Выберите оператор :
                "+" - сложение
                "-" - вычитание
                "*" - умнодение
                "/" - деление
                """);
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.next();
        if (operatorMap.containsKey(operator)) {
            switch (operatorMap.get(operator)){
                case ADD -> add();
                case SUB -> sub();
                case MUL -> mul();
                case DIV -> div();
            }
        } else System.out.println("Вы ввели неверный оператор.");
    }

    public ComplexNumber getResult() {
        return result;
    }

    public ComplexNumber getNumber1(){
        return complexNumberCalculator.getNumber1();
    }

    public ComplexNumber getNumber2(){
        return complexNumberCalculator.getNumber2();
    }
}
