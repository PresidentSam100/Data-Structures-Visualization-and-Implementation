import java.util.*;

public class MainFile
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int choice;
        BinaryTree <Integer> binaryTree = new BinaryTree <Integer> ();
        binaryTree.add(5);
        binaryTree.add(3);
        binaryTree.add(7);
        binaryTree.add(4);
        binaryTree.add(2);
        binaryTree.add(6);
        binaryTree.add(8);
        do
        {
            System.out.print("\n-Menu-\n");
            System.out.println("1. Print");
            System.out.println("2. Size");
            System.out.println("3. Clear");
            System.out.println("4. Empty");
            System.out.println("5. Insert");
            System.out.println("6. Remove");
            System.out.println("7. Contains");
            System.out.println("8. Min Value");
            System.out.println("9. Max Value");
            System.out.println("10. Max Depth");
            System.out.println("0. Exit");
            System.out.print("Enter selection: ");
            choice = keyboard.nextInt();
            System.out.println();
            if (choice == 1)
            {
                System.out.println("Enter An Order To Print Binary Search Tree.");
                int order;
                do
                {
                    System.out.println("1. Pre-Order Traversal.");
                    System.out.println("2. In-Order Traversal.");
                    System.out.println("3. Post-Order Traversal.");
                    System.out.print("Traversal: ");
                    order = keyboard.nextInt();
                    System.out.println();
                    if (order < 1 || order > 3)
                    {
                        System.out.println("Invalid Order Selection.\n");
                    }
                }
                while (order < 1 || order > 3);
                if (binaryTree.empty())
                {
                    System.out.println("No Nodes To Print From Binary Search Tree.");
                }
                else if (order == 1)
                {
                    System.out.println("Pre-Order Traversal Of Binary Search Tree Is: " + binaryTree.preOrder());
                }
                else if (order == 2)
                {
                    System.out.println("In-Order Traversal Of Binary Search Tree Is: " + binaryTree.inOrder());
                }
                else if (order == 3)
                {
                    System.out.println("Post-Order Traversal Of Binary Search Tree Is: " + binaryTree.postOrder());
                }
            }
            else if (choice == 2)
            {
                System.out.println("Size Of Binary Search Tree Is " + binaryTree.size() + " Nodes.");
            }
            else if (choice == 3)
            {
                if (binaryTree.empty())
                {
                    System.out.println("No Integers To Clear From Binary Search Tree.");
                }
                else
                {
                    System.out.println("Binary Search Tree Successfully Cleared.");
                }
                binaryTree.clear();
            }
            else if (choice == 4)
            {
                if (binaryTree.empty())
                {
                    System.out.println("Binary Search Tree Is Empty.");
                }
                else
                {
                    System.out.println("Binary Search Tree Is Not Empty.");
                }
            }
            else if (choice == 5)
            {
                System.out.println("Enter An Integer To Insert In Binary Search Tree.");
                System.out.print("Integer: ");
                Integer integer = keyboard.nextInt();
                if (!binaryTree.insert(integer))
                {
                    System.out.println("Integer " + integer + " Already Exists In Binary Search Tree.");
                }
                else
                {
                    System.out.println("Integer " + integer + " Successfully Inserted In Binary Search Tree.");
                }
            }
            else if (choice == 6)
            {
                // To Be Worked On
                System.out.println("Enter An Integer To Remove From Binary Search Tree.");
                System.out.print("Integer: ");
                Integer integer = keyboard.nextInt();
                if (binaryTree.remove(integer))
                {
                    System.out.println(integer + " Was Successfully Removed From Binary Search Tree.");
                }
                else
                {
                    System.out.println("Unable To Remove Integer " + integer + " From Binary Search Tree.");
                }
            }
            else if (choice == 7)
            {
                System.out.println("Enter An Integer To Search For In Binary Search Tree.");
                System.out.print("Integer: ");
                Integer integer = keyboard.nextInt();
                if (binaryTree.contains(integer))
                {
                    System.out.println("Binary Search Tree Contains " + integer + ".");
                }
                else
                {
                    System.out.println("Binary Search Tree Does Not Contain " + integer + ".");
                }
            }
            else if (choice == 8)
            {
                if (binaryTree.minValue() == null)
                {
                    System.out.println("No Min Value In Binary Search Tree.");
                }
                else
                {
                    System.out.println("Min Value In Binary Search Tree Is " + binaryTree.minValue() + ".");
                }
            }
            else if (choice == 9)
            {
                if (binaryTree.maxValue() == null)
                {
                    System.out.println("No Max Value In Binary Search Tree.");
                }
                else
                {
                    System.out.println("Max Value In Binary Search Tree Is " + binaryTree.maxValue() + ".");
                }
            }
            else if (choice == 10)
            {
                System.out.println("Max Depth Of Binary Search Tree Is " + binaryTree.maxDepth() + ".");
            }
            else if (choice == 0)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Selection.");
            }
        }
        while (true);
        System.out.print("\nGood Bye!!");
        System.out.println("\n\nEnter \"exit\" to quit");
        keyboard.next();
    }
}
