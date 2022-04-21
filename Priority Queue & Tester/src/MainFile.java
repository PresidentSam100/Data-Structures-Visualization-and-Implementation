import java.util.Scanner;

public class MainFile
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Priority Queue & Tester");
        int choice;
        PriorityQueue <Integer> priorityQueue = new PriorityQueue <Integer> ();
        do
        {
            System.out.print("\n-Menu-\n");
            System.out.println("1. Print - Prints All The Items In The Priority Queue.");
            System.out.println("2. Size - Prints The Number Of Items In The Priority Queue.");
            System.out.println("3. Empty - Prints True When The Priority Queue Is Empty And False When It Is Not.");
            System.out.println("4. Add - Adds An Item Into The Priority Queue.");
            System.out.println("5. Remove - Removes An Item From The Priority Queue And Prints Its Value.");
            System.out.println("6. Clear - Empties The Priority Queue.");
            System.out.println("7. Set - Changes The Value At The Given Index To A New Item.");
            System.out.println("8. Exit - Closes The Program.");
            System.out.print("Enter selection: ");
            choice = scanner.nextInt();
            System.out.println();
            if (choice == 1)
            {
                System.out.println("Data In Priority Queue Is " + priorityQueue.toString());
            }
            else if (choice == 2)
            {
                System.out.println("Size Of MPriority Queue Is " + priorityQueue.size() + " Integers.");
            }
            else if (choice == 3)
            {
                if (priorityQueue.empty())
                {
                    System.out.println("Priority Queue Is Empty.");
                }
                else
                {
                    System.out.println("Priority Queue Is Not Empty.");
                }
            }
            else if (choice == 4)
            {
                System.out.println("Enter An Integer To Add Into Priority Queue.");
                System.out.print("Integer: ");
                Integer integer = scanner.nextInt();
                priorityQueue.offer(integer);
                System.out.println("Integer " + integer + " Was Successfully Added Into Priority Queue.");
            }
            else if (choice == 5)
            {
                Integer integer = priorityQueue.poll();
                if (integer == null)
                {
                    System.out.println("No Integers To Remove From Priority Queue.");
                }
                else
                {
                    System.out.println("Integer " + integer + " Was Successfully Removed From Priority Queue.");
                }
            }
            else if (choice == 6)
            {
                priorityQueue.clear();
                System.out.println("Priority Queue Successfully Cleared.");
            }
            else if (choice == 7)
            {
                int index;
                do
                {
                    System.out.println("Enter An Index To Set In Priority Queue.");
                    System.out.print("Index: ");
                    index = scanner.nextInt();
                    if (index < 0 || index > priorityQueue.size() - 1)
                    {
                        System.out.println("Invalid Index");
                    }
                }
                while (index < 0 || index > priorityQueue.size() - 1);
                System.out.println("Enter An Integer To Replace Index " + index + " In Priority Queue.");
                System.out.print("Integer: ");
                Integer integer = scanner.nextInt();
                Integer value = priorityQueue.set(index, integer);
                System.out.println("Integer " + value + " Was Successfully Replaced By " + integer + ".");
            }
            else if (choice != 8)
            {
                System.out.println("Invalid Selection.");
            }
        }
        while (choice != 8);
        System.out.print("\nGood Bye!!");
        System.out.println("\n\nEnter \"exit\" to quit");
        scanner.next();
    }
}
