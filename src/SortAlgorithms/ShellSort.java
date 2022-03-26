package SortAlgorithms;

public class ShellSort {

    public static int[] shellSort(int[] intArray){
        for(int gap = intArray.length / 2; gap > 0; gap /= 2){

            for(int x = gap; x < intArray.length; x++){

                int newElement = intArray[x];

                int y = x;

                while(y >= gap && intArray[y - gap] > newElement){
                    intArray[y] = intArray[y - gap];
                    y -= gap;
                }

                intArray[y] = newElement;
            }

        }

        return intArray;
    }

    public static void main(String[] args){
        int[] intArray = {35, 15, 308, 12, -2, 5, 167, 24, 8, 95, 0, -1, -1, 18, 99, 30000, 2, 1, 3, 4};
        intArray = shellSort(intArray);

        for(int x = 0; x < intArray.length; x++){
            System.out.println(intArray[x]);
        }
    }

}
