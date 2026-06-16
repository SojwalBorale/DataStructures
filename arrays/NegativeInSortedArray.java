public class NegativeInSortedArray {
    public static void main(String[] args) {
        int [][] grid = {{3  ,4  , 5 , 1, 9},
                {5  ,6  ,-1 ,-1,-2},
                {7  ,-8 ,-9 ,-10,-3},
                {11,-12,-13,-14, -4},
                {15,-16,-17,-18,-19}};

        System.out.println(countNegatives(grid));
    }

     public static int  countNegatives(int[][] grid){
        int m=grid.length, n  = grid[0].length;
        int i=m-1 , j =0, count = 0;

        while(i>=0  && j<n) {
            if (grid[i][j] >= 0) {
                j++;
            } else {
                count += n - j;
                i--;
            }
        }
        return count;
     }
}
