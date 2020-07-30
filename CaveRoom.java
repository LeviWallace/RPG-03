import java.util.*;


public class CaveRoom extends Room {

    String name;
    String desc;
    // List<String> doors;
    List<String> items;
    List<RoomDoor> doors;

    public CaveRoom(String name, String desc, List<RoomDoor> doors, List<String> items)
    {
        super(name, desc, doors, items);
    }
    // @Override
    // public Door getDoorObjByIndx(int i) throws Exception
    // {
    //     if (0 <= i && i < doors.size())
    //     {
    //         return doors.get(i);
    //     }
    //     throw new Exception("ERROR - ROOM: given number is not an index to the list of doors");
    // }

    // @Override
    // public List<String> getDoorTitles() {
    //     List<String> s = new ArrayList<>();
    //     for (Door door: doors)
    //     {
    //         s.add(door.getTitle());
    //     }
    //     return s;
    // }

    // @Override
    // public void describeDoors()
    // {
    //     System.out.println("You can enter the following doors: ");
    //     for(int i = 0; i < doors.size(); i++)
    //     {
    //         System.out.println(" " + (i+1) + ") " + doors.get(i).getTitle());
    //     }
    //     System.out.print("Choose which door to enter by typing in the corresponding number: ");
    // }

    // @Override
    // public void describeDescription() throws Exception
    // {
    //     System.out.println(desc1);
    //     Thread.sleep(5000);
    //     System.out.println(desc2);
    //     Thread.sleep(5000);
    // }

    @Override
    public String toString()
    {
        return name;
    }
    
}