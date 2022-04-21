public class DLLNode <E>
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    private E data;
    private DLLNode <E> previous;
    private DLLNode <E> next;

    public DLLNode(E data)
    {
        this.data = data;
        previous = null;
        next = null;
    }

    public E getData()
    {
        return data;
    }

    public DLLNode <E> getPrevious()
    {
        return previous;
    }

    public DLLNode <E> getNext()
    {
        return next;
    }

    public void setData(E data)
    {
        this.data = data;
    }

    public void setPrevious(DLLNode <E> previous)
    {
        this.previous = previous;
    }

    public void setNext(DLLNode <E> next)
    {
        this.next = next;
    }

    public String toString()
    {
        return data.toString();
    }
}