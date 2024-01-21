package au.rules.impl;

import au.rules.IRule;
import au.views.ICalculatorView;
import au.views.complex.ComplexViewRUS;
import au.views.enums.Locale;

import java.util.function.Predicate;


public class CalculatorViewRusRule implements IRule<ICalculatorView, Locale> {

    @Override
    public boolean match(Predicate<Locale> predicate) {
        return predicate.test(Locale.RUS);
    }

    @Override
    public ICalculatorView get() {
        return new ComplexViewRUS();
    }
}
