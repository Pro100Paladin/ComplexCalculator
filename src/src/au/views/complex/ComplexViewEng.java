package au.views.complex;

import au.models.Number;
import au.views.ICalculatorView;
import au.views.enums.Command;

public class ComplexViewEng implements ICalculatorView {

    @Override
    public void printResult(Command command, Number num1, Number num2, String result) {
        System.out.println(num1 + " " + command.getCommand() + " " + num2 + " = " + result);
    }

    @Override
    public void getNextNumCommand() {
        System.out.print("Enter number: ");
    }

    @Override
    public void getCommand() {
        System.out.println("Enter command: ");
    }

}
