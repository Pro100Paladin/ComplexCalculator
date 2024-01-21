package au;

import au.controllers.ICalculatorController;
import au.controllers.complex.ComplexCalculatorController;
import au.models.Complex;

public class App 
{
    public static void main( String[] args )
    {
        ICalculatorController<Complex> controller = new ComplexCalculatorController();
        controller.run();
    }
}
