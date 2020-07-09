import java.util.*;

public class App {
 
    public static void main2(String[] args)
    {
        // System.out.println("Hello World");
        // m.showRooms();
        try
        {
            gameLoop2();
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) throws Exception
    {
        DisplayText.display("Google News is a news aggregator app developed by Google. It presents a continuous flow of articles organized from thousands of publishers and magazines. Google News is available as an app on Android, iOS, and the Web.");
    }


    public static void gameLoop2() throws Exception
    {
        Scanner scan = new Scanner(System.in);
        // Maze m = new Maze();
        // m.showRooms();
        System.out.println("Your Journey begins . . .");
        Thread.sleep(500);
        // first enter a room
        // walk north
        // "you enter a dark cave with low curtains hanging etc. etc."
        // pick up curtain
        // "too slippery to grasp"
        // describe room
        // a dark cave with low curtains
        while(true)
        {
            String input = scan.nextLine();
            if (input.equals("quit"))
                break;
            Command newCommand = Command.parseCommand(input);
            // the command exists before we've parsed anything
            if (newCommand != null)
            {
                // executeCommand;
                System.out.println(newCommand);
            }
            else
            {
                System.out.println("Invalid Command");
                continue;
            }
            // check if they've typed a valid command
            // if not print invalid and continue
            // if so, execute the command

        }
        scan.close();
    }

    // commands: enter 1, 
    // we choose our return value - do both jobs
    // indicate whether it's a valid command - 
    // indicate whether it's invalid - 


}