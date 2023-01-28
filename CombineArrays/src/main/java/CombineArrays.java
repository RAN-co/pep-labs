import java.lang.reflect.Array;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){

        int totalArrLength = arr1.length + arr2.length; //add the length of firstArray into secondArray  
        int[] combinedArray = new int[totalArrLength];    //final array  
        int counter = 0;  
        for (int arrUnit : arr1) //copying elements of firstArray using for-each loop  
        {  
            combinedArray[counter] = arrUnit;  
            counter++;              //increases position by 1  
        }  
        for (int arrUnit : arr2) //copying elements of secondtArray using for-each loop  
        {  
            combinedArray[counter] = arrUnit;  
            counter++;  
        }  
        
               return combinedArray;
    }
}
