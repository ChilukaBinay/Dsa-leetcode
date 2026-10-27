class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int k = 0;
        int n = chars.length;
        while(i<n){
            chars[k++] = chars[i];
            int j = i + 1;
            while( j < n && chars[i] == chars[j]){
                j++;
            }
            if((j-i)>1){
                String str = String.valueOf(j-i);
                for(char c:str.toCharArray()){
                    chars[k++] = c;
                }
            }
            
        i = j;
        }
        return k;
    }
}