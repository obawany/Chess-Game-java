
/**
 
 * 
 * 
 * 
 * 
 * ChessLocation allows you to store the rows and cols and have accessible methods
 */
public class ChessLocation
{
    //To determine where this knight is at the chess board
    private int row1;
    private int col1;
    
    /**
     * Constructor for objects of class ChessLocation
     */
    public ChessLocation(int row,int col)
    {
        // initialise instance variables for row and column
        row1 = row;
        col1 = col;
        
    }
    /**
     *GetRow method returns the row
     * 
     */
    public int GetRow()
    {
        return row1;
    }
    /**
     * Getcol method returns the col
     */public int GetCol()
    {
        return col1;
    }
    //equals
}
