package org.example.Decorator;

/**
 * Класс калькулятора комплексных чисел
 */

public class ComplexNumberCalculator implements iCalculable{

    private int x,y;

    /**
     * Переопределенный метод toString
     * @return
     */
    @Override
    public String toString() {
        return "Z=" + x + " + i*" + y; }


    /**
     * Конструктор класса
     * @param real Вещественная часть комплексного числа
     * @param imaginary Мнимая часть комплексного числа
     */
    public ComplexNumberCalculator(int real, int imaginary) {
        this.x = real;
        this.y = imaginary;
    }

    /**
     * Метод суммирования комплексного числа
     * @param arg Прибавляемое комплексное число
     * @return суммированное комплексное число
     */
    @Override
    public iCalculable sum(ComplexNumberCalculator arg) {
        this.x += arg.x;
        this.y += arg.y;
        return this;
    }

    /**
     * Метод умножения комплексного числа
     * @param arg Умножаемое комплексное число
     * @return Умноженное комплексное число
     */
    @Override
    public iCalculable multi(ComplexNumberCalculator arg) {
        int one = x * arg.x - y * arg.y;
        int two = x * arg.y + y * arg.x;
        this.x = one;
        this.y = two;
        return this;
    }

    /**
     * Метод получения значений комплексного числа
     * @return комплексное число
     */
    public ComplexNumberCalculator getComplexNumber() {
        return new ComplexNumberCalculator(x,y);
    }

    @Override
    public int getReal() {
        return x;
    }

    @Override
    public int getImaginary() {
        return y;
    }

    @Override
    public void setReal(int real) {
        this.x = real;
    }

    @Override
    public void setImaginary(int imaginary) {
        this.y = imaginary;
    }

}
