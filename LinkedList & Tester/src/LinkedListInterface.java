public interface LinkedListInterface <E>
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    public E getFirst();

    public LLNode <E> getFirstNode();

    public E getLast();

    public LLNode <E> getLastNode();

    public E removeFirst();

    public E removeLast();

    public void addFirst(E data);

    public void addLast(E data);

    public void clear();

    public int size();

    public boolean empty();

    public E get(int x);

    public E remove(int x);

    public void add(int x, E data);

    public E set(int x, E data);
}