import java.util.*;

public class Room
{

    String name;
    String desc;
    List<String> items;
    List<RoomDoor> doors;

    public Room(String name, String desc, List<RoomDoor> doors, List<String> items)
    {
        this.name = name;
        this.desc = desc;
        this.doors = doors;
        this.items = items;
    }

    public String getName() 
    {
        return name;
    }

    public String getDesc()
    {
        return desc;
    }

    public List<String> getItems()
    {
        return items;
    }

    public List<RoomDoor> getDoors()
    {
        return doors;
    } 

    public String description()
    {
        return desc + "\nRoom's " + availableDoors();
    }

    public String availableDoors()
    {
        String out = "";
        for (RoomDoor d: doors)
        {
            out += " " + d.doorId + ":" +  Util.DIRECTIONS.;
        }
        return out;
    }
}