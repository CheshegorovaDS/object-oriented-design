package factory;

import sorts.ISort;
import sorts.SelectionSort;

public class SelectionSortFactory extends SortFactory {
    public ISort getSort() {
        return new SelectionSort();
    }
}
