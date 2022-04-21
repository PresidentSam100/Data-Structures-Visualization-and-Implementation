import java.util.*;

public class MySet <E> implements SetInterface <E>
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    private ArrayList <E> set;

    public MySet()
    {
        set = new ArrayList <E> ();
    }

    @Override
    public boolean add(E object)
    {
        return set.add(object);
    }

    @Override
    public boolean contains(E object)
    {
        return set.contains(object);
    }

    @Override
    public boolean remove(E object)
    {
        return set.remove(object);
    }

    @Override
    public Iterator <E> iterator()
    {
        return set.iterator();
    }

    @Override
    public Object [] toArray()
    {
        return set.toArray();
    }

    @Override
    public boolean isEmpty()
    {
        return set.isEmpty();
    }

    @Override
    public void clear()
    {
        set.clear();
    }

    @Override
    public int size()
    {
        return set.size();
    }
}