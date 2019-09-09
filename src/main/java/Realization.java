public class Realization {

    public static void main(String[] args) {
        int arr[] = {1,3,7,3,7,0,7,1,2,3};
        ISort sort = new BucketSort();
        for (int x: sort.sort(arr)){
            System.out.println(x+" ");
        }

    }
}
