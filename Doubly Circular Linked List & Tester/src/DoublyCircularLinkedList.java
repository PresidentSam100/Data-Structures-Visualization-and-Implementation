public class DoublyCircularLinkedList <E> implements DoublyCircularLinkedListInt <E>
{
    private DLLNode <E> first;
    private DLLNode <E> last;

    public DoublyCircularLinkedList()
    {
        first = null;
        last = null;
    }

    public DoublyCircularLinkedList(E data)
    {
        DLLNode <E> node = new DLLNode <E> (data);
        first = node;
        last = node;
        first.setPrevious(last);
        first.setNext(last);
        last.setPrevious(first);
        last.setNext(first);
    }

    @Override
    public DLLNode <E> getFirstNode()
    {
        return first;
    }

    @Override
    public DLLNode <E> getLastNode()
    {
        return last;
    }

    @Override
    public E getFirst()
    {
        return getFirstNode().getData();
    }

    @Override
    public E getLast()
    {
        return getLastNode().getData();
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
            first.setPrevious(last);
            last.setNext(first);
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
            last = last.getPrevious();
            last.setNext(first);
            first.setPrevious(last);
        }
        return value;
    }

    @Override
    public void addFirst(E data)
    {
        DLLNode <E> node = new DLLNode <E> (data);
        if (last == null)
        {
            first = node;
            last = node;
            first.setPrevious(last);
            first.setNext(last);
            last.setPrevious(first);
            last.setNext(first);
        }
        else
        {
            node.setNext(first);
            node.setPrevious(last);
            first.setPrevious(node);
            last.setNext(node);
            first = node;
        }
    }

    @Override
    public void addLast(E data)
    {
        DLLNode <E> node = new DLLNode <E> (data);
        if (first == null)
        {
            first = node;
            last = node;
            first.setPrevious(last);
            first.setNext(last);
            last.setPrevious(first);
            last.setNext(first);
        }
        else
        {
            node.setNext(first);
            node.setPrevious(last);
            last.setNext(node);
            first.setPrevious(node);
            last = node;
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
        DLLNode <E> node = first;
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
    public E get(int x)
    {
        int i = 0;
        DLLNode <E> node = first;
        while (i < x)
        {
            node = node.getNext();
            i++;
        }
        return node.getData();
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
            DLLNode <E> node = new DLLNode <E> (data);
            int i = 0;
            DLLNode <E> current = first;
            while (i < x)
            {
                current = current.getNext();
                i++;
            }
            node.setPrevious(current.getPrevious());
            node.setNext(current);
            current.getPrevious().setNext(node);
            current.setPrevious(node);
        }
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
            DLLNode <E> node = first;
            while (i < x)
            {
                node = node.getNext();
                i++;
            }
            E value = node.getData();
            node.getPrevious().setNext(node.getNext());
            node.getNext().setPrevious(node.getPrevious());
            return value;
        }
    }

    @Override
    public E set(int x, E data)
    {
        int i = 0;
        DLLNode <E> node = first;
        while (i < x)
        {
            node = node.getNext();
            i++;
        }
        E value = node.getData();
        node.setData(data);
        return value;
    }

    @Override
    public boolean empty()
    {
        return first == null && last == null;
    }

    public String toString()
    {
        String s = "[";
        int i = 0;
        DLLNode <E> node = first;
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
