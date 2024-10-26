package strategy;

public class Main {
    public static void main(String[] args) {
        SortInterface sorter = new CollectionsSort();
        sorter.add(9);
        sorter.add(5);
        sorter.add(7);
        System.out.println(sorter.getValuesList());
        sorter.sort();
        System.out.println(sorter.getValuesList());
    }
}
