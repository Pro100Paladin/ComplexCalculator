package au.views.complex;

import au.models.Number;
import au.views.ICalculatorView;
import au.views.enums.Command;

public class ComplexViewRUS implements ICalculatorView {

    @Override
    public void printResult(Command command, Number num1, Number num2, String result) {
        System.out.println(num1 + " " + command.getCommand() + " " + num2 + " = " + result);
    }

    @Override
    public void getNextNumCommand() {
        System.out.print("Введите число: ");
    }

    @Override
    public void getCommand() {
        System.out.print("Введите команду: ");
    }

}
