package au.rules.impl;

import au.rules.IRule;
import au.views.ICalculatorView;
import au.views.complex.ComplexViewEng;
import au.views.enums.Locale;

import java.util.function.Predicate;

public class CalculatorViewEngRule implements IRule<ICalculatorView, Locale> {

    @Override
    public boolean match(Predicate<Locale> predicate) {
        return predicate.test(Locale.ENG);
    }

    @Override
    public ICalculatorView get() {
        return new ComplexViewEng();
    }
}
