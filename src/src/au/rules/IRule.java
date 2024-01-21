package au.rules;

import java.util.function.Predicate;

public interface IRule<T, P> {

    boolean match(Predicate<P> predicate);

    T get();
}
