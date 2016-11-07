
/**
 *
 * 
 * 
 * 
 * 
 * ChessBoard class allows you to store a knight piece at different locations
 */
public class ChessBoard
{
    // instance variables - replace the example below with your own
    
    public ChessPiece [][] chessboard;//using a two-dimensional Array represent the ChessBoard class.
    public ChessPiece piece;
    /**
     * Constructor for objects of class ChessBoard
     */
    public ChessBoard()
    //The constructor will initialize the chess board. 
    //The job of the constructor would be to initialize all the elements in your data structure to all nulls,
    //as initially there aren't any pieces on the board.
    {
         //initialise instance variables
        chessboard = new ChessPiece [8][8];//Initializing a two-dimensional Array represent the ChessBoard class.
    }
    /**
     * This is method IsPieceAt return true or false when compared to rows and columns if the rows or cols
     * equal to rows and columns
     * 
     * 
     */
     public boolean isPieceAt(int row, int col)
    {   
        boolean value=false;
        if (chessboard[row][col]==piece){//rows and cols are compared are true 
            value = true;//return true
        }
        return value;//otherwise return false
    }
    
    /**
     * This is method placePieceAt changes rows and columns to row and columnsentered by the user
     * placePieceAt should place the given knight on your ChessBoard at the given location 
     * If the user attempts to add a 
     * piece to a location where one already exists, placePieceAt should overwrite the old piece with the new one.
     * 
     */public void  placePieceAt (ChessPiece piece, ChessLocation location)
    {  chessboard[location.GetRow()][location.GetCol()]=piece;//get the locaton from 
        // chessLocation getrow and col method and place the peice in 2d array
        piece.setLocation(location);
    }


    public ChessPiece getPieceAt(ChessLocation location)
    {return chessboard[location.GetRow()][location.GetCol()];
     
    }
    /**
     * The method removePiece removes whatever knight 
     * is at the specified row and column from your ChessBoard data structure,
     * setting the index at that row and column to be null.
     * This method is used to remove a piece on the board from the original 
     * location after a move.
     * 
     */
    public void removePiece(ChessLocation location)
    {
        chessboard [location.GetRow()][location.GetCol()]=null;//remove the piece from the location of row and col
    }
    /**
     * This Method PrintChessBoard draws out your ChessBoard
     */public void PrintChessBoard()
    {
        for (int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                if (chessboard [i][j] == null){
                    System.out.print(" - ");
                }
                else{
                    System.out.print(" "+this.getPieceAt(new ChessLocation(i,j)).getId()+" ");//If I j contains value then return K to be shown on the board
                }
            }
             System.out.println("");
        }
    }
    public ChessPiece[][] getBoard()
    {
        return chessboard;
    }
}
