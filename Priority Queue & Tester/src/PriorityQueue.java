import java.util.ArrayList;

public class PriorityQueue <E extends Comparable> implements PriorityQueueInterface <E>
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    private ArrayList <E> priorityQueue;

    public PriorityQueue()
    {
        priorityQueue = new ArrayList <E> ();
    }

    public void addHelper(int index)
    {
        int parent = index - 1;
        if (parent >= 0 && get(index).compareTo(get(parent)) < 0)
        {
            E temp = get(index);
            priorityQueue.set(index, get(parent));
            priorityQueue.set(parent, temp);
            addHelper(parent);
        }
    }

    @Override
    public boolean add(E o)
    {
        priorityQueue.add(o);
        addHelper(size() - 1);
        return true;
    }

    @Override
    public boolean offer(E o)
    {
        return add(o);
    }

    @Override
    public E poll()
    {
        return remove();
    }

    @Override
    public E remove()
    {
        if (peek() == null)
            return null;
        return priorityQueue.remove(0);
    }

    @Override
    public int size()
    {
        return priorityQueue.size();
    }

    @Override
    public boolean empty()
    {
        return priorityQueue.isEmpty();
    }

    @Override
    public void clear()
    {
        priorityQueue.clear();
    }

    @Override
    public E get(int x)
    {
        return priorityQueue.get(x);
    }

    @Override
    public E set(int x, E item)
    {
        E value = get(x);
        priorityQueue.set(x, item);
        return value;
    }

    @Override
    public E peek()
    {
        if (empty())
            return null;
        return get(0);
    }

    public String toString()
    {
        String s = "[";
        for (int i = 0; i < size(); i++)
        {
            s += priorityQueue.get(i);
            if (i != size() - 1)
                s += ", ";
        }
        return s + "]";
    }
}
