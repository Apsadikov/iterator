/**
 * Реалиация итератора
 */
public class IteratorImpl<T> implements IIterator<T> {
    /**
     * Интерфейс коллекции
     */
    private ICollection<T> collection;
    /**
     * Указатель на текущий элемент
     */
    private int cursor;

    public IteratorImpl(ICollection<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return cursor < collection.size();
    }

    @Override
    public T next() {
        return collection.get(cursor++);
    }
}
