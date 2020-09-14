/*
Ismat Syah Imran
Mr. Tully
Period 4
 */

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue<Integer> queue = new MyQueue<Integer>();
        while(true) {
            System.out.println("\n-Menu-");
            System.out.println("1. Print");
            System.out.println("2. Offer/Add");
            System.out.println("3. Peek/Element");
            System.out.println("4. Poll/Remove");
            System.out.println("5. Size");
            System.out.println("6. Get");
            System.out.println("7. Empty");
            System.out.println("8. Exit");
            System.out.print("Enter: ");
            int x = sc.nextInt();
            if (x == 1)
                System.out.println("\nThe data in the queue is: " + queue.toString());
            else if (x == 2) {
                System.out.print("\nEnter a number: ");
                queue.add(sc.nextInt());
            }
            else if (x == 3) {
                if(queue.size() > 0)
                    System.out.println("\nThe next value in line is: " + queue.peek());
                else
                    System.out.println("\nThe queue is empty");
            }
            else if (x == 4) {
                if(queue.size() > 0)
                    System.out.println("\n" + queue.remove() + " was removed");
                else
                    System.out.println("\nThe queue is empty");
            }
            else if (x == 5) {
                System.out.println("\nThe size of the queue is " + queue.size());
            }
            else if (x == 6) {
                System.out.print("\nEnter a location: ");
                int y = sc.nextInt();
                if(y > queue.size()-1)
                    System.out.println("Spot " + y + " does not exist");
                else
                    System.out.println("The value at spot " + y + " is " + queue.get(y));
            }
            else if (x == 7) {
                if(queue.size() > 0)
                    System.out.println("\nYour queue is NOT empty");
                else
                    System.out.println("\nYour queue is empty");
            }
            else if (x == 8) {
                System.out.println("\nGood Bye");
                break;
            }
        }
    }
}
