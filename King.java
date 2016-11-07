
/**
 * Write a description of class King here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class King extends ChessPiece
{
    // instance variables - replace the example below with your own
   private chessGame game;//To determine which game does this piece belong to
//Chess is a 2 person game identified by colours black and white thus this defines the owner
private String owner; // owner = “black” or “white” (its colour)
private ChessLocation location;//Current location of the knight piece

    /**
     * Constructor for objects of class King
     */
    public King(String owner, ChessLocation initiallocation, chessGame game,char id)
    {
       //Initialize the owner, location and the game
       //Place user on the chessboard with the initialLocation
       super(owner,initiallocation,game,id);
       
    }
 public void moveto(ChessLocation newLocation)
    {//Check the legality of the move
        if( Math.abs(super.location.GetRow()-newLocation.GetRow())==0 && Math.abs(super.location.GetCol()-newLocation.GetCol())==1)
        {  //If the move is legal, get ChessBoard from the object game, 
           //remove the knight from the old location and place the knight at the newLocation 
           game.board.removePiece(location);
            location=newLocation;
            game.board.placePieceAt(this,location);
    }else if ( Math.abs(super.location.GetRow()-newLocation.GetRow())==1 && Math.abs(super.location.GetCol()-newLocation.GetCol())==0)
        {//If the move is legal, get ChessBoard from the object game, 
           //remove the knight from the old location and place the knight at the newLocation
           game.board.removePiece(location);
            location=newLocation;
            game.board.placePieceAt(this,location);
     
    }else if ( Math.abs(super.location.GetRow()-newLocation.GetRow())==1 && Math.abs(super.location.GetCol()-newLocation.GetCol())==1)
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
