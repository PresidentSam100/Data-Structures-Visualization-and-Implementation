import java.util.Scanner;

public class Tester
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        boolean running = true;
        System.out.println("Stack & Tester");
        while (running)
        {
            System.out.println("\n1. Print - Prints All The Data In The Stack.");
            System.out.println("2. Size - Prints The Number Of Items In The Stack.");
            System.out.println("3. Empty - Prints True When The Stack Is Empty and False When It Is Not.");
            System.out.println("4. Get - Prints The Item In Spot X. (X Will Come From The User)");
            System.out.println("5. Push - Adds An Item To The Top Of The Stack.");
            System.out.println("6. Peek - Prints The Value Of The Top Item In The Stack.");
            System.out.println("7. Pop - Removes The Top Item From The Stack And Prints Its Value.");
            System.out.println("8. Exit - Closes The Program.");
            System.out.print("Enter An Option (1-8): ");
            int number = scanner.nextInt();
            if (number == 1)
            {
                System.out.println("Data In Stack Is: " + stack.toString());
            }
            else if (number == 2)
            {
                System.out.println("Size Of Stack Is " + stack.size() + " Element(s).");
            }
            else if (number == 3)
            {
                if (stack.empty() == true)
                {
                    System.out.println("Stack Is Empty.");
                }
                else
                {
                    System.out.println("Stack Is Not Empty.");
                }
            }
            else if (number == 4)
            {
                if (stack.peek() != null)
                {
                    int index;
                    do
                    {
                        System.out.println("Enter An Index To Get.");
                        System.out.print("Index: ");
                        index = scanner.nextInt();
                        if (stack.get(index) == null)
                        {
                            System.out.println("Invalid Index.");
                        }
                    }
                    while (stack.get(index) == null);
                    System.out.println("Integer At Index " + index + " Is " + stack.get(index) + ".");
                }
                else
                {
                    System.out.println("No Elements To Get In Stack.");
                }
            }
            else if (number == 5)
            {
                System.out.println("Enter An Element To Push.");
                System.out.print("Element: ");
                Integer integer = scanner.nextInt();
                stack.push(integer);
                System.out.println(integer + " Was Successfully Pushed At Top Of Stack.");
            }
            else if (number == 6)
            {
                if (stack.peek() != null)
                {
                    System.out.println("Element At Peek Is " + stack.peek() + ".");
                }
                else
                {
                    System.out.println("No Elements To Peek For Stack.");
                }
            }
            else if (number == 7)
            {
                if (stack.peek() != null)
                {
                    System.out.println(stack.pop() + " Was Popped From Stack.");
                }
                else
                {
                    System.out.println("No Elements To Pop From Stack.");
                }
            }
            else if (number == 8)
            {
                System.out.println("Goodbye.");
                running = false;
            }
            else
            {
                System.out.println("Invalid Option.");
            }
        }
    }
}
