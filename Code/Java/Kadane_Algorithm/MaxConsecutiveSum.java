public class MaxConsecutiveSum {
    //implemented Kadane's algorithm to search the max consecutive sum (if output is negative, return 0)
    public static int sequence(int[] arr) {
        if (arr.length == 0) return 0;
        int currentMax = arr[0], finalMax = arr[0];
        for (int i = 1; i < arr.length; i++){
            //validate the next 2 options to make the code "evade" all negative value we encounter  
            if (arr[i] > 0 || currentMax + arr[i] > 0){
                currentMax = Math.max(arr[i], currentMax + arr[i]);
                finalMax = currentMax > finalMax ? currentMax : finalMax;
            } else {
                currentMax = 0; //if neither of the options were fullfilled then our currentMax is 0
            }
        }
        return finalMax < 0 ? 0 : finalMax;
    }
}