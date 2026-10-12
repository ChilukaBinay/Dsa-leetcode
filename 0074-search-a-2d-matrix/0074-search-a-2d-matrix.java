class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        int s = 0;
        int totalCount = rowCount * colCount;
        int e =totalCount-1;
        

        while(s <=e){
            int mid = s + (e - s)/2;
            int rowIndex = mid/colCount;
            int colIndex = mid % colCount;
            if(matrix[rowIndex][colIndex] == target){
               return true;
            }else if(matrix[rowIndex][colIndex] >target){
               e = mid -1;
            }else{
                s = mid +1;
            }
        }
return false;
    }
}