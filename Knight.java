import static java.lang.Math.abs;
import java.lang.NullPointerException;
/**
 * 
 *
 * 
 * Every knight needs to know where it is and what is its color 
 * (who is the owner â€“ black or white?).
 */
public class Knight extends ChessPiece
{
// instance variables 
private chessGame game;//To determine which game does this piece belong to
//Chess is a 2 person game identified by colours black and white thus this defines the owner
private String owner; // owner = â€œblackâ€? or â€œwhiteâ€? (its colour)
private ChessLocation location;//Current location of the knight piece

/**
     * Constructor for objects of class Knight
     */
    public Knight(String owner, ChessLocation initiallocation, chessGame game,char id)
    
    {
       //Initialize the owner, location and the game
       //Place user on the chessboard with the initialLocation
       super(owner,initiallocation,game,id);
       
    }

    /**
     *This MoveTo method allows you to Move and place piece at a certain location
     * 
     *  
     */
    public void moveto(ChessLocation newLocation)
    {//Check the legality of the move
        if( Math.abs(super.location.GetRow()-newLocation.GetRow())==2 && Math.abs(super.location.GetCol()-newLocation.GetCol())==1)
        {  //If the move is legal, get ChessBoard from the object game, 
           //remove the knight from the old location and place the knight at the newLocation 
           game.board.removePiece(location);
            location=newLocation;
            game.board.placePieceAt(this,location);
    }else if ( Math.abs(super.location.GetRow()-newLocation.GetRow())==1 && Math.abs(super.location.GetCol()-newLocation.GetCol())==2)
        {//If the move is legal, get ChessBoard from the object game, 
           //remove the knight from the old location and place the knight at the newLocation
            game.board.removePiece(location);
            location=newLocation;
            game.board.placePieceAt(this,location);
     
    }else
        {//Error if the move is not legal
            System.out.println("Ilegal Move");
        }
}         
    }