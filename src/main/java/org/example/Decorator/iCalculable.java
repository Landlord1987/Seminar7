package org.example.Decorator;


/**
 * Интерфейс, описывающий реализацию действия с калькулятором комплексных чисел
 */
public interface iCalculable {
    iCalculable sum(ComplexNumberCalculator arg);
    iCalculable multi(ComplexNumberCalculator arg);
    ComplexNumberCalculator getComplexNumber();
    int getReal();
    int getImaginary();
    void setReal(int real);
    void setImaginary(int imaginary);



}
