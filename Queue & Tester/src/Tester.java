import java.util.Scanner;

public class Tester
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();
        boolean running = true;
        System.out.println("Queue & Tester");
        while (running)
        {
            System.out.println("\n1. Print - Prints All The Data In The Queue.");
            System.out.println("2. Offer - Offers An Item To The Back Of The Queue.");
            System.out.println("3. Add - Adds An Item To The Back Of The Queue.");
            System.out.println("4. Peek - Prints The Value Of The Peek Item In The Queue.");
            System.out.println("5. Element - Prints The Value Of The Front Element In The Queue.");
            System.out.println("6. Poll - Polls The Front Item From The Queue And Prints Its Value.");
            System.out.println("7. Remove - Removes The Front Item From The Queue And Prints Its Value.");
            System.out.println("8. Size - Prints The Number Of Items In The Queue.");
            System.out.println("9. Get - Prints The Item In Spot X. (X Will Come From The User)");
            System.out.println("10. Empty - Prints True When The Queue Is Empty and False When It Is Not.");
            System.out.println("11. Exit - Closes The Program.");
            System.out.print("Enter An Option (1-11): ");
            int number = scanner.nextInt();
            if (number == 1)
            {
                System.out.println("Data In Queue Is: " + queue.toString());
            }
            else if (number == 2)
            {
                System.out.println("Enter An Element To Offer.");
                System.out.print("Element: ");
                Integer integer = scanner.nextInt();
                queue.offer(integer);
                System.out.println(integer + " Was Successfully Offered At Back Of Queue.");
            }
            else if (number == 3)
            {
                System.out.println("Enter An Element To Add.");
                System.out.print("Element: ");
                Integer integer = scanner.nextInt();
                queue.add(integer);
                System.out.println(integer + " Was Successfully Added At Back Of Queue.");
            }
            else if (number == 4)
            {
                if (queue.peek() != null)
                {
                    System.out.println(queue.peek() + "Was Peeked From Queue.");
                }
                else
                {
                    System.out.println("No Items To Peek For Queue.");
                }
            }
            else if (number == 5)
            {
                if (queue.element() != null)
                {
                    System.out.println("Element At Front Is " + queue.element() + ".");
                }
                else
                {
                    System.out.println("No Elements In Queue.");
                }
            }
            else if (number == 6)
            {
                if (queue.peek() != null)
                {
                    System.out.println(queue.poll() + " Was Polled From Queue.");
                }
                else
                {
                    System.out.println("No Elements To Poll From Queue.");
                }
            }
            else if (number == 7)
            {
                if (queue.element() != null)
                {
                    System.out.println(queue.remove() + " Was Removed From Queue.");
                }
                else
                {
                    System.out.println("No Elements To Remove From Queue.");
                }
            }
            else if (number == 8)
            {
                System.out.println("Size Of Queue Is " + queue.size() + " Element(s).");
            }
            else if (number == 9)
            {
                if (queue.peek() != null && queue.element() != null)
                {
                    int index;
                    do
                    {
                        System.out.println("Enter An Index To Get.");
                        System.out.print("Index: ");
                        index = scanner.nextInt();
                        if (queue.get(index) == null)
                        {
                            System.out.println("Invalid Index.");
                        }
                    }
                    while (queue.get(index) == null);
                    System.out.println("Integer At Index " + index + " Is " + queue.get(index) + ".");
                }
                else
                {
                    System.out.println("No Elements To Get In Queue.");
                }
            }
            else if (number == 10)
            {
                if (queue.empty() == true)
                {
                    System.out.println("Queue Is Empty.");
                }
                else
                {
                    System.out.println("Queue Is Not Empty.");
                }
            }
            else if (number == 11)
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