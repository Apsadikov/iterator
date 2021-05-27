/**
 * Интерфейс для итерируемых объектов
 */
public interface IIterable<T> {
    IIterator<T> getIterator();
}
