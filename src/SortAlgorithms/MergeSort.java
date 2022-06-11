package SortAlgorithms;

public class MergeSort {

    public static void merge(int[] intArray, int start, int mid, int end){

        if(intArray[mid - 1] <= intArray[mid]){
            return;
        }

        int x = start;
        int y = mid;
        int tempIdx = 0;

        int[] tempArr = new int[end - start];
        while(x < mid && y < end) {
            tempArr[tempIdx++] = intArray[x] <= intArray[y] ? intArray[x++] : intArray[y++];
        }

        System.arraycopy(intArray, x, intArray, start + tempIdx, mid - x);
        System.arraycopy(tempArr, 0, intArray, start, tempIdx);

    }


    public static void mergeSort(int[] intArray, int start, int end){

        if(end - start < 2){
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(intArray, start, mid);
        mergeSort(intArray, mid, end);
        merge(intArray, start, mid, end);

    }

    public static void main(String[] args){
        int[] intArray = {35, 15, 308, 12, -2, 5, 167, 24, 8, 95, 0, -1, -1, 18, 99, 30000, 2, 1, 3, 4};
        mergeSort(intArray, 0, intArray.length);

        for(int item : intArray){
            System.out.print(item + " ");
        }

    }

}
