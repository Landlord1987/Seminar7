package org.example;

import org.example.Decorator.*;

/**
 * Старотовый класс, создающий калькулятор и запускающий view в консоль
 */
public class Main {
    public static void main(String[] args) {

        iCalculable calculator = new ComplexNumberDecorator(new ComplexNumberCalculator(0,0),new Logger());
        ViewCalculator view = new ViewCalculator(calculator);
        view.run();
    }
}