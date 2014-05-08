
/**
 * Write a description of class dialog here.
 * 
 * @author Justin Nichol
 * @version .01
 */

public class dialog
{
    // instance variables - replace the example below with your own
    private String npcString = "";
    private String playerResponse = "";
    int firstRes = 0;
    int secondRes = 0;
    int thirdRes = 0;
    int fourthRes = 0;
    int numRes = 0;

    /**
     * Constructor for objects of class dialog
     */
    public dialog(String npc, String responses, int firstRes, int secondRes, int thirdRes, int fourthRes, int numRes)
    {
        this.npcString = npc;
        this.playerResponse = responses;
        this.firstRes = firstRes;
        this.secondRes = secondRes;
        this.thirdRes = thirdRes;
        this.fourthRes = fourthRes;
        this.numRes = numRes;
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String npcDialog()
    {  
        return npcString;
    }
    
    public String getPlayerOptions()
    {
        return playerResponse;
    }
    
    public int nextBranch(int answer)
    {
        if (answer == 1)    {
            return firstRes;
        }
        else if (answer == 2)   {
            return secondRes;
        }
        else if (answer == 3)   {
            return thirdRes;
        }
        else    {
            return fourthRes;
        }
    }
    
    public int getNumResponses()
    {
        return numRes;
    }
    
}