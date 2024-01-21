package au.rules;

import au.rules.impl.CalculatorViewEngRule;
import au.rules.impl.CalculatorViewRusRule;
import au.views.ICalculatorView;
import au.views.enums.Locale;

import java.util.List;

public final class RuleFactory {

    private static List<IRule<ICalculatorView, Locale>> views = List.of(
            new CalculatorViewEngRule(),
            new CalculatorViewRusRule()
    );

    public static ICalculatorView getView(Locale locale) {
        return views.stream().filter(rule -> rule.match(loc -> loc.equals(locale))).findFirst().orElseThrow().get();
    }

}
