public class CollectionImpl<T> implements ICollection<T> {
    /**
     * Максимальный размер массива
     */
    private static final int MAX_CAPACITY = 1000;
    private T[] array;
    /**
     * Указатель на текущий элемент
     */
    private int cursor;

    public CollectionImpl() {
        array = (T[]) new Object[MAX_CAPACITY];
    }

    @Override
    public int size() {
        return cursor;
    }

    @Override
    public void add(T element) {
        array[cursor] = element;
        cursor += 1;
    }

    @Override
    public T get(int position) {
        return array[position];
    }

    @Override
    public IIterator<T> getIterator() {
        return new IteratorImpl<>(this);
    }

}
