package DSA.arrays;
public class kadane {
    public static void max_subarray(int[] numbers) {//O(n)
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] >= 0) {
                //start
                for (int i = 0; i < numbers.length; i++) {
                    sum += numbers[i];
                    if (sum < 0) {
                        sum = 0;
                    }
                    maxSum = Math.max(sum, maxSum);
                }
            } else {
                for (int y = 0; y < numbers.length; y++) {
                    if (numbers[y] > maxSum) {
                        maxSum = numbers[y];
                    }
                }
            }
        }
        System.out.println("maximum sum is" + maxSum);
    }
    public static void main(String args[]){
        int numbers[]={-2,-3,-4,-5};
        max_subarray(numbers);
    }
}
