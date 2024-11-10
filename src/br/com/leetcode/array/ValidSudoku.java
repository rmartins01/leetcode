package br.com.leetcode.array;

import java.util.Arrays;
import java.util.LinkedList;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/
class ValidSudoku {
	
    public boolean isValidSudoku(char[][] board) {
        
    	
    	int[][][][] boards = new int[3][3][3][3];
    	
    	LinkedList<Character> line = new LinkedList<>();
    	LinkedList<Character> col = new LinkedList<>();
    	
    	int indexLimitBoardLine = 0;
    	int indexLimitBoardCol = 0;
    	int indexLimitLine = 0;
    	int indexLimitCol = 0;
    	
    	for (int indexLine = 0; indexLine < board.length; indexLine++) {
    		indexLimitBoardLine++;
    		indexLimitLine++;
    		
    		if(indexLimitBoardLine == 3) {
    			indexLimitBoardLine=0;
    		}
    		
    		if(indexLimitLine == 10) {
    			// processo finalizado
    			break;
    		}
    		
			for (int indexCol = 0; indexCol < board.length; indexCol++) {
				
				indexLimitBoardCol++;
				indexLimitCol++;
						
				if(indexLimitBoardCol == 3) {
					//finalizou a coluna de um quadrante
					indexLimitBoardCol = 0;
				}
				
	    		if(indexLimitCol == 10) {
	    			// finalizou uma linha
	    			col = new LinkedList<>();
	    			indexLimitCol=0;
	    		}

	    		char item = board[indexLine][indexCol];
	    		if(Character.compare('.', item) ==0)
	    			continue;
				
	    		boards[indexLimitBoardLine][indexLimitBoardCol][indexLimitLine][indexLimitCol] = item;
				
				
				if(line.contains(item) || col.contains(item)) {
					return false;
				}else {
					line.add(item);
					col.add(item);
				}
			}
		}
    	
    	//Valida se existe algum item no quadrante
//    	Arrays.stream(boards[0][1]).flatMap(Arrays::stream).flatMapToInt(Arrays::stream).anyMatch(num -> num == 10);
    	
    	return false;
    }


	public static void main(String[] args) {
		char[][] board = {
						{'5','3','.','.','7','.','.','.','.'},
		                {'6','.','.','1','9','5','.','.','.'},
		                {'.','9','8','.','.','.','.','6','.'},
		                {'8','.','.','.','6','.','.','.','3'},
		                {'4','.','.','8','.','3','.','.','1'},
		                {'7','.','.','.','2','.','.','.','6'},
		                {'.','6','.','.','.','.','2','8','.'},
		                {'.','.','.','4','1','9','.','.','5'},
		                {'.','.','.','.','8','.','.','7','9'}
		};
		
		System.out.println(new ValidSudoku().isValidSudoku(board));
	}
}
