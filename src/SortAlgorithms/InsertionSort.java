package SortAlgorithms;

public class InsertionSort {

    public static int[] insertionSort(int[] intArray){

        int sortedPartitionIdx = 0;

        for(int firstUnsortedIdx = sortedPartitionIdx + 1; firstUnsortedIdx < intArray.length; firstUnsortedIdx++){
            if(intArray[firstUnsortedIdx] > intArray[sortedPartitionIdx]){
                sortedPartitionIdx ++;
            }
            else{
                //Need to account for case when item you want to insert is at the very beginning of the array
                //You are currently looping outside of bounds by decrementing currentElem while already being
                //at index 0
                int currentElem = sortedPartitionIdx;
                int temp = intArray[firstUnsortedIdx];
                while(temp < intArray[currentElem]){
                    intArray[currentElem + 1] = intArray[currentElem];
                    currentElem--;
                }
                intArray[currentElem + 1] = temp;
            }
        }

        return intArray;
    }


    public static void main(String[] args){
        int[] intArray = {35, 15, 308, 12, -2, 5, 167, 24, 8, 95, 0, -1, -1, 18, 99, 30000, 2, 1, 3, 4};
        intArray = insertionSort(intArray);

        for(int x = 0; x < intArray.length; x++){
            System.out.println(intArray[x]);
        }
    }

}
