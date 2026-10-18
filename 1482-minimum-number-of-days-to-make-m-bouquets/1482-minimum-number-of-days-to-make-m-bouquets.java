class Solution {

    static int minFlowersBloomed(int[] bloomDay,int k,int m,int days){
        int count = 0;
        int bouqet = 0;
        int n = bloomDay.length;
        for(int i = 0;i<n;i++){
            if(bloomDay[i]<=days){
                count++;
            }else{
                count = 0;
            }
            
            if(count == k){
                  bouqet++;
                  count = 0;
                }
            
        }
        if(bouqet <m){
            return -1;
        }
        return bouqet;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int s = 1;
        int e = 0;
        if((long)m * k >bloomDay.length){
            return -1;
        }
        for(int i = 0;i<bloomDay.length;i++){
            e = Math.max(e,bloomDay[i]);
        }
        
        while(s<=e){
            int mid = s + (e - s)/2;
            int bouqetCount = minFlowersBloomed(bloomDay,k,m,mid);
            if(bouqetCount>=m){
                e = mid -1;
            }else{
                s= mid +1;
            }
        }
        return s;
    }
}