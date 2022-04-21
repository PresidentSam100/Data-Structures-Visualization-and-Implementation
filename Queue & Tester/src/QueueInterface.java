public interface QueueInterface<E>
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    public boolean offer(E o);

    public boolean add(E o);

    public E peek();

    public E element();

    public E poll();

    public E remove();

    public int size();

    public E get(int x);

    public boolean empty();
}