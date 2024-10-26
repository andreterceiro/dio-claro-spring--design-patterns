package strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CollectionsSort implements SortInterface {
    List<Integer> valuesList = new ArrayList<Integer>();

    public void add(Integer value) {
        this.valuesList.add(value);
    }

    public void sort() {
        Collections.sort(this.valuesList);
    }

    public List<Integer>getValuesList() {
        return this.valuesList;
    }
}
