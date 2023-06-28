package day53_Practice.functionalInterface;

@FunctionalInterface
public interface ArrayFunction<T,R> {

    R apply(T[] t);
}
