import java.util.*;

public interface Room
{
    String getName();
    String getDesc();
    List<Door> getDoors();
    List<String> getItems();
}