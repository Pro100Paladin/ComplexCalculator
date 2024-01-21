package au.controllers.complex;

import au.controllers.ICalculatorController;
import au.models.Complex;
import au.rules.RuleFactory;
import au.services.ICalculatorService;
import au.services.complex.ComplexCalculatorService;
import au.views.ICalculatorView;
import au.views.enums.Command;
import au.views.enums.Locale;

import java.util.Scanner;

public class ComplexCalculatorController implements ICalculatorController<Complex> {

    private final ICalculatorService<Complex> service = new ComplexCalculatorService();

    private Scanner scanner = new Scanner(System.in);

    private ICalculatorView currentView;


    private void getView() {
        if(this.currentView == null) {
            System.out.print("Enter language: ");
            String lang = this.scanner.next();
            Locale loc = Locale.valueOf(lang);
            this.currentView = RuleFactory.getView(loc);
        }
    }

    @Override
    public Complex printResult(Command command, Complex num1, Complex num2) {
        Complex result;
        switch (command) {
            case MUL -> result = this.service.mul(num1, num2);
            case DEV -> result = this.service.div(num1, num2);
            case MINUS -> result = this.service.sub(num1, num2);
            default -> result = this.service.add(num1, num2);
        }

        this.currentView.printResult(command, num1, num2, result.toString());
        return result;
    }

    private Command getCommand() {
        this.currentView.getCommand();
        String lang = this.scanner.next();

        return Command.valueOf(lang);
    }

    private Complex getNextNumber() {
        this.currentView.getNextNumCommand();
        double real =  this.scanner.nextDouble();
        double image =  this.scanner.nextDouble();
        return new Complex(real, image);
    }

    public void run() {
        Command current;
        Complex mem = null;
        do {
            this.getView();
            Complex first = (mem == null) ? this.getNextNumber() : mem;
            current = this.getCommand();
            if(current == Command.STOP)
                break;
            Complex second = this.getNextNumber();
            mem = printResult(current, first, second);

        } while (true);
    }
}
