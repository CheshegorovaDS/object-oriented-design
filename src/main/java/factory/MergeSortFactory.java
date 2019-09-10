package factory;

import sorts.ISort;
import sorts.MergeSort;

public class MergeSortFactory extends SortFactory{
    public ISort getSort() {
            return new MergeSort();

    }
}
