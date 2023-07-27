import java.util.*;

public class LexicographicallyFirstPalindromicString {
    
    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = inputScanner.nextLine();
        
        String palindromicString = findLexicographicallyFirstPalindromicString(input);
        
        System.out.println("The lexicographically first palindromic string is: " + palindromicString);
        
        inputScanner.close();
    }
    
    public static String findLexicographicallyFirstPalindromicString(String input) {
        
        int[] charCount = new int[26]; // count of each character in the input string
        
        // count the occurrence of each character in the input string
        for (int i = 0; i < input.length(); i++) {
            charCount[input.charAt(i) - 'a']++;
        }
        
        String palindrome = ""; // empty string to store the result
        
        // add the characters to the result string in lexicographic order
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            int count = charCount[i];
            
            if (count % 2 == 1) { // add the single middle character if any
                palindrome = palindrome + c;
                count--;
            }
            
            // add the remaining characters in pairs
            for (int j = 0; j < count / 2; j++) {
                palindrome = c + palindrome + c;
            }
        }
        
        return palindrome;
    }
}
=========================================================
SEGMENTED SIEVE
import java.util.*;
public class Main {
    static void SegSieve(int l, int h) {
        boolean prime[] = new boolean[h + 1];
        for (int p = 2; p * p <= h; p++) {
            int sm = (l / p) * p;
            if (sm < l) {
                sm = sm + p;
            }
            for (int i = sm; i <= h; i += p)
                prime[i] = true;
        }
        for (int i = Math.max(2, l); i <= h; i++) {
            if (!prime[i])
                System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound (l): ");
        int l = scanner.nextInt();
        System.out.print("Enter the upper bound (h): ");
        int h = scanner.nextInt();
        scanner.close();
        System.out.println("Prime numbers in the range [" + l + ", " + h + "]: ");
        SegSieve(l, h);
    }
}
===============================================================
EULHER PHI
import java.util.*;
class Main{
    public static int phi(int n){
    int result=n;
    for (int p=2;p*p<=n;p++){
        if(n%p==0){
            while(n%p==0){
                n/=p;
            }
            result-=result/p;
        }
    }
    if(n>1){
        result-=result/n;
    }
    return result;
}
    public static void main (String args[] ) {
        Scanner s = new Scanner (System.in);
        int n=s.nextInt();
        int phi_n=phi(n);
        System.out.println("phi("+n+")= "+phi_n);
        s.close();
}
}
==============================
SABROGRAMMATIC NUMBER
import java.util.*;
class Main{
    public static boolean isStrobogrammatic(String number) {
        char[] mirror = {'0', '1', ' ', ' ', ' ', ' ', '9', ' ', '8', '6'};
        int left = 0;
        int right = number.length() - 1;
        while (left <= right) {
            char leftDigit = number.charAt(left);
            char rightDigit = number.charAt(right);
            char mirrorLeft = mirror[leftDigit - '0'];
            char mirrorRight = mirror[rightDigit - '0'];
            if (mirrorLeft == ' ' || mirrorRight == ' ' || mirrorLeft != rightDigit || mirrorRight != leftDigit) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        scanner.close();
        if (isStrobogrammatic(number)) {
            System.out.println("The number is strobogrammatic.");
        } else {
            System.out.println("The number is not strobogrammatic.");
        }
    }
}
============================================================================
CHINESE REMAINDER
import java.util.*;
class Main {
    static int findMinX(int num[], int rem[], int k) {
        int x = 1;
        while (true) {
            int j;
            for (j = 0; j < k; j++) {
                if (x % num[j] != rem[j])
                    break;
            }
            if (j == k)
                return x;
            x++;
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] num = new int[k];
        int[] rem = new int[k];
        for (int i = 0; i < k; i++) {
            num[i] = scanner.nextInt();
        }
        for (int i = 0; i < k; i++) {
            rem[i] = scanner.nextInt();
        }
        System.out.println("x is " + findMinX(num, rem, k));
        scanner.close();
    }
}
===============================================================
ALICE APPLE
import java.util.*;
class Main{
     public static void main (String args[] ){
         Scanner s=new Scanner(System.in);
         int apple=s.nextInt();
         int cnt=0;int sum=0;
         while(sum<apple){
             cnt++;
             sum+=(12*cnt*cnt);
         }
         System.out.println((8*(cnt)));
     }
}
================================================================
TOGGLE THE SWITCH (DOOR PROBLEM)
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b[] = new boolean[n + 1];
        int i, j, c = 0, o = 0;
        for (i = 1; i <= n; i++) {
            for (j = i; j * i <= n; j++) {
                if (b[j] == false) {
                    b[j] = true;
                } else {
                    b[j] = false;
                }
            }
        }
        for (i = 1; i <= n; i++) {
            if (b[i] == true) {
                c++;
            } else {
                o++;
            }
        }
        System.out.println("No Of Doors open " + c);
        System.out.println("No Of Doors closed " + o);
    }
}
========================================================
BINARY PALINDROME
import java.util.*;
class Main {
    public static boolean isBinaryPalindrome(int x) {
        int reversed = 0;
        int original = x;
        while (x > 0) {
            reversed <<= 1;             // Left shift by 1 bit
            reversed |= (x & 1);        // Add the least significant bit of 'x' to 'reversed'
            x >>= 1;                    // Right shift by 1 bit
        }
        return reversed == original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (isBinaryPalindrome(x)) {
            System.out.println(x + " has a binary palindrome representation.");
        } else {
            System.out.println(x + " does not have a binary palindrome representation.");
        }
    }
}
============================================================
BOOTH ALGORITHM
import java.util.*;
class Main{
    public static int multiply(int n1, int n2) {
        int m = n1;
        int r = n2;
        int A = n1;
        int S = -n1;
        int P = 0;
        int count = Integer.SIZE;
        System.out.print(count);
                    while (count > 0) {
            if ((r & 1) == 1) {
                P += A;
                S += m;
            }
            A <<= 1;
            S <<= 1;
            count--;
            r >>= 1;
        }
        return P;
    }
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int result = multiply(n1, n2);
        System.out.println("\n\nResult : " + n1 + " * " + n2 + " = " + result);
}
}
==================================================
EUCLID ALGORITHM (GCD)
import java.util.*;
class Main {
    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g = gcd(a, b);
        System.out.println("GCD(" + a + " , " + b + ") = " + g);
        sc.close();
    }
}
=====================================================
KARATSUBA ALGORTIHM
import java.util.*;
class Main {
    public static long karatsubaMultiply(long x, long y) {
        if (x < 10 || y < 10) {
            return x * y;
        }
        int n = Math.max(Long.toString(x).length(), Long.toString(y).length());
        int half = (n + 1) / 2;
        long a = x / (long) Math.pow(10, half);
        long b = x % (long) Math.pow(10, half);
        long c = y / (long) Math.pow(10, half);
        long d = y % (long) Math.pow(10, half);
        long ac = karatsubaMultiply(a, c);
        long bd = karatsubaMultiply(b, d);
        long adbc = karatsubaMultiply(a + b, c + d) - ac - bd;
        return (long) (ac * Math.pow(10, 2 * half) + adbc * Math.pow(10, half) + bd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long product = karatsubaMultiply(x, y);
        System.out.println("Product: " + product);
        sc.close();
    }
}
========================================================
FLIPPING A BIT
import java.util.*;
public class Main {
    public static int longestConsecutiveOnes(int n) {
        String binary = Integer.toBinaryString(n);
        int maxLength = 0;
        int currentLength = 0;
        int previousLength = 0;
        for (char bit : binary.toCharArray()) {
            if (bit == '1') {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength + previousLength + 1);
                previousLength = currentLength;
                currentLength = 0;
            }
        }
        maxLength = Math.max(maxLength, currentLength + previousLength + 1);
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int longestSequence = longestConsecutiveOnes(n);
        System.out.println("The longest consecutive sequence of 1's  " + n + " is: " + longestSequence);
        sc.close();
    }
}
###############################
BYTE SWAP
import java.util.*;
public class Main {
    public static byte swapNibbles(byte b) {
        byte upperNibble = (byte) ((b & 0xF0) >>> 4);
        byte lowerNibble = (byte) (b & 0x0F);
        byte swappedByte = (byte) ((lowerNibble << 4) | upperNibble);        
        return swappedByte;
    }
    public static void main(String[] args) {
        byte byteValue = (byte) 0xAB;  
        byte swappedByte = swapNibbles(byteValue);
        System.out.println("Original byte: " + Integer.toBinaryString(byteValue & 0xFF));
        System.out.println("Swapped byte: " + Integer.toBinaryString(swappedByte & 0xFF));
    }
}
=====================================================
BLOCK SWAP ALGORITHM
import java.util.*;
public class Main {
    public static void leftRotate(int arr[], int d, int n) {
        leftRotateRec(arr, 0, d, n);
    }
    public static void leftRotateRec(int arr[], int i, int d, int n) {
        if (d == 0 || d == n)
            return;
        if (n - d == d) {
            swap(arr, i, n - d + i, d);
            return;
        }
        if (d < n - d) {
            swap(arr, i, n - d + i, d);
            leftRotateRec(arr, i, d, n - d);
        } else
        {
            swap(arr, i, d, n - d);
            leftRotateRec(arr, n - d + i, 2 * d - n, d);
        }
    }
    public static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void swap(int arr[], int fi, int si, int d) {
        int i, temp;
        for (i = 0; i < d; i++) {
            temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.print("Enter the number of positions to rotate left: ");
            int d = scanner.nextInt();
            leftRotate(arr, d, n);
            System.out.print("Rotated array: ");
            printArray(arr, n);
            scanner.close();
    }
}
======================================================
MAXIMUM PRODUCT SUBARRAY
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int m = a[0];
        int min = a[0];
        int temp = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > 0) {
                max = Math.max(a[i], max * a[i]);
                min = Math.min(a[i], min * a[i]);
            } else if (a[i] == 0) {
                max = min = 0;
            } else {
                temp = max;
                max = Math.max(a[i], min * a[i]);
                min = Math.min(a[i], temp * a[i]);
            }
            m = Math.max(m, max);
        }
        System.out.println("Maximum product: " + m);
        sc.close();
    }
}
===============================================
EQUILIBRIUM SUM
import java.util.*;
public class Main {
    public static int getMaxEquilibriumSumOptimized(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum && leftSum > maxSum) {
                maxSum = leftSum;
            }
            leftSum += arr[i];
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSum = getMaxEquilibriumSumOptimized(arr);
        System.out.println("Max Equilibrium Sum: " + maxSum);
        sc.close();
    }
}
===========================
MAJORITY ELEMENT
import java.util.*;
public class Main {
    static void findMajority(int arr[], int n) {
        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        if (maxCount > n / 2)
            System.out.println(arr[index]);

        else
            System.out.println("No Majority Element");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findMajority(arr, n);

        sc.close();
    }
}
========================================================
NATURAL SORT

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of file names: ");
        int numFiles = scanner.nextInt();
        scanner.nextLine();

        String[] fileNames = new String[numFiles];
        for (int i = 0; i < numFiles; i++) {
            fileNames[i] = scanner.nextLine();
        }

        naturalSort(fileNames);

        System.out.println("Sorted file names:");
        for (String fileName : fileNames) {
            System.out.println(fileName);
        }

        scanner.close();
    }

    public static void naturalSort(String[] fileNames) {
        Arrays.sort(fileNames, new NaturalComparator());
    }

    static class NaturalComparator implements Comparator<String> {
        public int compare(String fileName1, String fileName2) {
            return extractNumber(fileName1) - extractNumber(fileName2);
        }

        private int extractNumber(String fileName) {
            String numberString = fileName.replaceAll("\\D+", "");
            return numberString.isEmpty() ? 0 : Integer.parseInt(numberString);
        }
    }
}


