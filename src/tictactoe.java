import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {

        System.out.println("Do you want to play TicTacToe? Y/N");
        Scanner start = new Scanner(System.in);
        String knapp = start.nextLine();
        while (knapp.equals("Y") || knapp.equals("y")) {

            char[] board = new char[9];
            int play = 0;
            char turn = 'X';

            for (int i = 0; i < 9; i++) {
                board[i] = ' ';
            }

            for (int round = 0; round < 9; ) {

                System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                        "-+-+-" + "\n" +
                        board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                        "-+-+-" + "\n" +
                        board[6] + "|" + board[7] + "|" + board[8] + "\n");


                System.out.println("It is your turn " + turn + ", move to which place?");


                Scanner scan = new Scanner(System.in);
                play = Integer.parseInt(scan.nextLine());
                play = play - 1;

                if (board[play] == ' ') {
                    board[play] = turn;
                    round = round + 1;
                } else {
                    System.out.println("That place is already filled.\nMove to which place?");
                    continue;
                }


                if (board[0] == board[1] && board[1] == board[2] && board[0] != ' ') {
                    System.out.println(board[0] + " wins!");
                    System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                            "-+-+-" + "\n" +
                            board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                            "-+-+-" + "\n" +
                            board[6] + "|" + board[7] + "|" + board[8]);
                    break;
                } else if (board[3] == board[4] && board[4] == board[5] && board[3] != ' ') {
                    System.out.println(board[3] + " wins!");
                    System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                            "-+-+-" + "\n" +
                            board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                            "-+-+-" + "\n" +
                            board[6] + "|" + board[7] + "|" + board[8]);
                    break;
                } else if (board[6] == board[7] && board[7] == board[8] && board[6] != ' ') {
                    System.out.println(board[6] + " wins!");
                    System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                            "-+-+-" + "\n" +
                            board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                            "-+-+-" + "\n" +
                            board[6] + "|" + board[7] + "|" + board[8]);
                    break;
                } else if (board[0] == board[3] && board[3] == board[6] && board[0] != ' ') {
                    System.out.println(board[0] + " wins!");
                    System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                            "-+-+-" + "\n" +
                            board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                            "-+-+-" + "\n" +
                            board[6] + "|" + board[7] + "|" + board[8]);
                    break;
                } else if (board[1] == board[4] && board[4] == board[7] && board[1] != ' ') {
                    System.out.println(board[1] + " wins!");
                    System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                            "-+-+-" + "\n" +
                            board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                            "-+-+-" + "\n" +
                            board[6] + "|" + board[7] + "|" + board[8]);
                    break;
                } else if (board[2] == board[5] && board[5] == board[8] && board[2] != ' ') {
                    System.out.println(board[2] + " wins!");
                    System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                            "-+-+-" + "\n" +
                            board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                            "-+-+-" + "\n" +
                            board[6] + "|" + board[7] + "|" + board[8]);
                    break;
                } else if (board[0] == board[4] && board[4] == board[8] && board[0] != ' ') {
                    System.out.println(board[0] + " wins!");
                    System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                            "-+-+-" + "\n" +
                            board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                            "-+-+-" + "\n" +
                            board[6] + "|" + board[7] + "|" + board[8]);
                    break;
                } else if (board[2] == board[4] && board[4] == board[6] && board[2] != ' ') {
                    System.out.println(board[2] + " wins!");
                    System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                            "-+-+-" + "\n" +
                            board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                            "-+-+-" + "\n" +
                            board[6] + "|" + board[7] + "|" + board[8]);
                    break;
                }

                if (round == 9) {
                    System.out.println("It's a Tie!");
                    System.out.println(board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                            "-+-+-" + "\n" +
                            board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                            "-+-+-" + "\n" +
                            board[6] + "|" + board[7] + "|" + board[8]);
                    break;
                }

                if (turn == 'O') {
                    turn = 'X';
                } else {
                    turn = 'O';
                }

            }
            System.out.println("Do you want to play TicTacToe again? Y/N");
            Scanner replay = new Scanner(System.in);
            knapp = start.nextLine();
        }
    }
}