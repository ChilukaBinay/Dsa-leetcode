class Solution {
   
   static int firstOccurence(int[] nums,int target){
    int s = 0;
    int e = nums.length-1;
    int ans = -1;
    while(s<=e){
        int mid = s +(e - s)/2;
        if(nums[mid] == target){
            ans = mid;
            e =  mid -1;
        }else if(nums[mid]>target){
            e = mid - 1;
        }else{
            s= mid +1;
        }

    }
    return ans;
   };
      static int lastOccurence(int[] nums,int target){
    int s = 0;
    int e = nums.length-1;
    int ans = -1;
    while(s<=e){
        int mid = s +(e - s)/2;
        if(nums[mid] == target){
            ans = mid;
            s =  mid + 1;
        }else if(nums[mid]>target){
            e = mid - 1;
        }else{
            s= mid +1;
        }

    }
    return ans;
   }


    public int[] searchRange(int[] nums, int target) {
       int firstElement = firstOccurence(nums,target);
       int lastElement   = lastOccurence(nums,target);

         return new int[]{firstElement, lastElement};
          }
}