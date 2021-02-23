//Saddleback Search Algorithm

/*  1) Start with the bottom left element
    2) Loop: compare this element e with x
      (i) if they are equal then return its position
      (ii) e x then move it to right (if out of bound of the matrix then break return false)
    3) repeat the i), ii) and iii) till you find an element or returned false */

/* Searches the target element in matrix[m][n]. If the element is found, 
   then returns true, otherwise returns false */
   
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while(i >= 0 && j < matrix[0].length){
            if(i >= matrix.length || j >= matrix[0].length) break;
            if(matrix[i][j] == target) return true;
            else if (matrix[i][j] > target) i--;
            else j++;
        }
        return false;
    }
}
