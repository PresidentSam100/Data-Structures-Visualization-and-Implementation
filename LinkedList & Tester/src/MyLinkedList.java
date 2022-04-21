public class MyLinkedList <E> implements LinkedListInterface <E>
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    private LLNode <E> first;
    private LLNode <E> last;

    public MyLinkedList()
    {
        first = null;
        last = null;
    }
    public MyLinkedList(E data)
    {
        LLNode <E> node = new LLNode <E> (data);
        first = node;
        last = node;
    }

    @Override
    public E getFirst()
    {
        return getFirstNode().getData();
    }

    @Override
    public LLNode<E> getFirstNode()
    {
        return first;
    }

    @Override
    public E getLast()
    {
        return getLastNode().getData();
    }

    @Override
    public LLNode<E> getLastNode()
    {
        return last;
    }

    @Override
    public E removeFirst()
    {
        E value = first.getData();
        if (size() == 1)
        {
            first = null;
            last = null;
        }
        else
        {
            first = first.getNext();
        }
        return value;
    }

    @Override
    public E removeLast()
    {
        E value = last.getData();
        if (size() == 1)
        {
            first = null;
            last = null;
        }
        else
        {
            int i = 0;
            LLNode <E> node = first;
            while (i < size() - 2)
            {
                node = node.getNext();
                i++;
            }
            node.setNext(null);
            last = node;
        }
        return value;
    }

    @Override
    public void addFirst(E data)
    {
        LLNode <E> node = new LLNode <E> (data);
        node.setData(data);
        node.setNext(first);
        first = node;
        if (last == null)
        {
            last = node;
        }
    }

    @Override
    public void addLast(E data)
    {
        LLNode <E> node = new LLNode <E> (data);
        node.setData(data);
        node.setNext(null);
        if (!empty())
        {
            last.setNext(node);
        }
        last = node;
        if (first == null)
        {
            first = node;
        }
    }

    @Override
    public void clear()
    {
        first = null;
        last = null;
    }

    @Override
    public int size()
    {
        int i = 1;
        LLNode <E> node = first;
        if (empty())
        {
            return 0;
        }
        while (!node.equals(last))
        {
            node = node.getNext();
            i++;
        }
        return i;
    }

    @Override
    public boolean empty()
    {
        return first == null && last == null;
    }

    @Override
    public E get(int x)
    {
        int i = 0;
        LLNode <E> node = first;
        while (i < x)
        {
            node = node.getNext();
            i++;
        }
        return node.getData();
    }

    @Override
    public E remove(int x)
    {
        if (x == 0)
        {
            return removeFirst();
        }
        else if (x == size() - 1)
        {
            return removeLast();
        }
        else
        {
            int i = 0;
            LLNode <E> node = first;
            while (i < x - 1)
            {
                node = node.getNext();
                i++;
            }
            E value = node.getNext().getData();
            node.setNext(node.getNext().getNext());
            return value;
        }
    }

    @Override
    public void add(int x, E data)
    {
        if (x == 0)
        {
            addFirst(data);
        }
        else if (x == size())
        {
            addLast(data);
        }
        else
        {
            LLNode <E> node = new LLNode <E> (data);
            node.setData(data);
            int i = 0;
            LLNode <E> current = first;
            while (i < x - 1)
            {
                current = current.getNext();
                i++;
            }
            node.setNext(current.getNext());
            current.setNext(node);
        }
    }

    @Override
    public E set(int x, E data)
    {
        int i = 0;
        LLNode <E> node = first;
        while (i < x)
        {
            node = node.getNext();
            i++;
        }
        E value = node.getData();
        node.setData(data);
        return value;
    }

    public String toString()
    {
        String s = "[";
        int i = 0;
        LLNode <E> node = first;
        while (i < size())
        {
            s += node.getData().toString();
            if (i != size() - 1)
            {
                s += ", ";
            }
            node = node.getNext();
            i++;
        }
        s += "]";
        return s;
    }
}