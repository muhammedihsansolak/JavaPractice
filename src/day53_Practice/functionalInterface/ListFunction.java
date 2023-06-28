package day53_Practice.functionalInterface;

import java.util.List;

@FunctionalInterface
public interface ListFunction < T ,R> {

    R apply(List<T> list);

}
