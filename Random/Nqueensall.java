package Random;
import java.util.Arrays;
class Nqueensall
{
    public static boolean isSafe(int grid[][],int row,int col){
        for(int i=0;i<col;i++){
            if(grid[row][i]==1) 
            return false;
        }
        for(int i=row,j=col;j>=0&&i>=0;i--,j--){
            if(grid[i][j]==1){
                return false;
            }
        }
        for(int i=row,j=col;j>=0&&i<grid.length;i++,j--){
            if(grid[i][j]==1){
                return false;
            }
        }
        return true;
    }
 
    public static void printSol(int grid[][]){
        for(int i=0;i<grid.length;i++){
            for(int j =0;j<grid[i].length;j++){
            System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void nQueen(int[][] mat, int r)
    {
        if (r == mat.length)
        {
            printSol(mat);
            return;
        }
        for (int i = 0; i < mat.length; i++)
        {
            if (isSafe(mat, r, i))
            {
                mat[r][i] = 1;
                nQueen(mat, r + 1);
                mat[r][i] = 0;
            }
        }
    }
    public static void main(String[] args)
    {
        int N = 4;
        int[][] mat = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(mat[i], 0);
        }
        nQueen(mat, 0);
    }
}
