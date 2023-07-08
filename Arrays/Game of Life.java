
//https://leetcode.com/problems/game-of-life/description/
class Solution {
    int[] dx = new int[]{0, 0, -1, 1, -1, -1, 1, 1};
    int[] dy = new int[]{-1, 1, 0, 0, -1, 1, -1, 1};
    public void gameOfLife(int[][] board) {
        // Original - new - map
        // 0          0     0
        // 1          0     1    
        // 0          1     2
        // 1          1     3
        int n = board.length;
        int m = board[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int nei = countNeighbours(board, i, j);

                if(board[i][j] == 1){
                    board[i][j] = nei == 2 || nei == 3 ? 3 : 1;
                }
                else{
                    board[i][j] = nei == 3 ? 2 : 0;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j] = board[i][j] == 0 || board[i][j] == 1 ? 0 : 1;
            }
        }
    }
    public int countNeighbours(int[][] board, int i, int j){
        int sum = 0;
            for(int x=0;x<8;x++){
                int new_i = i + dx[x];
                int new_j = j + dy[x];
                sum += validate(board, new_i, new_j);
            }
            return sum;
    }
    public int validate(int[][] board, int i, int j){
            if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == 0 || board[i][j] == 2){
                return 0;
            }
            return 1;
    }
}