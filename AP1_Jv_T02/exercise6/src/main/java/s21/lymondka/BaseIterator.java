package s21.lymondka;

public interface BaseIterator<T> {
    T next();
    boolean hasNext();
    void reset();
}
