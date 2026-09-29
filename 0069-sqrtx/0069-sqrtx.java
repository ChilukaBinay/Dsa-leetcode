class Solution {
    public int mySqrt(int x) {
          if(x == 0){
            return 0;
        }
        int startPoint = 1;
        int endPoint = x;
        int ans = -1;
      

        while(startPoint <=endPoint){
            int mid = startPoint +(endPoint - startPoint)/2;
            if(mid == x/mid){
                return mid;
            }else if(mid > x/mid ){ 
              endPoint = mid-1;

            }else{
                startPoint = mid +1;
                ans = mid;
            }

        }
        return ans;
    }
}