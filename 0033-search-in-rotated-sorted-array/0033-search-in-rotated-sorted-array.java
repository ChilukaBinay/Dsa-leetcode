class Solution {
    static int pivotIndex(int []nums) {
       int n = nums.length;
        int startPoint = 0;
        int endPoint = n - 1;
        int ans = -1;

        if (nums[startPoint] <= nums[endPoint]) {
            return -1;
        }

        while (startPoint <= endPoint) {
            int mid = startPoint + (endPoint - startPoint) / 2;

            // Compare against nums[0] (fixed reference) instead of nums[endPoint]
            if (nums[mid] >= nums[0]) {
                ans = mid;
                startPoint = mid + 1;
            } else {
                endPoint = mid - 1;
            }
        }
        return ans;
    }

     static int binarySearch(int[] nums, int startPoint, int endPoint, int target) {
        int n = nums.length;
        while (startPoint <= endPoint) {
            int mid = startPoint + (endPoint - startPoint) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                endPoint = mid - 1;
            } else {
                startPoint = mid + 1;
            }
        }
        return -1;
    };

    public int search(int[] nums, int target) {
 int pivotIndex = pivotIndex(nums);
        int n = nums.length;

        if ((pivotIndex == -1)) {
            int ans = binarySearch(nums, 0, n - 1, target);
            return ans;
        } else {
            int startArray1 = 0;
            int endArray1 = pivotIndex;

            int startArray2 = pivotIndex + 1;
            int endArray2 = n - 1;
            if (target >= nums[startArray1] && target <= nums[endArray1]) {
                int ans = binarySearch(nums, startArray1, endArray1, target);
                return ans;
            }else{
                int ans = binarySearch(nums, startArray2, endArray2, target);
                return ans;
            }
        }
        
    }
}