class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] new_matrix = matrix.clone();

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.printf("%d ",new_matrix[i][j]);
                matrix[i][n-j-1] = new_matrix[j][i];
                System.out.println();
            }
        }
    }
}