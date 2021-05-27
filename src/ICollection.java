/**
 * Интерфейс коллекции
 */
public interface ICollection<T> extends IIterable<T> {
    /**
     * Возвращает размер
     */
    int size();

    /**
     * Исползуется для добавления элемента в коллекцию
     */
    void add(T element);

    /**
     * Возвращает элемент с заданной позицией
     */
    T get(int position);

    /**
     * Возвращает итератор
     */
    IIterator<T> getIterator();
}
