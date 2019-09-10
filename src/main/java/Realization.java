import factory.SortFactory;
import factory.SelectionSortFactory;
import sorts.BucketSort;
import sorts.ISort;

public class Realization {

    public static void main(String[] args) {

        int arr[] = {1,3,7,3,7,0,7,1,2,3};

        SortFactory sortFactory = new SelectionSortFactory();
        sortFactory.sort(arr);

        ISort sort = sortFactory.getSort();
        sort.sort(arr);

        for (int x: sort.sort(arr)){
            System.out.println(x+" ");
        }

    }






}
