public class MergeSort implements ISort{

    public int[] sort(int[] arr) {
        int right = arr.length-1;
        int left = 0;
        return sort(arr,left,right);
    }

    private int[] sort(int[] arr,int left, int right){
        if (right <= left) return arr;
        int mid = (left+right)/2;
        sort(arr, left, mid);
        sort(arr, mid+1, right);
        return merge(arr, left, mid, right);
    }

    private int[] merge(int[] arr, int left, int mid, int right) {
        // вычисляем длину
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        // создаем временные подмассивы
        int leftArray[] = new int [lengthLeft];
        int rightArray[] = new int [lengthRight];

        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = arr[left+i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = arr[mid+i+1];

        // итераторы содержат текущий индекс временного подмассива
        int leftIndex = 0;
        int rightIndex = 0;

        // копируем из leftArray и rightArray обратно в массив
        for (int i = left; i < right + 1; i++) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    arr[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    arr[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // если все элементы были скопированы из rightArray, скопировать остальные из leftArray
            else if (leftIndex < lengthLeft) {
                arr[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // если все элементы были скопированы из leftArray, скопировать остальные из rightArray
            else if (rightIndex < lengthRight) {
                arr[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
        return arr;
    }
}