====================================================
WEIGHTED STRING

import java.util.*;
public class Main {
    static int[] values = new int[26];
    public static void main(String[] args) {
        insertValues();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Character> s = new ArrayList<>();
        formedString(s, n);
    }

    static void insertValues() {
        values[0] = 1;
        int prev = 1;
        for (int i = 1; i < 26; i++) {
            values[i] = (i + 1) * prev + prev;
            prev = values[i];
            // System.out.println(prev);
        }
    }

    static void formedString(List<Character> s, int k) {
        int low = 0;
        int high = 25;
        while (k != 0) {
            int ind = findFloor(k, low, high);
            s.add((char) (ind + 'A'));
k = k - values[ind];
            // System.out.println(k);
        }
        for (int i = s.size() - 1; i >= 0; i--)
            System.out.print(s.get(i));
    }
    static int findFloor(int k, int low, int high) {
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (values[mid] <= k) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        // System.out.println(ans);
        return ans;
    }
}
=========================
HAMLILTON GRAPH

import java.util.*;
public class Main {
    private static void printSolution(int path[]) {
        System.out.print("Solution Exists: Following is one Hamiltonian Cycle: ");
        for (int i = 0; i < path.length; i++)
            System.out.print(path[i] + " ");
        System.out.println(path[0]);
    }
    private static boolean isSafe(int v, boolean graph[][], int path[], int pos) {
        if (!graph[path[pos - 1]][v])
            return false;
        for (int i = 0; i < pos; i++)
            if (path[i] == v)
                return false;
        return true;
    }
    private static boolean hamCycleUtil(boolean graph[][], int path[], int pos) {
        if (pos == path.length) {
            if (graph[path[pos - 1]][path[0]])
                return true;
            else
                return false;
        }
        for (int v = 1; v < path.length; v++) {
            if (isSafe(v, graph, path, pos)) {
                path[pos] = v;

                if (hamCycleUtil(graph, path, pos + 1))
                    return true;

                path[pos] = -1;
            }
        }
        return false;
    }

