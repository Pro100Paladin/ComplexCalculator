package au.controllers;

import au.views.enums.Command;


public interface ICalculatorController<T> extends Runnable{

    T printResult(Command command, T num1, T num2);

}
