import java.util.ArrayList;

public class Queue <E> implements QueueInterface<E>
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    private ArrayList <E> queue;

    public Queue()
    {
        queue = new ArrayList <> ();
    }

    @Override
    public String toString()
    {
        return queue.toString();
    }

    @Override
    public boolean offer(E object)
    {
        queue.add(queue.size(), object);
        return true;
    }

    @Override
    public boolean add(E object)
    {
        queue.add(queue.size(), object);
        return true;
    }

    @Override
    public E peek()
    {
        if (queue.isEmpty() == false)
        {
            return queue.get(0);
        }
        else
        {
            return null;
        }
    }

    @Override
    public E element()
    {
        if (queue.isEmpty() == false)
        {
            return queue.get(0);
        }
        else
        {
            return null;
        }
    }

    @Override
    public E poll()
    {
        if (queue.isEmpty() == false)
        {
            return queue.remove(0);
        }
        else
        {
            return null;
        }
    }

    @Override
    public E remove()
    {
        if (queue.isEmpty() == false)
        {
            return queue.remove(0);
        }
        else
        {
            return null;
        }
    }

    @Override
    public int size()
    {
        return queue.size();
    }

    @Override
    public E get(int index)
    {
        if (queue.isEmpty() || index < 0 || index >= queue.size())
        {
            return null;
        }
        else
        {
            return queue.get(index);
        }
    }

    @Override
    public boolean empty()
    {
        if (queue.isEmpty() == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}