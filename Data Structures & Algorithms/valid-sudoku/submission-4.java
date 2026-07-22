class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r=0;r<9;r++){
            HashSet<Character> set = new HashSet<>();
            for(int c=0;c<9;c++){
                if(board[r][c]!='.'){
                    if(set.contains(board[r][c])){
                        return false;
                    }
                    else{
                        set.add(board[r][c]);
                    }
                }
            }
        }

            for(int r=0;r<9;r++){
                HashSet<Character> set = new HashSet<>();
                for(int c=0;c<9;c++){
                    if(board[c][r]!='.'){
                        if(set.contains(board[c][r])){
                            return false;
                        }
                        else{
                            set.add(board[c][r]);
                        }
                    }
                }
            }

            for(int square=0;square<9;square++){
                HashSet<Character> set = new HashSet<>();
                for(int r=0;r<3;r++){
                    for(int c=0;c<3;c++){
                        int row  = (square/3)*3 + r;
                        int col = (square%3)*3 + c;
                        if(board[row][col]!='.'){
                            if(set.contains(board[row][col])){
                                return false;
                            }
                            set.add(board[row][col]);
                        }
                    }
                }
            }
        return true;

        }
    
}
