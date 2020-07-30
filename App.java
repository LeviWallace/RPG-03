import java.util.*;

public class App {
 
    public static void main(String[] args)
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

    public static void main3(String[] args) throws Exception
    {
        TheMap map = new TheMap();
        System.out.println("Done");
    }

    public static void main1(String[] args) throws Exception
    {
        // TheMap map = new TheMap();
        // int[] ls = {1, 2, 3};
        // List<Integer> ls2 = new ArrayList<Integer>(Arrays.asList({1, 2, 3}));
        // List<Integer> ls2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        // System.out.println(ls2.get(5));
        // System.out.println(ls);
        System.out.println(takeAnInt(1));
    }

    public static int takeAnInt(int i) throws Exception
    {
        if (i == 1)
        {
            throw new IllegalArgumentException();
        }
        return i;
    }
    


    public static void gameLoop2() throws Exception
    {
        TheMap map = new TheMap();
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
        DisplayText.display(map.getRoom(map.location).description());
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