
/**
 * Write a description of class Conversation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Conversation
{
    public static void main(String[] args)
    {
    ArrayList<dialog> pyramidGuard = new ArrayList<dialog>();

    pyramidGuard.add(new dialog("You don’t look like you have business around here.", 
        "   1.) Oh, I just want to take a look around." +"\n" + "   2.) I’ve got information that your boss wants to hear." + "\n" + 
        "   3.) Just walking through Old Town and I saw you standing there. Thought to myself, ‘fellow as well-dressed as that, there has to be something worth seeing inside."+ "\n" +
        "   4.) I’d hate for you to think one guy with one gun is going to stop me from getting in there. Why don’t you just get out of my way?", 1, 7, 3, -2, 4));
    pyramidGuard.add(new dialog("Unless the boss wants you to, that ain’t going to happen.", 
        "   1.) Alright, alright.[leave]" +"\n" + "   2.) I’ve got information that your boss wants to hear." +"\n" + "   3.) Can I just stay out here with you?" + "\n" +
        "   4.) I’m just gonna go in there anyway, and I’d hate for you to think one guy with one gun is going to stop me. Why don’t you just get out of my way?", -1, 7, 4, -2, 4));
    pyramidGuard.add(new dialog("Do you have business here?", 
        "   1.) I’m hoping to talk to your boss, actually." +"\n" + "   2.) Alright, Alright. [leave]" + "\n" + "   3.) I’ve got information that your boss wants to hear." + "\n" +
        "   4.)How’s work? Seems like it must get boring standing out here all day.", 6, -1, 7, 5, 4));
    pyramidGuard.add(new dialog("Yeah, it’s a nice place. Clean a spot as it gets in Smoketown. What can I help you with?", 
        "   1.) I’m hoping to talk to your boss, actually." +"\n" + "   2.) Alright, Alright. [leave]" + "\n" + "   3.) I’ve got information that your boss wants to hear." + "\n" +
        "   4.)How’s work? Seems like it must get boring standing out here all day.", 6, -1, 7, 5, 4));
    pyramidGuard.add(new dialog("Can’t have you distracting me at work, I’m sorry. What can I help you with?", 
        "   1.) I’m hoping to talk to your boss, actually." +"\n" + "   2.) Alright, Alright. [leave]" + "\n" + "   3.) I’ve got information that your boss wants to hear." + "\n" +
        "   4.)How’s work? Seems like it must get boring standing out here all day.", 6, -1, 7, 5, 4));
    pyramidGuard.add(new dialog("I could do worse. Never thought I’d turn out a Lord, but that’s the way it played out. South Docks to Old Town. The Order does things a bit more, orderly.", 
        "   1.) Is it alright if I head in and talk to your boss?" +"\n" + "   2.) I'll be going. [leave]" + "\n" + "   3.) So I’ve got information that your boss wants to hear.", 7, -1, 7, -1, 3));
    pyramidGuard.add(new dialog("Sorry, can’t do that.", 
        "   1.) Well, if you put it that way...[attack]" +"\n" + "   2.) Alright, Alright. [leave]" + "\n" + "   3.) I’ve got information that your boss wants to hear.", -2, -1, 7, -1, 3));
    pyramidGuard.add(new dialog("Alright, but remember me and my gun are standing right here.", 
        "   1.) You know, maybe I shouldn't. [leave]" +"\n" + "   2.) No problem. [enter]" + "\n" + "   3.) If you’re going to be standing right here, maybe it’s better I take you out first. [attack]", -1, -3, -2, -1, 3));
    pyramidGuard.add(new dialog("South docks, right? You’ve got that bay look about you, same as me. " + 
        "You know how hard it is to get work. I can’t say I love the Order, but it feeds me, you know? If you’re looking for a job, just go in and ask for it. Might work.", 
        "   1.) Thank you, my friend. [enter]" +"\n" + "   2.) I’ll take you up on that sometime. [leave]", -3, -1, -1, -1, 2));
        

    boolean finished = false;
    Scanner in = new Scanner(System.in);
    int currentBranch = 0;
    int response = 0;
        
    
        while(!finished)
        {
            System.out.println(pyramidGuard.get(currentBranch).npcDialog());
            System.out.println(pyramidGuard.get(currentBranch).getPlayerOptions());
            response = in.nextInt();
            
            if (response <= pyramidGuard.get(currentBranch).getNumResponses() && response > 0)
            {
                currentBranch = pyramidGuard.get(currentBranch).nextBranch(response);
            }
            else 
            {
                 System.out.println("   That is not a valid dialog option, Please try again.");
            }
            
             if (currentBranch == -1)
            {
                System.out.print("   You leave." + "\n");
                finished = true;
            }
            else if (currentBranch == -2)
            {
                System.out.println("   You attack. Certain in your victory.");
                finished = true;
            }
            else if (currentBranch == -3)
            {
                System.out.println("   You enter.");
            }
        }
    }
}

