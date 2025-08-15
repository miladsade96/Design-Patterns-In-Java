package design_patterns.behavioral.iterator_pattern;

public interface Iterator<T> {
    boolean hasNext();

    T current();

    void next();
}
