public class Solution {
    public int numOfSubarrays(int[] arr, int k, int th) {
        if (arr == null || arr.length < k) {
            return 0;
        }

        int count = 0;
        int sum = 0;
        
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        
        if (sum >= th * k) {
            count++;
        }

        for (int i = 1; i <= arr.length - k; i++) {
            sum += arr[i + k - 1];
            sum -= arr[i - 1];
            
            if (sum >= th * k) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution solver = new Solution();
        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int th = 4;
        
        int result = solver.numOfSubarrays(arr, k, th);
        System.out.println("Result: " + result);
    }
}
