package service;

import model.ComplexNumber;
import model.IComplexNumber;

public interface ICalculatorService {
    ComplexNumber createComplexNumber();

    void add();
    void sub();
    void mul();
    void div();

}