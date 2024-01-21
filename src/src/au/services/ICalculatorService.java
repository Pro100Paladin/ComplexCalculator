package au.services;


public interface ICalculatorService<T> {

    T add(T num1, T num2);

    T sub(T num1, T num2);

    T mul(T num1, T num2);

    T div(T num1, T num2);


}
