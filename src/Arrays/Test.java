package Arrays;

public class Test {

    public static void main(String[] args){
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        int index = 0;

        for(int x = 0; x < intArray.length; x++){
            if(intArray[x] == 7){
                index = x;
                System.out.println("Index of 7 is " + index);
            }
        }
    }

}
