package easy.linkedlist;

import java.util.Scanner;

public class OccuranceOfIntegerLL {
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }

            int k = sc.nextInt();
            System.out.println(count(head, k));
        }
    }

    public static int count(Node head, int search_for) {
        int count = 0;
        while (head != null) {
            if (head.data == search_for) {
                count++;
            }
            head = head.next;
        }
        return count;
    }

    public static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
}
