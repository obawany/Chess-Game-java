import java.util.*;
/* 
 * playGame contains the main method which runs the program
 */
public class playGame
{
    // instance variables - replace the example below with your own
   private ChessPiece piece;

    /**
     * Constructor for objects of class playGame
     */
    public playGame()
    {
        // initialise instance variables
        //no constructor
    }

    /**
     * This method contains the main void which contains the function 
     * 
     *  
     */
    public  void main(String[] args)
    {
        // put your code here
        //display an initial menu on the screen describe what the program is about
        System.out.println("This is Game Of Chess");
        //initialize a new chessGame
        chessGame NewGame=new chessGame("Player1","Player2");
        
        //retrieve and display the chessBoard from this initialized game
        NewGame.board.PrintChessBoard();
        //NewGame.board.removePiece(new ChessLocation(0,1));
        //keep on asking the user to move the knight to a new location until â€œquitâ€? is typed in
        //each time the knight is moved, display the board with the new location
            
        while(true)
        {   System.out.println("Press Enter to Play;Type 'Quit' and Press Enter to end the game");
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("Press Enter or quit! ");
            String enter = reader.nextLine(); // Scans the next token of the input as an line
            
            if(enter.equals("quit"))
            {System.exit(0);
            }else
            {   System.out.println("Enter any value for source row from 0-7");
                int Srow=reader.nextInt();
                System.out.println("Enter any value for source column from 0-7");
                int Scol=reader.nextInt();
                System.out.println("Enter any value for destination row from 0-7");
                int Drow=reader.nextInt();
                System.out.println("Enter any value for destination column from 0-7");
                int Dcol=reader.nextInt();
                if(NewGame.getBoard().isPieceAt(Srow,Scol)==true){
                if(NewGame.getBoard().getPieceAt(new ChessLocation(Srow,Srow)).checkLineOfSight(new ChessLocation(Srow,Scol),new ChessLocation(Drow,Dcol))==true  && NewGame.getBoard().isPieceAt(Drow,Dcol)== false){
                    NewGame.board.getPieceAt(new ChessLocation(Srow,Scol)).moveto(new ChessLocation(Drow,Dcol));
               
                }else if(NewGame.getBoard().isPieceAt(Drow,Dcol)==true){
                    System.out.println("There is a piece at the location");
                }
                }else if(NewGame.getBoard().isPieceAt(Srow,Scol)==false){
                    System.out.println("There is no piece at the location");
                }
             NewGame.board.PrintChessBoard();   
            }
        }
       
       
    }
    
    }

