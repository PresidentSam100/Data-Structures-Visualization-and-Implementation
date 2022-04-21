import java.util.*;

public class Heap <E extends Comparable> implements HeapInterface <E>
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    private ArrayList <E> heap;

    public Heap()
    {
        heap = new ArrayList <E> ();
    }

    public void heapifyAdd(int index)
    {
        int parent = (index - 1) / 2;
        if (get(index).compareTo(get(parent)) > 0)
        {
            E temp = get(index);
            heap.set(index, get(parent));
            heap.set(parent, temp);
            heapifyAdd(parent);
        }
    }

    @Override
    public boolean add(E item)
    {
        return insert(item);
    }

    @Override
    public boolean insert(E item)
    {
        heap.add(item);
        heapifyAdd(size() - 1);
        return true;
    }

    public void heapifyRemove(int index)
    {
        int largest = index;
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        if (left < size() && get(left).compareTo(get(largest)) > 0)
            largest = left;
        if (right < size() && get(right).compareTo(get(largest)) > 0)
            largest = right;
        if (largest != index)
        {
            E temp = get(index);
            heap.set(index, get(largest));
            heap.set(largest, temp);
            heapifyRemove(largest);
        }
    }

    @Override
    public E remove()
    {
        if (empty())
            return null;
        else
        {
            E value = get(0);
            heap.set(0, get(size() - 1));
            heap.remove(size() - 1);
            heapifyRemove(0);
            return value;
        }
    }

    @Override
    public boolean empty()
    {
        return heap.isEmpty();
    }

    @Override
    public int size()
    {
        return heap.size();
    }

    @Override
    public E get(int x)
    {
        return heap.get(x);
    }

    @Override
    public void clear()
    {
        heap.clear();
    }

    public String toString()
    {
        String s = "[";
        for (int i = 0; i < heap.size(); i++)
        {
            s += get(i);
            if (i != heap.size() - 1)
                s += ", ";
        }
        return s + "]";
    }
}