    private static boolean hamCycle(boolean graph[][]) {
        int path[] = new int[graph.length];
        Arrays.fill(path, -1);

        path[0] = 0;
        if (!hamCycleUtil(graph, path, 1)) {
            System.out.println("Solution does not exist");
            return false;
        }

        printSolution(path);
        return true;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices (V): ");
        int V = scanner.nextInt();

        boolean graph[][] = new boolean[V][V];
        System.out.println("Enter the adjacency matrix for the graph (1 if there is an edge, 0 otherwise):");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = scanner.nextInt() == 1;
            }
        }
        scanner.close();

        hamCycle(graph);
    }
}



public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices (V): ");
        int V = scanner.nextInt();

        boolean graph[][] = new boolean[V][V];
        System.out.println("Enter the adjacency matrix for the graph (1 if there is an edge, 0 otherwise):");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = scanner.nextInt() == 1;
            }
        }
        scanner.close();

        hamCycle(graph);
    }
}
====================
MOVE HYPEN TO THE BEGINNING

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();
        String transformedString = moveHyphenToBeginning(originalString);
        System.out.println("Transformed string: " + transformedString);
        scanner.close();
    }

    public static String moveHyphenToBeginning(String string) {
        if (string.contains("-")) {
            int hyphenIndex = string.indexOf("-");
            return "-" + string.substring(0, hyphenIndex) + string.substring(hyphenIndex + 1);
        } else {
            return string;
        }
    }
}
==========================================================
LONGEST PALINDROME SUBSTRING (MANCHER ALGO)

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        findLongestPalindromicString(text);
        scanner.close();
    }

    static void findLongestPalindromicString(String text) {
        int N = text.length();
        if (N == 0)
            return;
        N = 2 * N + 1; // Position count
        int[] L = new int[N + 1]; // LPS Length Array
        L[0] = 0;
        L[1] = 1;
        int C = 1; // centerPosition
        int R = 2; // centerRightPosition
        int i = 0; // currentRightPosition
        int iMirror; // currentLeftPosition
        int maxLPSLength = 0;
        int maxLPSCenterPosition = 0;
        int start = -1;
        int end = -1;
        int diff = -1;

        for (i = 2; i < N; i++) {
            iMirror = 2 * C - i;
            L[i] = 0;
            diff = R - i;

            if (diff > 0)
                L[i] = Math.min(L[iMirror], diff);

            while (((i + L[i]) + 1 < N && (i - L[i]) > 0) &&
                    (((i + L[i] + 1) % 2 == 0) ||
                    (text.charAt((i + L[i] + 1) / 2) ==
                    text.charAt((i - L[i] - 1) / 2)))) {
                L[i]++;
            }

            if (L[i] > maxLPSLength) // Track maxLPSLength and center position
            {
                maxLPSLength = L[i];
                maxLPSCenterPosition = i;
            }

            if (i + L[i] > R) {
                C = i;
                R = i + L[i];
            }
        }

        start = (maxLPSCenterPosition - maxLPSLength) / 2;
        end = start + maxLPSLength - 1;
        String longestPalindromicSubstring = text.substring(start, end + 1);
        System.out.println("Longest Palindromic Substring: " + longestPalindromicSubstring);
    }
}
==========================================================
SORTED UNIQUE PERMUTATION OF STRING

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        distinctPermutations(input);
        scanner.close();
    }

    public static void distinctPermutations(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        input = new String(chars);
        permute(input.toCharArray(), 0);
    }

    public static void permute(char[] chars, int index) {
        if (index == chars.length - 1) {
            System.out.println(String.valueOf(chars));
            return;
        }
        Set<Character> used = new HashSet<>();
        for (int i = index; i < chars.length; i++) {
            if (used.contains(chars[i]))
                continue;

            used.add(chars[i]);
            swap(chars, index, i);
            permute(chars, index + 1);
            swap(chars, index, i);
        }
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}

