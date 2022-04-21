public interface DoublyCircularLinkedListInt<E>
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    public DLLNode<E> getFirstNode();

    public DLLNode<E> getLastNode();

    public E getFirst();

    public E getLast();

    public E removeFirst();

    public E removeLast();

    public void addFirst(E data);

    public void addLast(E data);

    public void clear();

    public int size();

    public E get(int x);

    public void add(int x, E data);

    public E remove(int x);

    public E set(int x, E data);

    public boolean empty();
}