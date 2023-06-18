package org.example.Decorator;

/**
 * Класс расширяющий функционал класса ComplexNumberCalculator функционалом логирования
 */
public class ComplexNumberDecorator implements iCalculable{
    private ComplexNumberCalculator complexNumberCalculator;
    private Logger logger;

    /**
     * Конструктор класса
     * @param complexNumberCalculator Старый калькулятор комплексных чисел
     * @param logger
     */
    public ComplexNumberDecorator(ComplexNumberCalculator complexNumberCalculator, Logger logger) {
        this.complexNumberCalculator = complexNumberCalculator;
        this.logger = logger;
    }

    /**
     * Метод суммирования, использующий функционал старого класса суммирования
     * @param arg комплексное число
     * @return результат суммирования комплексных чисел
     */
    @Override
    public iCalculable sum(ComplexNumberCalculator arg) {
        ComplexNumberCalculator cnm = complexNumberCalculator;
        logger.log(String.format("Первое комплексное число %d + i*%d. Начало вызова метода sum с вторым комплексным числом %d + i*%d", cnm.getReal(), cnm.getImaginary(), arg.getReal(), arg.getImaginary()));
        iCalculable result = complexNumberCalculator.sum(arg);
        logger.log(String.format("Вызов метода sum произошел"));
        return result;
    }
    /**
     * Метод умножения, использующий функционал старого класса суммирования
     * @param arg комплексное число
     * @return результат перемножения комплексных чисел
     */
    @Override
    public iCalculable multi(ComplexNumberCalculator arg) {
        ComplexNumberCalculator cnm = complexNumberCalculator;
        logger.log(String.format("Первое комплексное число %d + i*%d. Начало вызова метода multi с вторым комплексным числом %d + i*%d", cnm.getReal(), cnm.getImaginary(), arg.getReal(), arg.getImaginary()));
        iCalculable result = complexNumberCalculator.multi(arg);
        logger.log(String.format("Вызов метода multi произошел"));
        return result;
    }

    @Override
    public ComplexNumberCalculator getComplexNumber() {
        return complexNumberCalculator.getComplexNumber();
    }

    @Override
    public int getReal() {
        return complexNumberCalculator.getReal();
    }

    @Override
    public int getImaginary() {
        return complexNumberCalculator.getImaginary();
    }

    @Override
    public void setReal(int real) {
        complexNumberCalculator.setReal(real);
    }

    @Override
    public void setImaginary(int imaginary) {
        complexNumberCalculator.setImaginary(imaginary);
    }


}
