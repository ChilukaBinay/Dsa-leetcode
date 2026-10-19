class Solution {
   public int findPeakElement(int[] nums) {
        int s = 0 ;
        int e = nums.length -2;
        int n = nums.length;
        if(n == 0){
            return -1;
        }
        if(n == 1){
            return 0;
        }

        while(s<=e){
            int mid = s + (e -s )/2;

            if(nums[mid] >nums[mid+1]){
                e = mid -1;
            }else{
                s = mid +1;
            }
        }
        return s;
    }
}