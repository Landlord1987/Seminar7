package org.example.Decorator;
import java.util.Scanner;

/**
 * Класс реализует взаимодействие с пользователем и выводит результаты в консоль
 */
public class ViewCalculator {

    private iCalculable calculator;

    /**
     * Конструктор класса
     * @param calculator объект калькулятора
     */
    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    /**
     * Метод реализующий бесконечный цикл взаимодействия с пользователем через консоль до вызова выполнения команды завершения
     */
    public void run() {
        while (true) {
            calculator.setReal(promptInt("Введите реальный аргумент ПЕРВОГО комплексного числа: "));
            calculator.setImaginary(promptInt("Введите минимый аргумент ПЕРВОГО комплексного числа: "));

            //calculator.sum(primaryArg);
            //iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    int real2 = promptInt("Введите реальный аргумент ВТОРОГО комплексного числа: ");
                    int imaginary2 = promptInt("Введите минимый аргумент ВТОРОГО комплексного числа: ");
                    ComplexNumberCalculator arg = new ComplexNumberCalculator(real2, imaginary2);
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int real2 = promptInt("Введите реальный аргумент ВТОРОГО комплексного числа: ");
                    int imaginary2 = promptInt("Введите минимый аргумент ВТОРОГО комплексного числа: ");
                    ComplexNumberCalculator arg = new ComplexNumberCalculator(real2, imaginary2);
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumberCalculator result = calculator.getComplexNumber();
                    System.out.printf("Результат %s\n", result.toString());
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    /**
     * Метод чтения консоли и вывода в консоль сообщения
     * @param message сообщение, передаваемое в консоль
     * @return считанное значение введенной строки
     */
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    /**
     * Метод чтения консоли и вывода в консоль сообщения
     * @param message сообщение, передаваемое в консоль
     * @return считанное значение введенной строки Int
     */
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
