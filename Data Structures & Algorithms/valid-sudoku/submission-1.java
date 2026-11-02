class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<HashSet<Character>> rows = new ArrayList<>();
        List<HashSet<Character>> colums = new ArrayList<>();
        List<HashSet<Character>> boxes = new ArrayList<>();

        for(int i=0; i<9; i++){
            rows.add(new HashSet<>());
            colums.add(new HashSet<>());
            boxes.add(new HashSet<>());
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                int boxIndex = ((i/3)*3)+(j/3);
                if(!rows.get(i).add(board[i][j]) || !colums.get(j).add(board[i][j]) || !boxes.get(boxIndex).add(board[i][j]) ){
                    return false;
                }

            }
        }
        return true;
    }
}
