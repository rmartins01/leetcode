package br.com.leetcode.array;

import java.util.HashSet;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/
class ValidSudokuCopilot {
	
	public boolean isValidSudoku(char[][] board) {
        // check rows/cols
        HashSet<Character> rowSet = new HashSet<Character>();
        HashSet<Character> colSet = new HashSet<Character>();
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                // check row char
                char rowChar = board[i][j];
                if(rowSet.contains(rowChar)) return false;
                if(rowChar != '.') rowSet.add(rowChar);
                
                // check col char
                char colChar = board[j][i];
                if(colSet.contains(colChar)) return false;
                if(colChar != '.') colSet.add(colChar);
            }
            rowSet.clear();
            colSet.clear();
        }
        
        //check sub-boxes
        int rowMin = 0;
        int rowMax = 2;
        int colMin = 0; 
        int colMax = 2;
        for(int a = 0; a < 3; a++) {
            for(int b = 0; b < 3; b++) {
                for(int i = rowMin; i <= rowMax; i++) {
                    for(int j = colMin; j <= colMax; j++) {
                        char c = board[i][j];
                        if(rowSet.contains(c)) return false;
                        if(c != '.') rowSet.add(c);
                    }
                }
                rowSet.clear();
                colMin += 3;
                colMax += 3;
            }
            rowMin += 3;
            rowMax += 3;
            colMin = 0;
            colMax = 2;
        }
        return true;
    }


	public static void main(String[] args) {
		char[][] board = {
						{'5','3','.','.','7','.','.','.','.'},
		                {'6','3','.','1','9','5','.','.','.'},
		                {'.','9','8','.','.','.','.','6','.'},
		                {'8','.','.','.','6','.','.','.','3'},
		                {'4','.','.','8','.','3','.','.','1'},
		                {'7','.','.','.','2','.','.','.','6'},
		                {'.','6','.','.','.','.','2','8','.'},
		                {'.','.','.','4','1','9','.','.','5'},
		                {'.','.','.','.','8','.','.','7','9'}
		};
		
		System.out.println(new ValidSudokuCopilot().isValidSudoku(board));
	}
}
