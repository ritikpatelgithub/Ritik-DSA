class Solution {
    public int findMissing(int[] arr) {
        int n = arr.length;
        int d = (arr[n - 1] - arr[0]) / n;

        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int expected = arr[0] + mid * d;

            if (arr[mid] == expected) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }    
        }

        // If no missing element, return next element
        return arr[0] + low * d;
    }
}
