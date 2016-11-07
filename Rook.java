
/**
 * Write a description of class Rook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rook extends ChessPiece
{
    // instance variables - replace the example below with your own
    private chessGame game;//To determine which game does this piece belong to
    //Chess is a 2 person game identified by colours black and white thus this defines the owner
    private String owner; // owner = “black” or “white” (its colour)
    private ChessLocation location;//Current location of the knight piece

    /**
     * Constructor for objects of class Rook
     */
    public Rook(String owner, ChessLocation initiallocation, chessGame game,char id)
    
    {
        super(owner,initiallocation,game,id);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void moveto(ChessLocation newLocation)
    {
        // put your code here
        if(super.location.GetRow()==newLocation.GetRow() || super.location.GetCol()==newLocation.GetCol()){
            game.board.removePiece(location);
            location=newLocation;
            game.board.placePieceAt(this,location);
        }else{
            System.out.println("Ilegal Move");
        }
    }
}
