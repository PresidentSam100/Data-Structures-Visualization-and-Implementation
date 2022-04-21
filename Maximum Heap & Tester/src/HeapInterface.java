public interface HeapInterface <E extends Comparable>
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    public boolean add(E item);

    public boolean insert(E item);

    public E remove();

    public boolean empty();

    public int size();

    public E get(int x);

    public void clear();
}