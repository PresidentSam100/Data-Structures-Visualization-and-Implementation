import java.util.*;

public class MainFile
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        int choice;
        MyLinkedList <String> linkedList = new MyLinkedList <String> ();
        do
        {
            System.out.print("\n-Menu-\n");
            System.out.println("1. Size");
            System.out.println("2. Print");
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
            System.out.println("13. Is Empty");
            System.out.println("14. Clear");
            System.out.println("0. Exit");
            System.out.print("Enter selection: ");
            choice = keyboard.nextInt();
            System.out.println();
            if (choice == 1)
            {
                System.out.println("Linked List Size Is " + linkedList.size() + " Nodes.");
            }
            else if (choice == 2)
            {
                System.out.println("Data In Linked List Is " + linkedList.toString());
            }
            else if (choice == 3)
            {
                if (linkedList.empty())
                {
                    System.out.println("No Nodes To Print From Linked List.");
                }
                else
                {
                    System.out.println("First Node Of Linked List Is \"" + linkedList.getFirst() + "\".");
                }
            }
            else if (choice == 4)
            {
                if (linkedList.empty())
                {
                    System.out.println("No Nodes To Print From Linked List.");
                }
                else
                {
                    System.out.println("Last Node Of Linked List Is \"" + linkedList.getLast() + "\".");
                }
            }
            else if (choice == 5)
            {
                if (linkedList.empty())
                {
                    System.out.println("No Nodes To Get From Linked List.");
                    continue;
                }
                int index;
                do
                {
                    System.out.println("Enter An Index To Get.");
                    System.out.print("Index: ");
                    index = keyboard.nextInt();
                    if (index < 0 || index > linkedList.size() - 1)
                    {
                        System.out.println("Invalid Index.\n");
                    }
                }
                while (index < 0 || index > linkedList.size() - 1);
                System.out.println("Node At Index " + index + " Is \"" + linkedList.get(index) + "\".");
            }
            else if (choice == 6)
            {
                if (linkedList.empty())
                {
                    System.out.println("No Nodes To Remove From Linked List.");
                }
                else
                {
                    System.out.println("First Node Of Linked List \"" + linkedList.removeFirst() + "\" Was Successfully Removed.");
                }
            }
            else if (choice == 7)
            {
                if (linkedList.empty())
                {
                    System.out.println("No Nodes To Remove From Linked List.");
                }
                else
                {
                    System.out.println("Last Node Of Linked List \"" + linkedList.removeLast() + "\" Was Successfully Removed.");
                }
            }
            else if (choice == 8)
            {
                if (linkedList.empty())
                {
                    System.out.println("No Nodes To Remove From Linked List.");
                    continue;
                }
                int index;
                do
                {
                    System.out.println("Enter An Index To Remove.");
                    System.out.print("Index: ");
                    index = keyboard.nextInt();
                    if (index < 0 || index > linkedList.size() - 1)
                    {
                        System.out.println("Invalid Index.\n");
                    }
                }
                while (index < 0 || index > linkedList.size() - 1);
                System.out.println("\"" + linkedList.remove(index) + "\" At Index " + index + " Was Successfully Removed.");
            }
            else if (choice == 9)
            {
                System.out.println("Enter A String To Add At First.");
                System.out.print("String: ");
                String string = keyboard.next();
                linkedList.addFirst(string);
                System.out.println("\"" + string + "\" Was Successfully Added At First.");
            }
            else if (choice == 10)
            {
                System.out.println("Enter A String To Add At Last.");
                System.out.print("String: ");
                String string = keyboard.next();
                linkedList.addLast(string);
                System.out.println("\"" + string + "\" Was Successfully Added At Last.");
            }
            else if (choice == 11)
            {
                int index;
                do
                {
                    System.out.println("Enter An Index To Add.");
                    System.out.print("Index: ");
                    index = keyboard.nextInt();
                    if (index < 0 || index > linkedList.size())
                    {
                        System.out.println("Invalid Index.\n");
                    }
                }
                while (index < 0 || index > linkedList.size());
                System.out.println("Enter A String To Add At Index " + index + ".");
                System.out.print("String: ");
                String string = keyboard.next();
                linkedList.add(index, string);
                System.out.println("\"" + string + "\" Was Successfully Added At Index " + index + ".");
            }
            else if (choice == 12)
            {
                if (linkedList.empty())
                {
                    System.out.println("No Nodes To Set In Linked List.");
                    continue;
                }
                int index;
                do
                {
                    System.out.println("Enter An Index To Set.");
                    System.out.print("Index: ");
                    index = keyboard.nextInt();
                    if (index < 0 || index > linkedList.size() - 1)
                    {
                        System.out.println("Invalid Index.\n");
                    }
                }
                while (index < 0 || index > linkedList.size() - 1);
                System.out.println("Enter An New String For Index " + index + ".");
                System.out.print("String: ");
                String string = keyboard.next();
                System.out.println("\"" + linkedList.set(index, string) + "\" At Index " + index + " Was Successfully Replaced With " + string + ".");
            }
            else if (choice == 13)
            {
                if (linkedList.empty())
                {
                    System.out.println("Linked List Is Empty.");
                }
                else
                {
                    System.out.println("Linked List Is Not Empty.");
                }
            }
            else if (choice == 14)
            {
                if (linkedList.empty())
                {
                    System.out.println("No Nodes To Clear From Linked List.");
                }
                else
                {
                    System.out.println("Linked List Was Successfully Cleared.");
                }
                linkedList.clear();
            }
            else if (choice != 0)
            {
                System.out.println("Invalid Selection");
            }
        }
        while (choice != 0);
        System.out.print("\nGood Bye!!");
        System.out.println("\n\nEnter \"exit\" to quit");
        keyboard.next();
    }
}