public class ChessBoard
{
    public static void main(String[] args)
    {
        //Create an 8x8 2D String array called chess.
        String[][] chess = new String[8][8];
        String[] back = {"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};
        String pawn = "Pawn";
        String dash = " - ";
        chess[0] = back;
        for (int c = 0; c < 8; c++) 
        {
            chess[1][c] = pawn;
        }
        for (int r = 2; r < 6; r++)
            {
            for (int c = 0; c < 8; c++)
            {
                chess[r][c] = empty;
            }
        }
        chess[7] = back;
        //Use this method to print the chess board onto the console
        print(chess);
        

    }
    
    public static void print(String[][] array)
    {

    }
}
