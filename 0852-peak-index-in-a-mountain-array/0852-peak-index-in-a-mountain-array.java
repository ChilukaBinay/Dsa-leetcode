class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int startingPointer = 0;
        int endPointer = n-1;
        int ans = 0;
        while(startingPointer <=endPointer){
            int mid = startingPointer +(endPointer - startingPointer)/2;
            if(arr[mid] >arr[mid +1]){
                ans =mid;
                endPointer = mid -1;
            }else{
                startingPointer = mid +1;
            }
        }
        return ans;
    }
}