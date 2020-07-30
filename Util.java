import java.util.Map;

public class Util {
    
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final int EAST = 2;
    public static final int WEST = 3;

    public static final Map<String, Integer> DIRECTIONS
        = Map.of(
            "north", Util.NORTH,
            "south", Util.SOUTH,
            "east", Util.EAST,
            "west", Util.WEST
        ); 
    
}