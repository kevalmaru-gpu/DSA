package LeetCode.Medium;

import java.util.HashMap;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9, c = 3;
        HashMap<Integer, Character> jValues = new HashMap<>();
        HashMap<Integer, Character> iValues = new HashMap<>();
        HashMap<Integer, Integer> cells = new HashMap<>();

        for (int i=0; i<n; i++){
            if (iValues.containsValue(board[i][0]))
                return false;
            iValues.put(i, board[i][0]);
            for (int j=0; j<n; j++){
                int v = Integer.parseInt(board[i][j] + "")+i/3+j/3;
                if (cells.containsValue(v))
                    return false;
                cells.put()  
                if (iValues.containsValue(board[i][j]))
                    return false;
                jValues.put(j, board[i][j]);
            }
            jValues.clear();
        }
        iValues.clear();

        for (int i=1; i<n; i++){
            for (int j=0; j<n; j++){
                if (jValues.containsValue(board[j][i]))
                     return false;
                jValues.put(j, board[j][i]);
            }
        }

        return true;
    }
}