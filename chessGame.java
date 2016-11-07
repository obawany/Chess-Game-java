

/**
 * 
 * 
 * 
 * ChessGame class allows you to store a knight piece at different locations
 * 
 */
public class chessGame
{
    public ChessBoard board;//Chess board to play the game on
    public String player1;
    public String player2;
    public Knight N1;
    public Knight N2;
    public King K;
    public Queen Q;
    public Bishop B1;
    public Bishop B2;
    public Rook R1;
    public Rook R2;
    public Pawn P1;
    public Pawn P2;
    public Pawn P3;
    public Pawn P4;
    public Pawn P5;
    public Pawn P6;
    public Pawn P7;
    public Pawn P8;
    

    /**
     * Constructor for objects of class chessGame
     */
    public chessGame(String player1,String player2)
    {
        // initialise instance variables
        //Initialize the chess board
        board= new ChessBoard();
        //Initialize a new knight and add it to your board (hint: this all can be done 
        //in one statement by calling the Knight constructor and using the â€œthisâ€? keyword)
        
       N1=new Knight("Player1", new ChessLocation(0,1),this,'N');
       board.placePieceAt(N1,new ChessLocation(0,1));
       
       N2=new Knight("Player1", new ChessLocation(0,6),this,'N');
       board.placePieceAt(N2,new ChessLocation(0,6));
        
       K=new King("Player1",new ChessLocation(0,4),this,'K');
       board.placePieceAt(K,new ChessLocation(0,4));
       
       Q=new Queen("Player1",new ChessLocation(0,3),this,'Q');
       board.placePieceAt(Q,new ChessLocation(0,3));
       
       B1=new Bishop("Player1",new ChessLocation(0,2),this,'B');
       board.placePieceAt(B1,new ChessLocation(0,2));
       
       B2=new Bishop("Player1",new ChessLocation(0,5),this,'B');
       board.placePieceAt(B2,new ChessLocation(0,5));
       
       R1=new Rook("Player1",new ChessLocation(0,0),this,'R');
       board.placePieceAt(R1,new ChessLocation(0,0));
       
       R2=new Rook("Player1",new ChessLocation(0,7),this,'R');
       board.placePieceAt(R2,new ChessLocation(0,7));
       
       P1=new Pawn("Player1",new ChessLocation(1,0),this,'P');
       board.placePieceAt(P1,new ChessLocation(1,0));
       
       P2=new Pawn("Player1",new ChessLocation(1,1),this,'P');
       board.placePieceAt(P2,new ChessLocation(1,1));
       
       P3=new Pawn("Player1",new ChessLocation(1,2),this,'P');
       board.placePieceAt(P3,new ChessLocation(1,2));
       
       P4=new Pawn("Player1",new ChessLocation(1,3),this,'P');
       board.placePieceAt(P4,new ChessLocation(1,3));
       
       P5=new Pawn("Player1",new ChessLocation(1,4),this,'P');
       board.placePieceAt(P5,new ChessLocation(1,4));
       
       P6=new Pawn("Player1",new ChessLocation(1,5),this,'P');
       board.placePieceAt(P6,new ChessLocation(1,5));
       
       P7=new Pawn("Player1",new ChessLocation(1,6),this,'P');
       board.placePieceAt(P7,new ChessLocation(1,6));
       
       P8=new Pawn("Player1",new ChessLocation(1,7),this,'P');
       board.placePieceAt(P8,new ChessLocation(1,7));
       
       
       
    }
    public ChessBoard getBoard()
    {
        return board;
    }
    
}
