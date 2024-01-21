package au.services.complex;

import au.models.Complex;
import au.services.ICalculatorService;

public class ComplexCalculatorService implements ICalculatorService<Complex> {

    public Complex add(Complex num1, Complex num2) {
        double real = num1.getReal() + num2.getReal();
        double image = num1.getImage() + num2.getImage();
        return new Complex(real, image);
    }

    public Complex sub(Complex num1, Complex num2) {
        double real = num1.getReal() - num2.getReal();
        double image = num1.getImage() - num2.getImage();
        return new Complex(real, image);
    }


    public Complex mul(Complex num1, Complex num2) {
        double real = num1.getReal() * num2.getReal();
        double image = num1.getImage() * num2.getImage();
        return new Complex(real, image);
    }


    public Complex div(Complex num1, Complex num2) {
        double real = num1.getReal() / num2.getReal();
        double image = num1.getImage() / num2.getImage();
        return new Complex(real, image);
    }
}
