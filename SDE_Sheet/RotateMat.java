class Solution {
    public void rotate(int[][] matrix) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for(int i=0;i<matrix[0].length;i++){
            ArrayList<Integer> a = new ArrayList<>();
            for(int j=0;j<matrix.length;j++){    
                a.add(matrix[j][i]);
            }
            Collections.reverse(a);
            al.add(a);
        }
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=al.get(i).get(j);
            }
        }
    }
}
