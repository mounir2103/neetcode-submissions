class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> rows = new ArrayList<>();
        List<Set<Character>> boxes = new ArrayList<>();
        List<Set<Character>> cols = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
            boxes.add(new HashSet<>());
        }


        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){

                char c = board[i][j];
                if(c == '.'){
                    continue;
                }

                
                int n = i/3;
                int m = j/3;
                int boxeIndex = (n*3) + m;
                if(!rows.get(i).add(board[i][j]) || !cols.get(j).add(board[i][j]) || !boxes.get(boxeIndex).add(board[i][j])){
                    return false;
                } 
                
                
            }
        }
        return true;

        
    }
}
