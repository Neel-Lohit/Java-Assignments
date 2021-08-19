import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        runGame();
    }
    public static void runGame()
    {
        String winner="";
        boolean xTurn= true;
        String[][] gameBoard = new String[3][3];
        initializeGameBoard(gameBoard);
        printTheBoard(gameBoard);
        while(winner.equals(""))
        {
            if(xTurn)
                System.out.println("its X turn");
            else
                System.out.println("Its O turn");

            getUserInput(xTurn, gameBoard);
            System.out.println();

            printTheBoard(gameBoard);
            winner=getWinner(gameBoard);
            xTurn=!xTurn;
            if(winner.equals("") && isBoardFull(gameBoard))
                winner="C";
        }
        if(winner.equals("C"))
            System.out.println("No winner");
        else
            System.out.println("The winner is "+winner);

    }

    private static boolean isBoardFull(String[][] gameBoard) {
        int count=0;
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                    if(!gameBoard[i][j].equals(" "))
                        count++;
            }
        }
        return count==9;
    }

    private static String getWinner(String[][] gameBoard) {
        int rows=gameBoard.length;
        int col=gameBoard[0].length;
        for(int i=0;i<rows;i++)
        {
            if(!gameBoard[i][0].equals(" ") && gameBoard[i][0].equals(gameBoard[i][1]) && gameBoard[i][1].equals(gameBoard[i][2]))
                return gameBoard[i][0];
        }
        for(int i=0;i<col;i++)
        {
            if(!gameBoard[0][i].equals(" ") && gameBoard[0][i].equals(gameBoard[1][i]) && gameBoard[1][i].equals(gameBoard[2][i]))
                return gameBoard[0][i];
        }
        if(!gameBoard[0][0].equals(" ") && gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][2]))
            return gameBoard[0][0];
        if(!gameBoard[0][2].equals(" ") && gameBoard[2][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[0][2]))
            return gameBoard[2][0];
        return "";
    }

    private static void getUserInput(boolean xTurn, String[][] gameBoard) {
        Scanner scanner = new Scanner(System.in);
        boolean keepAsking=true;
        int row=0,col=0;
        while(keepAsking)
        {
            System.out.println("Enter row and column separated by a space ");
            row=scanner.nextInt();
            col=scanner.nextInt();
            if(row>=0 && col>=0 && col<=2 && row<=2)
            {
                if(!cellAlreadyOccupied(row,col,gameBoard))
                    keepAsking=false;
                else
                    System.out.println("Cell Already Occupied");
            }
        }
        if(xTurn)
            gameBoard[row][col]="X";
        else
            gameBoard[row][col]="O";
    }

    private static boolean cellAlreadyOccupied(int row, int col, String[][] gameBoard) {
        return !gameBoard[row][col].equals(" ");
    }

    public static void initializeGameBoard(String[][] gameBoard)
    {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = " ";
            }
        }
    }
    public static void printTheBoard(String[][] gameBoard)
    {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j]);
                if(j<2)
                    System.out.print(" | ");
            }
            System.out.println();
            System.out.println("- - - - - -");
        }
    }
}
