import java.util.*;

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
        MyMap <String, Integer> map = new MyMap <String, Integer> ();
        boolean running = true;
        System.out.println("Map & Tester");
        while (running)
        {
            System.out.println("\n1. Clear - Empties The Map.");
            System.out.println("2. Contains Key - Tells The User If The Given Key Was Found In The Map.");
            System.out.println("3. Contains Value - Tells The User If The Given Value Was Found In The Map.");
            System.out.println("4. Get - Gets The Value That Corresponds To The Given Key And Tells The User If Successful.");
            System.out.println("5. Put - Puts A Value Into The Map With A Given Key.");
            System.out.println("6. Remove - Removes The Given Key And Prints The Value If Successful.");
            System.out.println("7. Size - Tells The User The Number Of Items In The Map.");
            System.out.println("8. Print - Prints All The Entries Contained In The Map.");
            System.out.println("9. Is Empty - Tells The User If The Map Is Empty Or Not.");
            System.out.println("10. Exit - Closes The Program.");
            System.out.print("Enter An Option (1-10): ");
            int number = scanner.nextInt();
            if (number == 1)
            {
                if (map.isEmpty())
                {
                    System.out.println("Map Has No Entries.");
                }
                else
                {
                    System.out.println("Map Successfully Cleared.");
                }
                map.clear();
            }
            else if (number == 2)
            {
                if (map.isEmpty())
                {
                    System.out.println("No Keys To Find In Map.");
                    continue;
                }
                System.out.println("Enter A Key To Search For.");
                System.out.print("Key: ");
                String key = scanner.next();
                if (map.containsKey(key))
                {
                    System.out.println("Key \"" + key + "\" Was Found In Map.");
                }
                else
                {
                    System.out.println("Unable to Locate Key \"" + key + "\" In Map.");
                }
            }
            else if (number == 3)
            {
                if (map.isEmpty())
                {
                    System.out.println("No Values To Find In Map.");
                    continue;
                }
                System.out.println("Enter A Value To Search For.");
                System.out.print("Value: ");
                Integer value = scanner.nextInt();
                if (map.containsValue(value))
                {
                    System.out.println("Value " + value + " Was Found In Map.");
                }
                else
                {
                    System.out.println("Unable to Locate Value " + value + " In Map.");
                }
            }
            else if (number == 4)
            {
                if (map.isEmpty())
                {
                    System.out.println("No Entries To Get In Map.");
                    continue;
                }
                System.out.println("Enter A Key To Search For Value.");
                System.out.print("Key: ");
                String key = scanner.next();
                if (map.get(key) != null)
                {
                    System.out.println(map.get(key) + " Is The Value Of Key \"" + key + "\" In Map.");
                }
                else
                {
                    System.out.println("Unable To Locate Key \"" + key + "\" In Map.");
                }
            }
            else if (number == 5)
            {
                System.out.println("Enter A Key To Put.");
                System.out.print("Key: ");
                String key = scanner.next();
                System.out.println("Enter A Value To Put.");
                System.out.print("Value: ");
                Integer value = scanner.nextInt();
                Integer val = map.put(key, value);
                if (!map.containsKey(key) && val == null)
                {
                    System.out.println("Entry (" + key + " - " + value + ") Was Successfully Added.");
                }
                else if (val != null)
                {
                    System.out.println("Value " + value + " Replaced Value " + val + " Of Key \"" + key + "\"");
                }
            }
            else if (number == 6)
            {
                if (map.isEmpty())
                {
                    System.out.println("No Entries To Remove From Map.");
                    continue;
                }
                System.out.println("Enter An Key To Remove.");
                System.out.print("Key: ");
                String key = scanner.next();
                if (map.get(key) != null)
                {
                    System.out.println("Key \"" + key + "\" With Value " + map.remove(key) + " Was Successfully Removed From Map.");
                }
                else
                {
                    System.out.println("Unable To Locate Key \"" + key + "\" In Map.");
                }
            }
            else if (number == 7)
            {
                System.out.print("Size Of Map Is " + map.size());
                if (map.size() == 1)
                {
                    System.out.println(" Entry.");
                }
                else
                {
                    System.out.println(" Entries.");
                }
            }
            else if (number == 8)
            {
                if (map.isEmpty())
                {
                    System.out.println("No Entries To Print From Map.");
                    continue;
                }
                String entries = "";
                Iterator <String> keys = map.keySet().iterator();
                Iterator <Integer> values = map.values().iterator();
                while (keys.hasNext() && values.hasNext())
                {
                    MapEntry <String, Integer> mapEntry = new MapEntry <String, Integer> (keys.next(), values.next());
                    entries += mapEntry.toString() + " ";
                }
                System.out.println("Data In Map Is: " + entries);
            }
            else if (number == 9)
            {
                if (map.isEmpty())
                {
                    System.out.println("Map Is Empty.");
                }
                else
                {
                    System.out.println("Map Is Not Empty.");
                }
            }
            else if (number == 10)
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