
class Solution {
    public boolean isValidSudoku(char[][] board) {

        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];


        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                char val = board[r][c];

                if (val == '.') continue;

                int digit = val - '1';

                int boxIdx = (r / 3) * 3 + (c / 3);

                if (rows[r][digit] || cols[c][digit] || boxes[boxIdx][digit]) return false;


                rows[r][digit] = true;
                cols[c][digit] = true;
                boxes[boxIdx][digit] = true;
            }
        }


        return true;

    }
}
