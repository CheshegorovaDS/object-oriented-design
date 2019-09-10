import factory.BucketSortFactory;
import factory.MergeSortFactory;
import factory.SelectionSortFactory;
import factory.SortFactory;
import org.junit.Test;
import sorts.ISort;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void sortSelectionTest(){
        int[] arr = {1,3,1,0};
        SortFactory sortFactory = new SelectionSortFactory();

        ISort sort = sortFactory.getSort();
        sort.sort(arr);
        assertArrayEquals(new int[]{0, 1, 1, 3},sort.sort(arr));

    }

    @Test
    public void sortMergeTest(){
        int[] arr = {1,3,1,0};
        SortFactory sortFactory = new MergeSortFactory();

        ISort sort = sortFactory.getSort();
        sort.sort(arr);
        assertArrayEquals(new int[]{0, 1, 1, 3},sort.sort(arr));

    }

    @Test
    public void sortBucketTest(){
        int[] arr = {1,3,1,0};
        SortFactory sortFactory = new BucketSortFactory();

        ISort sort = sortFactory.getSort();
        sort.sort(arr);
        assertArrayEquals(new int[]{0, 1, 1, 3},sort.sort(arr));

    }

}
