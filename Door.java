import java.util.*;

public class Door
{
    
    private String id;
    private String desc;
    private boolean isOpen;
    
    
    public Door(String id, String desc)
    {
        this.id = id;
        this.desc = desc;
        this.isOpen = false;
    }

    
    public String getDesc()
    {
        return desc;
    }

    public String getId()
    {
        return id;
    }

    @Override
    public String toString()
    {
        return desc;
    }

    

}