package strategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("CollectionSort:");
        SortInterface sorter1 = new CollectionsSort();
        sorter1.add(9);
        sorter1.add(5);
        sorter1.add(7);
        System.out.println("Original: " + sorter1.getValuesList());
        sorter1.sort();
        System.out.println("Sorted: " + sorter1.getValuesList());

        System.out.println("----------------------------");

        System.out.println("ManualSort:");
        SortInterface sorter2 = new ManualSort();
        sorter2.add(9);
        sorter2.add(5);
        sorter2.add(7);
        System.out.println("Original: " + sorter2.getValuesList());
        sorter2.sort();
        System.out.println("Sorted: " + sorter2.getValuesList());
    }
}
