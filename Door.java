import java.util.*;

public class Door
{
    private String title;
    private String desc;
    private double prob;

    public Door(String title, String desc, double prob)
    {
        this.title = title;
        this.desc = desc;
        this.prob = prob;
    }

    public Boolean canPassThrough()
    {
        Random rand = new Random();
        int range = rand.nextInt(10) + 1;
        if (range >= 10 * prob)
            return true;
        return false;
    }

    public String getDesc()
    {
        return desc;
    }

    public String getTitle()
    {
        return title;
    }

    @Override
    public String toString()
    {
        return title;
    }



}