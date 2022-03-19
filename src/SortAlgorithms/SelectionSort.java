package SortAlgorithms;

public class SelectionSort {

    public static int [] selectionSort(int[] intArray){
        int largestIdx;
        int sortedPartitionIdx = intArray.length;

        while(sortedPartitionIdx > 0){

            largestIdx = 0;

            for(int x = 1; x < sortedPartitionIdx; x++){
                if(intArray[x] > intArray[largestIdx]){
                    largestIdx = x;
                }
            }

            if(largestIdx != sortedPartitionIdx - 1){
                int temp = intArray[largestIdx];
                intArray[largestIdx] = intArray[sortedPartitionIdx - 1];
                intArray[sortedPartitionIdx - 1] = temp;
            }

            sortedPartitionIdx--;

        }

        return intArray;
    }


    public static void main(String[] args){
        int[] intArray = {35, 15, 308, 12, -2, 5, 167, 24, 8, 95, 0, -1, -1, 18, 99, 30000, 2, 1, 3, 4};
        intArray = selectionSort(intArray);

        for(int x = 0; x < intArray.length; x++){
            System.out.println(intArray[x]);
        }
    }

}
