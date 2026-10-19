class Solution {
    static int helperFunction(int []nums,int k,int minWeight){
        int count =1;
        int weights = 0;
        for(int i = 0;i<nums.length;i++){
            if((weights + nums[i])<= minWeight){
                weights = weights + nums[i];
            }else{
                count++;
                weights = nums[i];
            }

        }
        return count;
    }
    public int splitArray(int[] nums, int k) {
        int s = 0;
        int e = 0;
        int sum =0;
        for(int i =0;i<nums.length;i++){
            s = Math.max(s,nums[i]);
            sum = sum + nums[i];
        }
     e = sum;
        while(s<=e){
            int mid = s + (e - s)/2;
            int subArrays =helperFunction(nums,k,mid); 
            if(subArrays<=k){
               e = mid-1; 
            }else{
                s = mid +1;
            }
        }
        
        
return s;
    }
}