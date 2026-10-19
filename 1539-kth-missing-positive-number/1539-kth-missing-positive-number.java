class Solution {
    public int findKthPositive(int[] arr, int k) {
        int s = 0;
        int n = arr.length;
        int e = n-1;

        while(s<=e){
            int mid = s +(e - s)/2;
            int missingElementsCount = arr[mid] -(mid+1);
            if(missingElementsCount>=k){
                e =mid-1;
            } else{
                s=mid+1;
            }

        }
         return s+k;
    }
}