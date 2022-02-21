public class tictactoe {
    public static void main(String[] args) {
        char[] board = new char[9];

        for (int i = 0; i < 9; i++) {
            board[i] = ' ';
        }


        System.out.println(board[0] + '|' + board[1] + '|' + board[2]);
        System.out.println("-+-+-");
        System.out.println(board[3] + '|' + board[4] + '|' + board[5]);
        System.out.println("-+-+-");
        System.out.println(board[6] + '|' + board[7] + '|' + board[8]);

        if (board[0] == board[1] && board[1] == board[2]) {

        }

    }
}
