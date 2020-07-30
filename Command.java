import java.util.*;

// description of what the user typed
// translate a command into data
public class Command
{

    public static final int COMMAND_ERROR = -1;
    public static final int COMMAND_PICK_UP = 1;
    public static final int COMMAND_OPEN = 2;
    public static final int COMMAND_DESCRIBE = 3;
    public static final int COMMAND_WALK = 4;
    

    private String errorMessage;
    private String item;
    private int direction;
    private int theCommand;

    public Command() {
        errorMessage = "";
        item = "";
        direction = -1;
        theCommand = COMMAND_ERROR;
    }

    public static Command parseCommand(final String input) {
        // "pick up candle" <-- indicate that base command is "pick up" and the thing
        // it's referring to is "candle"
        // int field to mean the type of command, int field as an object id
        Command out = new Command();        
        String[] splitInput = input.split(" ");
        if (splitInput.length != 2)
        {
            out.theCommand = COMMAND_ERROR;
            out.errorMessage = "All commands must be two words seperated by a space.";
            return out;
        }
        if (splitInput[0].equals("open")) {
            out.theCommand = COMMAND_OPEN;
            if (Util.DIRECTIONS.containsKey(splitInput[1]))
                out.direction = Util.DIRECTIONS.get(splitInput[1]);
            return out;
        }
        if (splitInput[0].equals("pickup")) {
            
            out.theCommand = COMMAND_PICK_UP;
            out.item = splitInput[1];
            return out;
        }
        if (splitInput[0].equals("walk"))
        {
            out.theCommand = COMMAND_WALK;
            
        }
        out.errorMessage = "Not a recognized command";
        out.theCommand = COMMAND_ERROR;
        return out;
    } 

    public int getTheCommand()
    {
        return theCommand;
    }

    public String getItem()
    {
        return item;
    }

    public String getErrorMsg()
    {
        return errorMessage;
    }

    @Override
    public String toString() {
        return 
            "Error Message: " + errorMessage +
            "\nItem: " + item + 
            "\nDirection: " + direction +
            "\nCommand: " + theCommand;
    }
}