public interface StackInterface<E>
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    public String toString();

    public int size();

    public boolean empty();

    public E get(int x);

    public E push(E o);

    public E peek();

    public E pop();
}