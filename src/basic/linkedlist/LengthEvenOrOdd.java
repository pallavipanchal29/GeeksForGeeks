package basic.linkedlist;

import java.io.IOException;
import java.util.Scanner;

public class LengthEvenOrOdd {
    Node head;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for (int i = 0; i < n - 1; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }

            int start = isLenghtEvenOrOdd(head);
            if (start == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static int isLenghtEvenOrOdd(Node head) {
        int length = 0;

        while (head.next != null) {
            head = head.next;
            length++;
        }
        return (length % 2) == 1 ? 0 : 1;
    }
}
