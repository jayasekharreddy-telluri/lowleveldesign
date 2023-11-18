package dayfive;

import java.util.*;

public class TicTacToeGame {

    Deque<Player> players;

    Board board;

    public TicTacToeGame() {

        intializeGame();
    }

    private void intializeGame() {

        players = new LinkedList<>();

        PlayingPieceX pieceX = new PlayingPieceX();

        Player playerOne = new Player("jai", pieceX);


        PlayingPieceO pieceO = new PlayingPieceO();

        Player playerTwo = new Player("sai", pieceO);

        players.add(playerOne);
        players.add(playerTwo);

        board = new Board(3);

    }

    public String startGame() {

        boolean noWinner = true;

        while (noWinner) {

            Player playerTurn = players.removeFirst();

            board.printBoard();
            // get free space

            List<Pair<Integer, Integer>> freeSpaces = board.getFreeCells();

            if (freeSpaces.isEmpty()) {

                noWinner = false;
                continue;
            }

            ///read the user input

            System.out.println("Player: " + playerTurn.name + " Enter row,column: ");

            Scanner inputScanner = new Scanner(System.in);

            String s = inputScanner.nextLine();

            String[] values = s.split(",");

            int inputRow = Integer.valueOf(values[0]);


            int inputColumn = Integer.valueOf(values[1]);

            //place the piece

            boolean pieceAddedSuccessfully = board.addPiece(inputRow, inputColumn, playerTurn.playingPiece);

            if (!pieceAddedSuccessfully) {

                //player has to choose another cell

                System.out.println("Incorrect position chosen, try again");

                players.addFirst(playerTurn);
                continue;
            }

            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType);

            if (winner) {

                return playerTurn.name;
            }

        }

        return "tie";

    }

    private boolean isThereWinner(int inputRow, int inputColumn, PieceType pieceType) {

        boolean rowMatch = true;

        boolean columnMatch = true;

        boolean diagonalMatch = true;

        boolean antiDiagonalMatch = true;

        //need check row
        for (int i = 0; i < board.size; i++){

            if (board.board[inputRow][i] == null || board.board[inputRow][i].pieceType != pieceType){

                rowMatch = false;
            }
        }

        // need to check column
        for (int i = 0; i < board.size; i++){

            if (board.board[i][inputColumn] == null || board.board[i][inputColumn].pieceType != pieceType){

                columnMatch = false;
            }
        }


        // need to check diagonal
        for (int i = 0,j = 0; i < board.size; i++,j++){

            if (board.board[i][j] == null || board.board[i][j].pieceType != pieceType){

                diagonalMatch = false;
            }
        }


        // need to check anti-diagonal
        for (int i = 0,j = board.size - 1; i < board.size ; i++,j--){

            if (board.board[i][j] == null || board.board[i][j].pieceType != pieceType){

                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

    }
}
