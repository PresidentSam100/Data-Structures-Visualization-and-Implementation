import java.util.Scanner;

public class MainFile
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Maximum Heap & Tester");
        int choice;
        Heap <Integer> heap = new Heap <Integer> ();
        do
        {
            System.out.print("\n-Menu-\n");
            System.out.println("1. Print - Prints All The Items In The Heap.");
            System.out.println("2. Size - Prints The Number Of Items In The Heap.");
            System.out.println("3. Empty - Prints True When The Heap Is Empty And False When It Is Not.");
            System.out.println("4. Add - Adds An Item Into The Heap.");
            System.out.println("5. Remove - Removes An Item From The Heap And Prints Its Value.");
            System.out.println("6. Clear - Empties The Heap.");
            System.out.println("7. Exit - Closes The Program.");
            System.out.print("Enter selection: ");
            choice = scanner.nextInt();
            System.out.println();
            if (choice == 1)
            {
                System.out.println("Data In Maximum Heap Is " + heap.toString());
            }
            else if (choice == 2)
            {
                System.out.println("Size Of Maximum Heap Is " + heap.size() + " Integers.");
            }
            else if (choice == 3)
            {
                if (heap.empty())
                {
                    System.out.println("Maximum Heap Is Empty.");
                }
                else
                {
                    System.out.println("Maximum Heap Is Not Empty.");
                }
            }
            else if (choice == 4)
            {
                System.out.println("Enter An Integer To Add Into Maximum Heap.");
                System.out.print("Integer: ");
                Integer integer = scanner.nextInt();
                heap.add(integer);
                System.out.println("Integer " + integer + " Was Successfully Added Into Maximum Heap.");
            }
            else if (choice == 5)
            {
                Integer integer = heap.remove();
                if (integer == null)
                {
                    System.out.println("No Integers To Remove From Maximum Heap.");
                }
                else
                {
                    System.out.println("Integer " + integer + " Was Successfully Removed From Maximum Heap.");
                }
            }
            else if (choice == 6)
            {
                heap.clear();
                System.out.println("Maximum Heap Successfully Cleared.");
            }
            else if (choice != 7)
            {
                System.out.println("Invalid Selection.");
            }
        }
        while (choice != 7);
        System.out.print("\nGood Bye!!");
        System.out.println("\n\nEnter \"exit\" to quit");
        scanner.next();
    }
}
