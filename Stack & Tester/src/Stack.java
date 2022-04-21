import java.util.ArrayList;

public class Stack<E> implements StackInterface<E>
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    private ArrayList <E> stack;

    public Stack()
    {
        stack = new ArrayList <> ();
    }

    @Override
    public String toString()
    {
        return stack.toString();
    }

    @Override
    public int size()
    {
        return stack.size();
    }

    @Override
    public boolean empty()
    {
        if (stack.isEmpty() == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public E get(int index)
    {
        if (stack.isEmpty() || index < 0 || index >= stack.size())
        {
            return null;
        }
        else
        {
            return stack.get(index);
        }
    }

    @Override
    public E push(E object)
    {
        stack.add(0, object);
        return object;
    }

    @Override
    public E peek()
    {
        if (stack.isEmpty() == false)
        {
            return stack.get(0);
        }
        else
        {
            return null;
        }
    }

    @Override
    public E pop()
    {
        if (stack.isEmpty() == false)
        {
            return stack.remove(0);
        }
        else
        {
            return null;
        }
    }
}