=======================================================
RAT MAZE

import java.util.*;
public class Main {
final static int N = 4;
public static void printSolution(int sol[][]) {
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++)
            System.out.print(" " + sol[i][j] + " ");
        System.out.println();
    }
}
public static boolean isSafe(int maze[][], int x, int y) {
    return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
}
public static boolean solveMaze(int maze[][]) {
    int sol[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };

    if (solveMazeUtil(maze, 0, 0, sol) == false) {
        System.out.print("Solution doesn't exist");
        return false;
    }
    printSolution(sol);
    return true;
}
public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
    if (x == N - 1 && y == N - 1) {
        sol[x][y] = 1;
        return true;
    }
    if (isSafe(maze, x, y) == true) {
        sol[x][y] = 1;
        if (solveMazeUtil(maze, x + 1, y, sol))
            return true;
        if (solveMazeUtil(maze, x, y + 1, sol))
            return true;

        sol[x][y] = 0;
        return false;
    }

    return false;
}

public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int maze[][] = new int[N][N];

    System.out.println("Enter the maze (1 for path, 0 for blocked): ");
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            maze[i][j] = scanner.nextInt();
        }
    }

    scanner.close();

    solveMaze(maze);
}}
==========================================================
N QUEEN

import java.util.*;

public class Main {
    static int N;

