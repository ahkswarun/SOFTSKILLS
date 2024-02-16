LOOPDETECTION
/*
import java.util.*;

public class loopdetect {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            data = data;
            next = null;
        }
    }

    Node head; 

    void push(int newdata) {
        Node newNode = new Node(newdata);
        newNode.next = head;
        head = newNode;
    }

    boolean detectLoop() { // Use boolean return type for clarity
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println("Loop Found");
                return true;
            }
        }

        System.out.println("No Loop detected");
        return false;
    }

    public static void main(String[] args) {
        loopdetect list = new loopdetect();
        list.push(20);
        list.push(41);
        list.push(5);
        list.push(10);
        list.head.next.next.next.next = list.head; // Create a loop
        list.detectLoop();
    }
}

*/
biotonic
/*
import java.util.*;

class Main {
    static class Node {
        int data;
        Node next;
        Node prev;
    };

    static Node sort(Node head) {
        if (head == null || head.next == null)
            return head;
        Node front = head;
        Node last = head;
        Node res = new Node();
        Node resend = res;
        Node next;
        while (last.next != null)
            last = last.next;
        while (front != last) {
            if (last.data <= front.data) {
                resend.next = last;
                next = last.prev;
                last.prev.next = null;
                last.prev = resend;
                last = next;
                resend = resend.next;
            } else {
                resend.next = front;
                next = front.next;
                front.next = null;
                front.prev = resend;
                front = next;
                resend = resend.next;
            }
        }
        resend.next = front;
        front.prev = resend;
        return res.next;
    }

    static Node

            push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.prev = null;
        new_node.next = head_ref;
        if (head_ref != null)
            head_ref.prev = new_node;
        head_ref = new_node;
        return head_ref;
    }

    static void printlist(Node head) {
        if (head == null)
            System.out.print("Doubly Linked list is empty");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            head = push(head, m);
        }
        head = sort(head);
        System.out.println("After sorting:");
        printlist(head);
    }
}*/
segregate
/*
import java.util.Scanner;

class segregate {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void segregateEvenOdd() {
        Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;
        Node currentNode = head;

        while (currentNode != null) {
            int element = currentNode.data;
            if (element % 2 == 0) {
                if (evenStart == null) {
                    evenStart = currentNode;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = currentNode;
                    evenEnd = evenEnd.next;
                }
            } else {
                if (oddStart == null) {
                    oddStart = currentNode;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = currentNode;
                    oddEnd = oddEnd.next;
                }
            }
            currentNode = currentNode.next;
        }
        if (oddStart == null || evenStart == null) {
            return;
        }
        evenEnd.next = oddStart;
        oddEnd.next = null;
        head = evenStart;
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        segregate list = new segregate();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            list.push(m);
        }
        list.segregateEvenOdd();
        list.printList();
    }
}
*/
MinStack
/*
import java.util.*;

public class MinStack {
    Stack<Integer> s;
    Stack<Integer> a;

    MinStack() {
        s = new Stack<Integer>();
        a = new Stack<Integer>();
    }

    void getMin() {
        if (a.isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Minimum element : " + a.peek());
        }
    }

    void peek() {
        if (s.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Top most element: " + s.peek());
    }

    void pop() {
        if (s.isEmpty()) {
            System.out.println("Empty stack");
            return;
        }
        int t = s.pop();
        if (!a.isEmpty() && a.peek().equals(t)) {
            a.pop();
        }
        System.out.println("Popped element : " + t);
    }

    void push(int x) {
        if (s.isEmpty()) {
            s.push(x);
            a.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }
        s.push(x);
        System.out.println("Number Inserted: " + x);

        if (x <= a.peek()) {
            a.push(x);
        }
    }
}

public class Main {
    public static void main(String args[]) {
        MinStack s = new MinStack();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            s.push(m);
        }
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
    }
}
*/
celebrity
/*
import java.util.*;
public class celebrity {
    public static int celebritySolution(int[][] mat) {
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<mat.length;i++) {
            stk.push(i);
        }
        while(stk.size() > 1) {
            int col = stk.pop();
            int row = stk.pop();
            if(mat[row][col] == 1)
  {
                stk.push(col); 
            } 
 else {
                stk.push(row); 
            }
        }
        int x = stk.pop();
        for(int j=0;j<mat.length;j++) {
            if(j == x) continue;
            if(mat[x][j] == 1) {
                return -1;
            }
        }
        
        for(int i=0;i<mat.length;i++) {
            if(i == x) continue;
            if(mat[i][x] == 0) {
                return -1;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        int res = celebritySolution(matrix);
        if(res == -1) {
            System.out.println("There is no celebrity in the party");
        } else {
            System.out.println(res + " is the celebrity in the party");
        }
    }
}
*/
hanoi
/*

public class toh
{
    public static void main(String args[])
    {
        int n=3;
        towerofHanoi(n,'A','C','B');
    }
    public static void towerofHanoi(int n, char source, char dest, char aux)
    {
        if(n==1)
        {
            System.out.println("Move Disc 1 from "+source+" to "+dest);
            return;
        }
        towerofHanoi(n-1,source,aux,dest);
        System.out.println("Move Disc "+n+" from "+source+" to "+dest);
        towerofHanoi(n-1,aux,dest,source);
    }
}

*/
stock stockspan
/*
import java.util.*;

public class stockspan {
    static void calculate(int arr[], int n, int S[]) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        S[0] = 1;
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i])
                st.pop();
            S[i] = (st.isEmpty()) ? (i + 1) : (i - st.peek());
            st.push(i);
        }
    }

    static void printArray(int arr[]) {
        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int S[] = new int[n];
        calculate(arr, n, S);
        printArray(S);
    }
}
*/
sort without extra space
/*
import java.util.*;

class Main {
    public static int minIndex(Queue<Integer> list, int sortIndex) {
        int min_index = -1;
        int min_value = Integer.MAX_VALUE;
        int s = list.size();
        for (int i = 0; i < s; i++) {
            int current = list.peek();
            list.poll();
            if (current <= min_value && i <= sortIndex) {
                min_index = i;
                min_value = current;
            }
            list.add(current);
        }
        return min_index;
    }

    public static void insertMinToRear(Queue<Integer> list, int min_index) {
        int min_value = 0;
        int s = list.size();
        for (int i = 0; i < s; i++) {
            int current = list.peek();
            list.poll();
            if (i != min_index)
                list.add(current);
            else
                min_value = current;
        }
        list.add(min_value);
    }

    public static void sortQueue(Queue<Integer> list) {
        for (int i = 1; i <= list.size(); i++) {
            int min_index = minIndex(list, list.size() - i);
            insertMinToRear(list, min_index);
        }
    }

    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<Integer>();
        list.add(6);
        list.add(11);
        list.add(15);
        list.add(4);
        sortQueue(list);
        while (list.isEmpty() == false) {
            System.out.print(list.peek() + " ");
            list.poll();
        }
    }
}
*/
// priority Queue
/*
import java.util.*;

class Main {
    static class Node {
        int data;
        int priority;
        Node next, prev;

        public Node(int data, int priority) {
            this.data = data;
            this.priority = priority;
        }
    }

    private static Node head = null;

    private static void push(int data, int priority) {
        if (head == null) {
            Node newNode = new Node(data, priority);
            head = newNode;
            return;
        }
        Node node = new Node(data, priority);
        Node temp = head, parent = null;
        while (temp != null && temp.priority >= priority) {
            parent = temp;
            temp = temp.next;
        }
        if (parent == null) {
            node.next = head;
            head.prev = node;
            head = node;
        }

        else if (temp == null) {
            parent.next = node;
            node.prev = parent;
        } else {
            parent.next = node;
            node.prev = parent;
            node.next = temp;
            temp.prev = node;
        }
    }

    private static int peek() {
        if (head != null) {
            return head.data;
        }
        return -1;
    }

    private static int pop() {
        if (head != null) {
            int curr = head.data;
            head = head.next;
            if (head != null)
                head.prev = null;
            return curr;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            int pri = sc.nextInt();
            push(data, pri);
        }
        System.out.println(peek());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(peek());
    }
}
*/
mergeSort
/*
import java.util.*;

public class mergesort {
    public static void printList(LinkedList<Integer> list) {
        for (Integer value : list) {
            System.out.print(value + " ");
        }
    }

    public static LinkedList<Integer> mergeSort(LinkedList<Integer> list) {
        if (list == null || list.size() <= 1) {
            return list;
        }

        int middle = list.size() / 2;

        LinkedList<Integer> left = new LinkedList<>(list.subList(0, middle));
        LinkedList<Integer> right = new LinkedList<>(list.subList(middle, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static LinkedList<Integer> merge(LinkedList<Integer> left, LinkedList<Integer> right) {
        LinkedList<Integer> merged = new LinkedList<>();

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.getFirst() < right.getFirst()) {
                merged.add(left.poll());
            } else {
                merged.add(right.poll());
            }
        }

        merged.addAll(left);
        merged.addAll(right);

        return merged;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int m = s.nextInt();
            list.add(m);
        }

        LinkedList<Integer> sortedList = mergeSort(list);
        System.out.println("Linked list after sorting :");
        printList(sortedList);
    }
}
*/
maxsliding
/*
import java.util.*;

public class Main {
    public static int[] maxsliding(int[] in, int w) {
        int[] max_left = new int[in.length];
        int[] max_right = new int[in.length];
        max_left[0] = in[0];
        max_right[in.length - 1] = in[in.length - 1];
        for (int i = 1; i < in.length; i++) {
            max_left[i] = (i % w == 0) ? in[i] : Math.max(max_left[i - 1], in[i]);

            final int j = in.length - i - 1;
            max_right[j] = (j % w == 0) ? in[j] : Math.max(max_right[j + 1], in[j]);
        }
        final int[] sliding_max = new int[in.length - w + 1];
        for (int i = 0, j = 0; i + w <= in.length; i++) {
            sliding_max[j++] = Math.max(max_right[i], max_left[i + w - 1]);
        }
        return sliding_max;
    }

    public static void main(String[] args) {
        int[] input = {1, 3, -1, -3, 5, 3, 6, 7};
        int windowSize = 3;
        int[] result = maxsliding(input, windowSize);
        System.out.println(Arrays.toString(result));
    }
}
*/
stackpermutations
/*
import java.util.*;

class Main {
    static boolean check(int[] ip, int[] op, int n) {
        Stack<Integer> s = new Stack<>();
        int j = 0;
        for (int i = 0; i < n; i++) {
            s.push(ip[i]);
            while (!s.isEmpty() && s.peek() == op[j]) {
                s.pop();
                j++;
            }
        }
        return s.isEmpty();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        int[] output = new int[n];
        for (int i = 0; i < n; i++)
            input[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            output[i] = sc.nextInt();
        if (check(input, output, n))
            System.out.println("Yes");
        else
            System.out.println("Not Possible");
    }
}
*/
