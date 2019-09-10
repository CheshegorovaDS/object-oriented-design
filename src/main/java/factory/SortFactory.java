package factory;

import sorts.ISort;

public abstract class SortFactory {

    public abstract ISort getSort();

    public int[] sort(int[] arr){
        return getSort().sort(arr);
    }

}
