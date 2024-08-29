package dataStructures;

import java.util.Arrays;

public class WorkingWith2DArrays
{
    public static void main(String[] args)
    {
        char [][] board = new char[3][3];
        for(int i = 0; i<3; i++){
            for (int j = 2; j<=2; j++){
                board[i][j] = '-';
//                board[i][j] = 'o';
//                board[i][j] = 'x';
//                if (board[0][2] == 'x' && board[2][0] == 'x' )
//                break;
            }
    }
        char [][] boardTwo = new char[][]{
                new char[]{'0', '-', '-'},
                new char[]{'0', '-', '-'},
                new char[]{'0', '-', '-'}
        };
        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
