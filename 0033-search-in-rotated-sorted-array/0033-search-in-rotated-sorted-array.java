class Solution {
    static int findPivotIndex(int[] nums){
        int s= 0;
        int n = nums.length;
        int e= n - 1;
        
        while(s<e){
            int mid = s + (e -s)/2;
            if(nums[mid]>nums[e]){
                s=mid+1;

            }else{
                e= mid;
            }
        }
       return s;
    }
    static int binarySearch(int [] nums,int s,int e, int target){
        while(s<=e){
            int mid = s + (e - s)/2;
            if(nums[mid]==target){
             return mid;
            }else if(nums[mid]>target){
                e = mid-1;
            }else{
                s= mid+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        if(n == 0 ){
            return -1;

        }
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int pivotIndex = findPivotIndex(nums);
        if (pivotIndex == 0) {
            return binarySearch(nums, 0, n - 1, target);
        }
        int s = 0;
        int pivotIndexNext = pivotIndex-1 ;
        int e = n-1;
        if(target >= nums[s] && target <=nums[pivotIndexNext]){
           return binarySearch(nums,s,pivotIndexNext,target);
        }else{
            return binarySearch(nums,pivotIndex,e,target);
        }
    }
}