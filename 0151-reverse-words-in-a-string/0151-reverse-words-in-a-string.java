class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
 
       
        int n = s.length();
        int i =n-1;
        while(i>=0){
            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }
            if(i<0){
             break;
            }
            int j=i;

            while(j>=0 && s.charAt(j)!= ' '){
                j--;
            }
         if(i>=0){
              str.append(s.substring(j+1,i+1));
              str.append(" ");
         } 
           i=j;

        }
      return str.toString().trim();   
    }
}