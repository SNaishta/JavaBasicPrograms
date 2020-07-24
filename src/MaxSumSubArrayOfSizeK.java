class MaxSumSubArrayOfSizeK {

    public static void main(String[] args) {
        int[] a = {2, 1, 5, 1, 3, 2,-1,9,8 };
        System.out.println("Maximum sum of a subarray of size K: "
                + findMaxSumSubArray(3, a));
    }

    private static int findMaxSumSubArray(int k, int[] arr) {
        int maxSum = 0, windowSum;
        for (int i = 0; i <= arr.length - k; i++) {
            windowSum = 0;
            for (int j = i; j < i + k; j++) {
                windowSum += arr[j];
            }
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}