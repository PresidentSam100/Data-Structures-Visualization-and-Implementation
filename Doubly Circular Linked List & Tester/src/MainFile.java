import java.util.*;

public class MainFile
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int choice;
        DoublyCircularLinkedList <String> doublyCircularLinkedList = new DoublyCircularLinkedList <String> ();
        do
        {
            System.out.print("\n-Menu-\n");
            System.out.println("1. Print X Forward");
            System.out.println("2. Print X Backward");
            System.out.println("3. Print First");
            System.out.println("4. Print Last");
            System.out.println("5. Get Location");
            System.out.println("6. Remove First");
            System.out.println("7. Remove Last");
            System.out.println("8. Remove X");
            System.out.println("9. Add First");
            System.out.println("10. Add Last");
            System.out.println("11. Insert");
            System.out.println("12. Set X");
            System.out.println("13. Size");
            System.out.println("14. Is Empty");
            System.out.println("15. Clear");
            System.out.println("0. Exit");
            System.out.print("Enter selection: ");
            choice= keyboard.nextInt();
            System.out.println();
            if (choice == 1)
            {
                if (doublyCircularLinkedList.empty())
                {
                    System.out.println("No Nodes To Print From Doubly Circular Linked List.");
                }
                else
                {
                    System.out.println("Data In Doubly Circular Linked List From First To Last Is " + doublyCircularLinkedList.toString());
                }
            }
            else if (choice == 2)
            {
                String s = "[";
                int i = doublyCircularLinkedList.size() - 1;
                DLLNode <String> node = doublyCircularLinkedList.getLastNode();
                while (i >= 0)
                {
                    s += node.getData();
                    if (i != 0)
                    {
                        s += ", ";
                    }
                    node = node.getPrevious();
                    i--;
                }
                s += "]";
                if (doublyCircularLinkedList.empty())
                {
                    System.out.println("No Nodes To Print From Doubly Circular Linked List.");
                }
                else
                {
                    System.out.println("Data In Doubly Circular Linked List From Last To First Is " + s);
                }
            }
            else if (choice == 3)
            {
                if (doublyCircularLinkedList.getFirstNode() == null)
                {
                    System.out.println("No Nodes To Print From Doubly Circular Linked List.");
                }
                else
                {
                    System.out.println("First Node Of Doubly Circular Linked List Is \"" + doublyCircularLinkedList.getFirst() + "\".");
                }
            }
            else if (choice == 4)
            {
                if (doublyCircularLinkedList.getLastNode() == null)
                {
                    System.out.println("No Nodes To Print From Doubly Circular Linked List.");
                }
                else
                {
                    System.out.println("Last Node Of Doubly Circular Linked List Is \"" + doublyCircularLinkedList.getLast() + "\".");
                }
            }
            else if (choice == 5)
            {
                if (doublyCircularLinkedList.empty())
                {
                    System.out.println("No Nodes To Get From Doubly Circular Linked List.");
                    continue;
                }
                int index;
                do
                {
                    System.out.println("Enter An Index To Get.");
                    System.out.print("Index: ");
                    index = keyboard.nextInt();
                    if (index < 0 || index > doublyCircularLinkedList.size() - 1)
                    {
                        System.out.println("Invalid Index.\n");
                    }
                }
                while (index < 0 || index > doublyCircularLinkedList.size() - 1);
                System.out.println("Node At Index " + index + " Is \"" + doublyCircularLinkedList.get(index) + "\".");
            }
            else if (choice == 6)
            {
                if (doublyCircularLinkedList.empty())
                {
                    System.out.println("No Nodes To Remove From Doubly Circular Linked List.");
                }
                else
                {
                    System.out.println("First Node Of Doubly Circular Linked List \"" + doublyCircularLinkedList.removeFirst() + "\" Was Successfully Removed.");
                }
            }
            else if (choice == 7)
            {
                if (doublyCircularLinkedList.empty())
                {
                    System.out.println("No Nodes To Remove From Doubly Circular Linked List.");
                }
                else
                {
                    System.out.println("Last Node Of Doubly Circular Linked List \"" + doublyCircularLinkedList.removeLast() + "\" Was Successfully Removed.");
                }
            }
            else if (choice == 8)
            {
                if (doublyCircularLinkedList.empty())
                {
                    System.out.println("No Nodes To Remove From Doubly Circular Linked List.");
                    continue;
                }
                int index;
                do
                {
                    System.out.println("Enter An Index To Remove.");
                    System.out.print("Index: ");
                    index = keyboard.nextInt();
                    if (index < 0 || index > doublyCircularLinkedList.size() - 1)
                    {
                        System.out.println("Invalid Index.\n");
                    }
                }
                while (index < 0 || index > doublyCircularLinkedList.size() - 1);
                System.out.println("\"" + doublyCircularLinkedList.remove(index) + "\" At Index " + index + " Was Successfully Removed.");
            }
            else if (choice == 9)
            {
                System.out.println("Enter A String To Add At First.");
                System.out.print("String: ");
                String string = keyboard.next();
                doublyCircularLinkedList.addFirst(string);
                System.out.println(string + " Was Successfully Added At First.");
            }
            else if (choice == 10)
            {
                System.out.println("Enter A String To Add At Last.");
                System.out.print("String: ");
                String string = keyboard.next();
                doublyCircularLinkedList.addLast(string);
                System.out.println(string + " Was Successfully Added At Last.");
            }
            else if (choice == 11)
            {
                int index;
                do
                {
                    System.out.println("Enter An Index To Add.");
                    System.out.print("Index: ");
                    index = keyboard.nextInt();
                    if (index < 0 || index > doublyCircularLinkedList.size())
                    {
                        System.out.println("Invalid Index.\n");
                    }
                }
                while (index < 0 || index > doublyCircularLinkedList.size());
                System.out.println("Enter A String To Add At Index " + index + ".");
                System.out.print("String: ");
                String string = keyboard.next();
                doublyCircularLinkedList.add(index, string);
                System.out.println("\"" + string + "\" Was Successfully Added At Index " + index + ".");
            }
            else if (choice == 12)
            {
                if (doublyCircularLinkedList.empty())
                {
                    System.out.println("No Nodes To Set In Doubly Circular Linked List.");
                    continue;
                }
                int index;
                do
                {
                    System.out.println("Enter An Index To Set.");
                    System.out.print("Index: ");
                    index = keyboard.nextInt();
                    if (index < 0 || index > doublyCircularLinkedList.size() - 1)
                    {
                        System.out.println("Invalid Index.\n");
                    }
                }
                while (index < 0 || index > doublyCircularLinkedList.size() - 1);
                System.out.println("Enter An New String For Index " + index + ".");
                System.out.print("String: ");
                String string = keyboard.next();
                System.out.println("\"" + doublyCircularLinkedList.set(index, string) + "\" At Index " + index + " Was Successfully Replaced With String \"" + string + "\".");
            }
            else if (choice == 13)
            {
                System.out.println("Size Of Doubly Circular Linked List Is " + doublyCircularLinkedList.size() + " Nodes.");
            }
            else if (choice == 14)
            {
                if (doublyCircularLinkedList.empty())
                {
                    System.out.println("Doubly Circular Linked List Is Empty.");
                }
                else
                {
                    System.out.println("Doubly Circular Linked List Is Not Empty.");
                }
            }
            else if (choice == 15)
            {
                if (doublyCircularLinkedList.empty())
                {
                    System.out.println("No Nodes To Clear From Doubly Circular Linked List.");
                }
                else
                {
                    System.out.println("Doubly Circular Linked List Successfully Cleared.");
                }
                doublyCircularLinkedList.clear();
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
        System.out.println("\n\nEnter \"exit\" to quit.");
        keyboard.next();
    }
}