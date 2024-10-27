package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManualSort implements SortInterface {
    List<Integer> valuesList = new ArrayList<Integer>();

    public void add(Integer value) {
        this.valuesList.add(value);
    }

    public void sort() {
        int aux;
        for (int i=0; i < this.valuesList.size(); ++i) {
            for (int j=i; j < this.valuesList.size(); ++j) {
                if (this.valuesList.get(i) > this.valuesList.get(j)) {
                    aux = this.valuesList.get(i);
                    this.valuesList.set(i, this.valuesList.get(j));
                    this.valuesList.set(j, aux);
                }
            }
        }
    }

    public List<Integer>getValuesList() {
        return this.valuesList;
    }
}