    public static void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j] + " ");
            System.out.println();
        }
    }
    public static boolean isSafe(int board[][], int row, int col) {
        int i, j;
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    public static boolean solveNQUtil(int board[][], int col) {
        if (col >= N)
            return true;

        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;

                if (solveNQUtil(board, col + 1))
                    return true;

                board[i][col] = 0; // BACKTRACK
            }
        }

        return false;
    }

    public static boolean solveNQ() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        scanner.close();

        int board[][] = new int[N][N];

        if (solveNQUtil(board, 0) == false) {
            System.out.print("Solution does not exist");
            return false;
        }

        printSolution(board);
        return true;
    }

    public static void main(String args[]) {
        solveNQ();
    }
}
=========================================================
KNIGHT TOUR(WARANSDROFF ALGO)

import java.util.Scanner;

public class Main {
    static int x[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
    static int y[] = { 2, 1, -1, -2, -2, -1, 1, 2 };

    static boolean isSafe(int a, int b) {
        return (a >= 0 && a < 8 && b >= 0 && b < 8);
    }

    static boolean traverse(int pos_x, int pos_y, int count, int[][] arr, boolean[][] visited) {
        arr[pos_x][pos_y] = count;
        visited[pos_x][pos_y] = true;
        if (count == 64)
            return true;
        if (count > 64)
            return false;
        for (int i = 0; i < 8; i++) {
            int x_axis = pos_x + x[i];
            int y_axis = pos_y + y[i];
            if (isSafe(x_axis, y_axis) && !visited[x_axis][y_axis] && traverse(x_axis, y_axis, count + 1, arr, visited)) {
                return true;
            }
        }
        arr[pos_x][pos_y] = 0;
        visited[pos_x][pos_y] = false;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position (X Y): ");
        int pos_x = scanner.nextInt();
        int pos_y = scanner.nextInt();

        int count = 1;
        int[][] arr = new int[8][8];
        boolean[][] visited = new boolean[8][8];

        if (traverse(pos_x, pos_y, count, arr, visited)) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Not possible to cover");
        }

        scanner.close();
    }
}

=======================================================
COMBINATION

import java.util.*;

public class Main {

    static int fact(int number) {
        int f = 1;
        int j = 1;
        while (j <= number) {
            f = f * j;
            j++;
        }
        return f;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<Integer>();
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of r (number of elements to select): ");
        int r = scanner.nextInt();

        scanner.close();
        int result = fact(n) / (fact(r) * fact(n - r));
        System.out.println("The combination value for the given list is: " + result);
    }
}
