import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        char[] board = new char[9];
        int play = 0;
        char turn = 'X';

        for (int i = 0; i < 9; i++) {
            board[i] = ' ';
        }

        for (int round = 0; round < 9; round++) {

            System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                    "-+-+-" + "\n" +
                    board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                    "-+-+-" + "\n" +
                    board[6] + "|" + board[7] + "|" + board[8]);


            System.out.println("It is your turn " + turn + ", move to which place?");

            if (turn == 'X') {
                turn = 'O';
            }
            else {
                turn = 'X';
            }


            Scanner scan = new Scanner(System.in);
            play = Integer.parseInt( scan.nextLine());
            play = play -1;
            board[play] = turn;










            if (board[0] == board[1] && board[1] == board[2] && board[0] != ' ') {
                System.out.println(board[0] + " wins!");
                System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                        "-+-+-" + "\n" +
                        board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                        "-+-+-" + "\n" +
                        board[6] + "|" + board[7] + "|" + board[8]);
            }


            else if (board[3] == board[4] && board[4] == board[5] && board[3] != ' ') {
                System.out.println(board[3] + " wins!");
                System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                        "-+-+-" + "\n" +
                        board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                        "-+-+-" + "\n" +
                        board[6] + "|" + board[7] + "|" + board[8]);
            }


            else if (board[6] == board[7] && board[7] == board[8] && board[6] != ' ') {
                System.out.println(board[6] + " wins!");
                System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                        "-+-+-" + "\n" +
                        board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                        "-+-+-" + "\n" +
                        board[6] + "|" + board[7] + "|" + board[8]);
            }



            else if (board[0] == board[3] && board[3] == board[6] && board[0] != ' ') {
                System.out.println(board[0] + " wins!");
                System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                        "-+-+-" + "\n" +
                        board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                        "-+-+-" + "\n" +
                        board[6] + "|" + board[7] + "|" + board[8]);
            }



            else if (board[1] == board[4] && board[4] == board[7] && board[1] != ' ') {
                System.out.println(board[1] + " wins!");
                System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                        "-+-+-" + "\n" +
                        board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                        "-+-+-" + "\n" +
                        board[6] + "|" + board[7] + "|" + board[8]);
            }



            else if (board[2] == board[5] && board[5] == board[8] && board[2] != ' ') {
                System.out.println(board[2] + " wins!");
                System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                        "-+-+-" + "\n" +
                        board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                        "-+-+-" + "\n" +
                        board[6] + "|" + board[7] + "|" + board[8]);
            }



            else if (board[0] == board[4] && board[4] == board[8] && board[0] != ' ') {
                System.out.println(board[0] + " wins!");
                System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                        "-+-+-" + "\n" +
                        board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                        "-+-+-" + "\n" +
                        board[6] + "|" + board[7] + "|" + board[8]);
            }



            else if (board[2] == board[4] && board[4] == board[6] && board[2] != ' ') {
                System.out.println(board[2] + " wins!");
                System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                        "-+-+-" + "\n" +
                        board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                        "-+-+-" + "\n" +
                        board[6] + "|" + board[7] + "|" + board[8]);
            }






        }
    }
}
