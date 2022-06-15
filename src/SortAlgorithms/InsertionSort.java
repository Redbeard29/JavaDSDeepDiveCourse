package SortAlgorithms;

public class InsertionSort {

    public static int[] insertionSort(int[] intArray){

        for(int firstUnsortedIdx = 1; firstUnsortedIdx < intArray.length; firstUnsortedIdx++){

            int newElement = intArray[firstUnsortedIdx];
            int x;

            for(x = firstUnsortedIdx; x > 0 && intArray[x - 1] > newElement; x--){
                intArray[x] = intArray[x - 1];
            }

            intArray[x] = newElement;

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
