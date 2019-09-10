package factory;

import sorts.BucketSort;
import sorts.ISort;

public class BucketSortFactory extends SortFactory {
    public ISort getSort() {
        return new BucketSort();
    }
}
