package au.views;

import au.models.Number;
import au.views.enums.Command;

/**
 * Вью калькулятора
 */
public interface ICalculatorView {

    void printResult(Command command, Number num1, Number num2, String result);

    void getNextNumCommand();

    void getCommand();

}
