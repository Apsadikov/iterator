public class Main {
    public static void main(String[] args) {
        ICollection<String> collection = new CollectionImpl<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");

        IIterator<String> iterator = collection.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
