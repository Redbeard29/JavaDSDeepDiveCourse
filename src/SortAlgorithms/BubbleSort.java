package SortAlgorithms;

public class BubbleSort {

    public static int[] bubbleSort(int[] intArray){
        int sortedPartitionIdx = intArray.length;
        boolean sorted = false;
        while(sortedPartitionIdx > 0 && !(sorted)){
            boolean swapped = false;
            for(int x = 0, y = 1; y < sortedPartitionIdx; x++, y++){
                if(intArray[x] > intArray[y]){
                    int temp = intArray[x];
                    intArray[x] = intArray[y];
                    intArray[y] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                sorted = true;
            }
            sortedPartitionIdx --;
        }
        return intArray;
    }

    public static void main(String[] args){
        int[] intArray = {35, 15, 308, 12, -2, 5, 167, 24, 8, 95, 0, -1, -1, 18, 99, 30000, 2, 1, 3, 4};
        intArray = bubbleSort(intArray);

        for(int x = 0; x < intArray.length; x++){
            System.out.println(intArray[x]);
        }
    }

}
