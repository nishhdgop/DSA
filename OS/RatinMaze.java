package Random;
class Main{
    public static int N = 4;
    static int mat[][] = {{1,1,0,0},{1,1,0,0},{0,1,1,0},{0,0,1,1}};
    static int sol[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
    public static void main(String args[]){
         
         System.out.println(check(mat));
    }
    public static boolean isSafe(int i,int j){
        return (i<N && j<N && mat[i][j]==1);
    }
    public static boolean check(int mat[][]){
        if(checkRec(0,0)==false){
            return false;
        }else{
            printSoln(sol);
            return true;
        }
    }
    public static boolean checkRec(int i,int j){
        if(i== N-1 && j==N-1){
            sol[i][j]=1; 
            return true;
        }
        if(isSafe(i, j)){
            sol[i][j]=1;
            if(checkRec(i+1,j)==true){
                return true;
            }else if(checkRec(i,j+1)==true){
                return true;
            }
            sol[i][j]=0;
        }
        return false;
    }
    public static void printSoln(int sol[][]){
        for(int i=0;i<N;i++){
            for(int j =0;j<N;j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
}