public interface BinaryTreeInterface <E extends Comparable>
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    public String preOrder();

    public String inOrder();

    public String postOrder();

    public E minValue();

    public E maxValue();

    public int maxDepth();

    public void clear();

    public int size();

    public boolean empty();

    public boolean contains(E data);

    public boolean insert(E data);

    public boolean add(E data);

    public boolean remove(E data);
}