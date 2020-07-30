import java.util.*;

public class TheMap {
    
    public String location;
    List<Room> rooms;
    List<Door> doors;

    // Rooms and Doors refer to each other by id, instead of desc or title
    //
    public TheMap()
    {   
        // where doors lead and what wall they're on (north south east or west)
        // room1 <-- door1 --> room2
        // first initialize all door objects
        // secondly we reference each door object by name in rooms, by passing in a list of door ids.
        // all door object will be held in 'doors' .
        Door door01 = new Door("iron door", "iron door");
        Door door02 = new Door("wooden door", "wooden door");
        List<RoomDoor> room01Doors = new ArrayList<>(Arrays.asList(
            new RoomDoor(door01.getId(), Util.NORTH, "room02"),
            new RoomDoor(door02.getId(), Util.SOUTH, "room02")
        ));
        List<RoomDoor> room02Doors = new ArrayList<>(Arrays.asList(
            new RoomDoor(door01.getId(), Util.SOUTH, "room01"),
            new RoomDoor(door02.getId(), Util.NORTH, "room01")
        ));
        doors = new ArrayList<>(Arrays.asList(door01, door02));
        // List<String> room01DoorIds = Arrays.asList(door01.getId(), door02.getId());
        Room cave01 = new CaveRoom("room01", "a dark cave", room01Doors, new ArrayList<String>());
        Room cave02 = new CaveRoom("room02", "a cold cave", room02Doors, new ArrayList<String>());
        location = "room01";
        rooms = new ArrayList<>(Arrays.asList(cave01, cave02));
    }

    public Room getRoom(String name) throws Exception
    {
        for(Room r: rooms)
        {
            if (r.getName().equals(name))
            {
                return r;
            }
        }
        throw new Exception("TheMap.getRoom(): Name " + name + " not found");
    }

    

    



    
}