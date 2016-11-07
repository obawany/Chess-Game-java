
/**
 * Write a description of class Pawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pawn extends ChessPiece
{
    // instance variables - replace the example below with your own
    // instance variables - replace the example below with your own
    private chessGame game;//To determine which game does this piece belong to
    //Chess is a 2 person game identified by colours black and white thus this defines the owner
    private String owner; // owner = “black” or “white” (its colour)
    private ChessLocation location;//Current location of the knight piece
    private boolean ChkFirst;

    /**
     * Constructor for objects of class Pawn
     */
    public Pawn(String owner, ChessLocation initiallocation, chessGame game,char id)
    
    {
        super(owner,initiallocation,game,id);
    
      
    }
    public boolean CheckFirst(ChessLocation Location){
    if (location.GetRow() ==1){
        ChkFirst= true;
    }else{
         ChkFirst= false;   
    
    }
    return ChkFirst;
    
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
        if(this.CheckFirst(new ChessLocation(location.GetRow(),location.GetCol()))==true){
        if(Math.abs(super.location.GetRow()-newLocation.GetRow())==1 || Math.abs(super.location.GetRow()-newLocation.GetRow())==2 && Math.abs(super.location.GetCol()-newLocation.GetCol())==0){
            super.game.board.removePiece(location);
           location=newLocation;
           game.board.placePieceAt(this,newLocation);
        }
        }else if(this.CheckFirst(new ChessLocation(location.GetRow(),location.GetCol()))== false && Math.abs(super.location.GetRow()-newLocation.GetRow())==1){
           super.game.board.removePiece(location);
           location=newLocation;
           game.board.placePieceAt(this,newLocation);
        }else {
        System.out.println("Ilegal Move");
        }
    }
}
