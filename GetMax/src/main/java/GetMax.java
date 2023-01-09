public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        int arrayMax = arr[0];
        for(int k = 0; k < arr.length; k++){

            if (arr[k] > arrayMax) {

                arrayMax = arr[k];
            }
           
        }
        return arrayMax;
    }
}
