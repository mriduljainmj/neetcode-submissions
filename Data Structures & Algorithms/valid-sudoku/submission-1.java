class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> checkDuplicates = new HashSet<Character>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                else{
                    if(Character.getNumericValue(board[i][j])>0 && Character.getNumericValue(board[i][j])<10){
                        if(checkDuplicates.contains(board[i][j])){
                            return false;
                        };
                        checkDuplicates.add(board[i][j]);
                    }
                    else{
                        return false;
                    }
                    
                }
            }
        }

         for(int i=0;i<9;i++){
            HashSet<Character> checkDuplicates = new HashSet<Character>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.'){
                    continue;
                }
                else{
                    if(Character.getNumericValue(board[j][i])>0 && Character.getNumericValue(board[j][i])<10){
                        if(checkDuplicates.contains(board[j][i])){
                            return false;
                        };
                        checkDuplicates.add(board[j][i]);
                    }
                    else{
                        return false;
                    }
                    
                }
            }
        }

        for(int square=0;square<9;square++){
            HashSet<Character> storage = new HashSet<Character>();
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    int row = (square/3)*3 +i;
                    int col = (square%3)*3 +j;
                    if (board[row][col] == '.') continue;
                     if(storage.contains(board[row][col])){
                        return false;
                    }
                      storage.add(board[row][col]);  
                }

            }


        }
        return true;


    }
}
