class Solution {

    static int  recursionCall(int[] nums,int target,int s,int e){
       
       if(s>e){
        return - 1;
       }
        int mid = s + (e - s)/2;
       if(nums[mid] == target){
        return mid;
       };

       if(nums[mid] > target){
        e = mid -1;
       }else{
        s = mid +1;
       }
       int ans = recursionCall(nums,target,s, e);
       return ans;
    }
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int mid = s + (e - s)/2;
        int ans =  recursionCall(nums,target,s,e);
        return ans;
            };
}