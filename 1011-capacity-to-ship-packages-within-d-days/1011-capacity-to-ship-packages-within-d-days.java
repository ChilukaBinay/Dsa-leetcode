class Solution {

    static Boolean minWeight(int [] weights,int days,int minWeight){
        int currentWeight = 0;
        int dayUsed = 1;
        int n  = weights.length;
        for(int i = 0;i<n;i++){
           if((currentWeight +weights[i]) <= minWeight){
            currentWeight = currentWeight + weights[i];
           }else{
            dayUsed++;
            currentWeight =weights[i];
           }
        }
         if(dayUsed <= days){
            return true;
         } 
         return false;
    }
    public int shipWithinDays(int[] weights, int days) {
      int s =  0;
       int sum = 0;
        for(int i =0;i<weights.length;i++){
        s = Math.max(s,weights[i]);
         sum = sum + weights[i];
        }
      int e = sum;

      while(s<=e){
        int mid = s + (e-s)/2;

        if(minWeight(weights,days,mid)){
            e = mid-1;
        }else{
            s = mid+1;
        }
      }
      return s;
    }
}