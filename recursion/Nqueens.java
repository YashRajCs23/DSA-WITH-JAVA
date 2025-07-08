import java.util.Scanner;
public class Nqueens{
    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void nqueen(char [][] board,int row){
        int n = board.length;
        if (row == n) {
            printBoard(board);
            return;
        }
        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // Place queen
                nqueen(board, row + 1); // Recur to place next queen
                board[row][j] = '.'; // Backtracking
            }
        }
    }
    public static boolean isSafe(char[][] board,int row,int col){
        //chechk row
        int n=board.length;
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q') return false;
        }
        //check col
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }
        //check North east
        int i=row,j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q')return false;
            i--;
            j++;
        }
        //check south east
        i=row;
        j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q')return false;
            i++;
            j++;
        }
        //check south west
        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q')return false;
            i++;
            j--;
        }
        //check North west
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q')return false;
            i--;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            char [][] board=new char[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    board[i][j]='.';
                }
            }
            nqueen(board,0);
    }
}