public class maxProductNElements{
    public static long maxProduct(int[] numbers, int sub_size){
        long sum = 1;
        //sort the array - product first "sub_size" elements
        int temp = 0;
        for (int i = 0; i < numbers.length; i++){
            for (int j = 1; j < (numbers.length - i); j++){
                if (numbers[j-1] > numbers[j]){
                    temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i = 1; i <= sub_size; i++){
            sum *= numbers[(numbers.length - i)];
        }
        return sum;
    }
}