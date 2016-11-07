
/**
 * Write a description of class ChessPiece here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChessPiece
{
    // instance variables - replace the example below with your own
    protected chessGame game;
    private String owner;
    protected ChessLocation location;
    protected char id;

    /**
     * Constructor for objects of class ChessPiece
     */
    public ChessPiece(String Owner, ChessLocation initialLocation,chessGame game,char id)
    {
       this.owner=owner;
       this.game=game;
       location=initialLocation;
       this.id=id;
       
    }
    public void setLocation (ChessLocation newLocation)
    {
        this.location=newLocation;
    }
    public char getId()
    {
    return id;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public  void moveto(ChessLocation newLocation)
    {
        if(newLocation.GetRow()<0 || newLocation.GetRow()>7 ){
            System.out.println("Out of bound location entered");
        }else if(newLocation.GetCol()<0 || newLocation.GetCol()>7 ){
            System.out.println("Out of bound location entered");
        }else {
            game.board.removePiece(location);
            game.board.placePieceAt(this,newLocation);
        }
        //return x + y;
    }
    protected boolean checkLineOfSight(ChessLocation start, ChessLocation end){
    
    boolean freeMove = true;

    
    int y= end.GetRow() - start.GetRow();
    int x = end.GetCol() - start.GetCol();
    
    if (x < 0 && y == 0){
     for (int i= start.GetCol() - 1; i<= end.GetCol(); i--){
        if(game.getBoard().getBoard()[start.GetRow()][i] != null){
            freeMove = false;
        }
        }
    }
    else if(x>0 && y==0){
    for (int i= start.GetCol() + 1; i<= end.GetCol(); i++){
        if(game.getBoard().getBoard()[start.GetRow()][i] != null){
            freeMove = false;
        }
        }
    }
    else if(y>0 && x==0){
    for (int i= start.GetRow() + 1; i<= end.GetRow(); i++){
        if(game.getBoard().getBoard()[i][start.GetCol()] != null){
            freeMove = false;
        }
        }
    }
    else if(y<0 && x==0){
    for (int i= start.GetRow() - 1; i<= end.GetRow(); i--){
        if(game.getBoard().getBoard()[i][start.GetCol()] != null){
            freeMove = false;
        }
        }
    }
    else if(y==x && y>0){
    for (int i= start.GetRow() + 1, j = start.GetCol() +1 ; i<= end.GetRow(); i++,j++){
        if(game.getBoard().getBoard()[i][j] != null){
            freeMove = false;
        }
        }
    }
    else if(y==x && y>0 && x<0){
    for (int i= start.GetRow() -1 , j = start.GetCol() - 1; i>= end.GetRow(); i--, j--){
        if(game.getBoard().getBoard()[i][j] != null){
            freeMove = false;
        }
        }
    }
    else if(-y==x && y<0 && x<0){
    for (int i= start.GetRow() - 1, j = start.GetCol() +1; i>= end.GetRow(); i--, j++){
        if(game.getBoard().getBoard()[i][j] != null){
            freeMove = false;
        }
        }
    }
    else if(-x==y && x< 0 && y>0){
    for (int i= start.GetRow() + 1, j = start.GetCol() -1; i<= end.GetRow(); i++, j--){
        if(game.getBoard().getBoard()[i][j] != null){
            freeMove = false;
        }
        }
    }
    if(freeMove == false){
       System.out.println("Invalid Move. There is a piece blocking the path!");
    }
    System.out.println();
    return freeMove;   
   }
}
