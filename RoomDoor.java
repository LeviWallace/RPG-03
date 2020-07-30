public class RoomDoor {


    public String doorId;
    public int location;
    public String otherRoomId;

    public RoomDoor(String doorId, int location, String otherRoomId)
    {
        this.doorId = doorId;
        this.location = location;
        this.otherRoomId = otherRoomId;
    }
}