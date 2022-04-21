public class BinaryTree <E extends Comparable> implements BinaryTreeInterface <E>
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    private TreeNode <E> root;

    public BinaryTree()
    {
        root = null;
    }

    @Override
    public String preOrder()
    {
        return preOrder(root);
    }

    public String preOrder(TreeNode <E> root)
    {
        String s = "";
        if (root != null)
        {
            s += root.getData().toString() + " ";
            s += preOrder(root.getLeft());
            s += preOrder(root.getRight());
        }
        return s;
    }

    @Override
    public String inOrder()
    {
        return inOrder(root);
    }

    public String inOrder(TreeNode <E> root)
    {
        String s = "";
        if (root != null)
        {
            s += inOrder(root.getLeft());
            s += root.getData().toString() + " ";
            s += inOrder(root.getRight());
        }
        return s;
    }

    @Override
    public String postOrder()
    {
        return postOrder(root);
    }

    public String postOrder(TreeNode <E> root)
    {
        String s = "";
        if (root != null)
        {
            s += postOrder(root.getLeft());
            s += postOrder(root.getRight());
            s += root.getData().toString() + " ";
        }
        return s;
    }

    @Override
    public E minValue()
    {
        if (empty())
        {
            return null;
        }
        TreeNode <E> minimum = root;
        while (minimum.getLeft() != null)
        {
            minimum = minimum.getLeft();
        }
        return minimum.getData();
    }

    public E minValue(TreeNode <E> root)
    {
        while (root.getLeft() != null)
        {
            root = root.getLeft();
        }
        return root.getData();
    }

    @Override
    public E maxValue()
    {
        if (empty())
        {
            return null;
        }
        TreeNode <E> maximum = root;
        while (maximum.getRight() != null)
        {
            maximum = maximum.getRight();
        }
        return maximum.getData();
    }

    @Override
    public int maxDepth()
    {
        return maxDepth(root) - 1;
    }

    public int maxDepth(TreeNode <E> root)
    {
        if (root == null)
        {
            return 0;
        }
        int leftDepth = maxDepth(root.getLeft());
        int rightDepth = maxDepth(root.getRight());
        if (leftDepth > rightDepth)
        {
            return leftDepth + 1;
        }
        else if (leftDepth < rightDepth)
        {
            return rightDepth + 1;
        }
        else
        {
            return (leftDepth + rightDepth + 2) / 2;
        }
    }

    @Override
    public void clear()
    {
        root = null;
    }

    @Override
    public int size()
    {
        return size(root);
    }

    public int size(TreeNode <E> root)
    {
        if (root == null)
        {
            return 0;
        }
        else
        {
            return size(root.getLeft()) + size(root.getRight()) + 1;
        }
    }

    @Override
    public boolean empty()
    {
        return root == null;
    }

    @Override
    public boolean contains(E data)
    {
        TreeNode <E> node = root;
        if (root == null)
        {
            return false;
        }
        while (node != null)
        {
            if (node.getData().compareTo(data) < 0)
            {
                node = node.getRight();
            }
            else if (node.getData().compareTo(data) > 0)
            {
                node = node.getLeft();
            }
            else if (node.getData().compareTo(data) == 0)
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean insert(E data)
    {
        return add(data);
    }

    @Override
    public boolean add(E data)
    {
        TreeNode <E> node = new TreeNode <E> (data);
        if (root == null)
        {
            root = node;
            return true;
        }
        TreeNode <E> parent = null;
        TreeNode <E> current = root;
        while (current != null)
        {
            parent = current;
            if (current.getData().compareTo(data) < 0)
            {
                current = current.getRight();
            }
            else if (current.getData().compareTo(data) > 0)
            {
                current = current.getLeft();
            }
            else if (current.getData().compareTo(data) == 0)
            {
                return false;
            }
        }
        if (parent.getData().compareTo(data) < 0)
        {
            parent.setRight(node);
            return true;
        }
        else if (parent.getData().compareTo(data) > 0)
        {
            parent.setLeft(node);
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean remove(E data)
    {
        return remove(root, data);
    }

    public boolean remove(TreeNode <E> root, E data)
    {
        // To Be Worked On
        TreeNode <E> parent = null;
        TreeNode <E> current = root;
        while (current != null && current.getData().compareTo(data) != 0)
        {
            parent = current;
            if ((Integer) data < (Integer) current.getData())
            {
                current = current.getLeft();
            }
            else if ((Integer) data > (Integer) current.getData())
            {
                current = current.getRight();
            }
        }
        if (current == null)
        {
            return false;
        }
        if (current.getLeft() == null && current.getRight() == null && current != root)
        {
            if (parent.getLeft() == current)
            {
                parent.setLeft(null);
            }
            else if (parent.getRight() == current)
            {
                parent.setRight(null);
            }
        }
        else if (current.getLeft() == null && current.getRight() != null)
        {
            current.setData(current.getRight().getData());
            current.setRight(null);
        }
        else if (current.getLeft() != null && current.getRight() == null)
        {
            current.setData(current.getLeft().getData());
            current.setLeft(null);
        }
        else if (current.getLeft() != null && current.getRight() != null)
        {
            E value = minValue(current.getRight());
            remove(root, value);
            current.setData(value);
        }
        return true;
    }
}