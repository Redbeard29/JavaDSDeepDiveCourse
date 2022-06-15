package SortAlgorithms;

public class HeapSort {

    public static void heapify(int[] intArray, int rootIdx){
        int largest = rootIdx;
        int left = 2 * rootIdx + 1;
        int right = 2 * rootIdx + 2;

        if(left < intArray.length && intArray[left] > intArray[largest]){
            largest = left;
        }

        if(right < intArray.length && intArray[right] > intArray[largest]){
            largest = right;
        }

        if(largest != rootIdx){
            int temp = rootIdx;
            intArray[rootIdx] = intArray[largest];
            intArray[largest] = temp;
            heapify(intArray, largest);
        }

    }

    public static void heapSort(int[] intArray){
        for(int x = intArray.length; x >= 0; x--){
            heapify(intArray, x);
        }
    }

    public static void main(String[] args){
        int[] intArray = {35, 15, 308, 12, -2, 5, 167, 24, 8, 95, 0, -1, -1, 18, 99, 30000, 2, 1, 3, 4};
        heapSort(intArray);

        for(int x = 0; x < intArray.length; x++){
            System.out.print(intArray[x] + " ");
        }
    }
}
