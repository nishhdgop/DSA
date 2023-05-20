import java.util.*;
public class Nqueens {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
   int N= sc.nextInt();
    int grid[][]= new int[N][N];
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            grid[i][j]=0;
        }
    }
    solve(grid,N);
    }
    public static boolean solve(int grid[][],int N){
        if(solveUtil(0,N,grid)){
            printSol(grid);
            return true;
        }else{
            System.out.println("no solution");
            return false;
        }
    }
    public static boolean solveUtil(int col,int N,int grid[][]){
        // all are to be printed then use commented code
        // if(col==N){
        //     printSol(grid);
        //     return true;
        // }
       // if(col==N)return true;
        for(int i=0;i<N;i++){
            if(isSafe(i,col,grid,N)){
                grid[i][col]=1;
                if(solveUtil(col+1, N, grid))
                return true;
                grid[i][col]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(int row,int col,int grid[][],int N){
        for(int i=0;i<col;i++){
            if(grid[row][i]==1) 
            return false;
        }
        for(int i=row,j=col;j>=0&&i>=0;i--,j--){
            if(grid[i][j]==1){
                return false;
            }
        }
        for(int i=row,j=col;j>=0&&i<N;i++,j--){
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
}
