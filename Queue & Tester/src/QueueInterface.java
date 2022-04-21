public interface QueueInterface<E>
{
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
