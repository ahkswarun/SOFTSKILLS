*****************************************************Alice Apple Tree************************************
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int apple = sc.nextInt();
                int cnt = 0, sum = 0;
                while (sum < apple) {
                        cnt++;
                        sum += (12 * cnt * cnt);

                }
                System.out.println((8 * (cnt)));
        }
}

*************************************************************Binary Palindrome************************
import java.util.*;
public class Main {
 public static boolean isBinaryPalindrome(int x) {
         int reversed = 0;
         int original = x;
        while (x > 0) {
         reversed <<= 1;         // Left shift by 1 bit
         reversed |= (x & 1);  // Add the least significant bit of 'x' to'reversed'
         x >>= 1;         // Right shift by 1 bit
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

********************************************************BOOths************************************
import java.util.Scanner;
public class Main {
    public static int multiply(int n1, int n2) {
        int m = n1;
        int r = n2;
        int A = n1;
        int S = -n1;
        int P = 0;
        int count = Integer.SIZE;            
        //System.out.print(count);
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
        System.out.println("Enter two integer numbers -");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int result = multiply(n1, n2);
        System.out.println("\n\nResult : " + n1 + " * " + n2 + " = " + result);
    }
}

*********************************************************** Block Swap **************************************************************
import java.util.*; 
 
class Main{ 
    
    // Swapping r elements from starting of index a with r elements starting at index b
    public static void swap(int arr[], int a, int b, int r){ 
        for(int i = 0 ; i < r ; i++){ 
            int temp = arr[a + i]; 
            arr[a + i] = arr[b + i]; 
            arr[b + i] = temp; 
        } 
        
    }
    
    // Left rotating the array elements
    public static void leftRotate(int arr[], int r){ 
        int n = arr.length;
        
        // If the no of elements to rotate = 0 or equal to size of array
        if(r == 0 || r == n) return; 
        
        int i = r; 
        int j = n - r; 
        // Perform block swaps till the size of 2 subarrays is not equal
        while (i != j){   
            // A's size is less
            if(i < j){ 
                swap(arr, r-i, r+j-i, i); 
                j = j - i; 
            } 
            // B's size is less
            else{ 
                swap(arr, r-i, r, j); 
                i = i - j; 
            } 
        }
        
        // Finally at the end, block swap elements of A and B
        swap(arr, r-i, r, i); 
    } 
    
    // Main function
    public static void main(String[] args){ 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = s.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements of the array");
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();
        
        System.out.println("Enter the number of rotations");
        int no_of_rotations = s.nextInt();
        
        leftRotate(arr, no_of_rotations); 
        
        System.out.println("Array Elements after rotating : "); 
        for(int i = 0 ; i < n ; i++){   
            System.out.print(arr[i] + " "); 
        }
    }  
}

*********************************************************** Block Swap **************************************************************
import java.util.*; 
 
class Main{ 
    
    // Swapping r elements from starting of index a with r elements starting at index b
    public static void swap(int arr[], int a, int b, int r){ 
        for(int i = 0 ; i < r ; i++){ 
            int temp = arr[a + i]; 
            arr[a + i] = arr[b + i]; 
            arr[b + i] = temp; 
        } 
        
    }
    
    // Left rotating the array elements
    public static void leftRotate(int arr[], int r){ 
        int n = arr.length;
        
        // If the no of elements to rotate = 0 or equal to size of array
        if(r == 0 || r == n) return; 
        
        int i = r; 
        int j = n - r; 
        // Perform block swaps till the size of 2 subarrays is not equal
        while (i != j){   
            // A's size is less
            if(i < j){ 
                swap(arr, r-i, r+j-i, i); 
                j = j - i; 
            } 
            // B's size is less
            else{ 
                swap(arr, r-i, r, j); 
                i = i - j; 
            } 
        }
        
        // Finally at the end, block swap elements of A and B
        swap(arr, r-i, r, i); 
    } 
    
    // Main function
    public static void main(String[] args){ 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = s.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements of the array");
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();
        
        System.out.println("Enter the number of rotations");
        int no_of_rotations = s.nextInt();
        
        leftRotate(arr, no_of_rotations); 
        
        System.out.println("Array Elements after rotating : "); 
        for(int i = 0 ; i < n ; i++){   
            System.out.print(arr[i] + " "); 
        }
    }  
}
------------------------------bulbs-----------------------------------
import java.util.*;

public class Main {

    public static ArrayList<Integer> toggleBulbs(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 1;
        while ((i * i) <= n) {
            arr.add(i * i);
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        ArrayList<Integer> result = toggleBulbs(n);
        System.out.println("Bulbs to toggle: " + result);
    }
}

****************************** Chinese Remainder Theorem ********************************
import java.util.Scanner;

public class Main {
    
    static int calculate(int size, int div[], int rem[]) {
        int j, x = 1;
        while (true) {
            for (j = 0; j < size; j++) {
                if (x % div[j] != rem[j])
                    break;
            }
            if (j == size)
                return x;
            x++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of divisors: ");
        int size = sc.nextInt();
        int[] div = new int[size];

        System.out.println("Enter the divisors:");
        for (int i = 0; i < size; i++) {
            div[i] = sc.nextInt();
        }

        System.out.println("Enter the remainders:");
        int[] rem = new int[size];
        for (int i = 0; i < size; i++) {
            rem[i] = sc.nextInt();
        }

        int result = calculate(size, div, rem);
        System.out.println("The number is: " + result);
        sc.close();
    }
}

*******************************************************************COMBINATION ******************************************************

import java.util.*;

public class CombinationExample {
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

        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(9);
        numbers.add(12);
        numbers.add(19);
        numbers.add(61);
        numbers.add(19);

        int n = numbers.size();
        int r = 2;

        int result = fact(n) / (fact(r) * fact(n - r));
        System.out.println("The combination value for the numbers list is: " + result);
    }
}

********************************************************************************conversions*********************

	--string to int
String str = "123";
        int number = Integer.parseInt(str);

-----------------int to string
int x =77;
            String str = String.valueOf(x)

-----------------------int to binary----------
int num = 42;
String binaryString = Integer.toString(num, 2);
-----------------------------------------------------binary to int
String binaryString = "101010";
int num = Integer.parseInt(binaryString, 2);

*******************************************************************distinct sorted permutations with duplicates allowed****************
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Calculating factorial of a number
    private static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f = f * i;
        return f;
    }

    // Method to print the array
    private static void print(char[] temp) {
        for (int i = 0; i < temp.length; i++)
            System.out.print(temp[i]);
        System.out.println();
    }

    private static void nextPermutation(char[] temp, int n) {
        int i;
        for (i = n - 1; i > 0; i--) {
            if (temp[i] > temp[i - 1]) {
                break;
            }
        }

        // Base case: no next permutation
        if (i == 0) {
            return;
        }

        int min = i;
        int j, x = temp[i - 1];
        for (j = i + 1; j < n; j++) {
            if ((temp[j] < temp[min]) && (temp[j] > x)) {
                min = j;
            }
        }

        char temp_to_swap = temp[i - 1];
        temp[i - 1] = temp[min];
        temp[min] = temp_to_swap;

        Arrays.sort(temp, i, n);

        // Print the String
        print(temp);

        nextPermutation(temp, n);
    }

    private static void printAllPermutations(String s) {
        char temp[] = s.toCharArray();
        Arrays.sort(temp);
        print(temp);

        int total = factorial(temp.length);
        for (int i = 1; i < total; i++) {
            nextPermutation(temp, temp.length);
        }
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        printAllPermutations(s);
    }
}
************************ EULERS PHI **********************************************

package CAT1;
import java.util.*;

public class Euler_phi {

    // Returns the value of Euler's totient function phi(n)
 public static int phi(int n) {
 int result = n; // Initialize result as n
 
// Check for all prime factors of n and subtract their multiples from result
 for (int p = 2; p * p <= n; p++) {
 if (n % p == 0) { // p is a prime factor of n
while (n % p == 0) { // Remove all multiples of p from n
 n /= p;
 }
 result -= result / p;
 }
 }
  // If n has a prime factor greater than sqrt(n), then add its contribution
  if (n > 1) {
  result -= result / n;
  } 
 return result;
  }

    // Main method to test the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int phi_n = phi(n);
        System.out.println("phi(" + n + ") = " + phi_n);
        sc.close();
    }
}

******************************************************** EUCLIDEAN GCD *****************************************************
import java.util.*;

public class Main {
    public static int GCD(int number1, int number2) {
        if (number2 == 0) {
           return number1;
        }
        return GCD(number2, number1 % number2);
     }
   public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
      int number_1 = inp.nextInt();
      int number_2 = inp.nextInt();
      int gcd = GCD(number_1, number_2);
      System.out.println("G.C.D of "+" "+number_1+" & "+number_2 +" is: "+gcd);
      int lcm = (number_1 * number_2) / gcd;
      System.out.println("L.C.M of "+" "+number_1+" & "+number_2 +" is: "+lcm);
   }
}



****************************************************************** Hour Glass in Matrix **********************************************
// Java program to find maximum
// sum of hour glass in matrix
import java.io.*;
import java.util.Scanner;
public class Rough{
// Returns maximum sum of
// hour glass in ar[][]
static int findMaxSum(int [][]mat,int R,int C)
{
	if (R < 3 || C < 3){
		System.out.println("Not possible");
		System.exit(0);
	}

	// Here loop runs (R-2)*(C-2)
	// times considering different
	// top left cells of hour glasses.
	int max_sum = Integer.MIN_VALUE;
	for (int i = 0; i < R - 2; i++)
	{
		for (int j = 0; j < C - 2; j++)
		{
			// Considering mat[i][j] as top
			// left cell of hour glass.
			int sum = (mat[i][j] + mat[i][j + 1] +
					mat[i][j + 2]) + (mat[i + 1][j + 1]) +
					(mat[i + 2][j] + mat[i + 2][j + 1] +
					mat[i + 2][j + 2]);

			// If previous sum is less than
			// current sum then update
			// new sum in max_sum
			max_sum = Math.max(max_sum, sum);
		}
	}
	return max_sum;
}

	static public void main (String[] args)
	{
        Scanner inp = new Scanner(System.in);
        int R = inp.nextInt();
        int C = inp.nextInt();
		int [][]mat = new int[R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                mat[i][j]=inp.nextInt();
            }
        }
		int res = findMaxSum(mat,R,C);
		System.out.println("Maximum sum of hour glass = "+ res);
	}
	
}

***************************************************************HAMILTONIAN CYCLE **************************************************************

package FAT;

import java.util.Scanner;

public class HamiltonianCycle {
    final int V = 5;
    int path[];

    boolean isSafe(int v, int graph[][], int path[], int pos) {
        if (graph[path[pos - 1]][v] == 0)
            return false;
        for (int i = 0; i < pos; i++)
            if (path[i] == v)
                return false;
        return true;
    }

    boolean hamCycleUtil(int graph[][], int path[], int pos) {
        if (pos == V) {
            if (graph[path[pos - 1]][path[0]] == 1)
                return true;
            else
                return false;
        }
        for (int v = 1; v < V; v++) {
            if (isSafe(v, graph, path, pos)) {
                path[pos] = v;
                if (hamCycleUtil(graph, path, pos + 1))
                    return true;
                path[pos] = -1;
            }
        }
        return false;
    }

    void hamCycle(int graph[][]) {
        path = new int[V];
        for (int i = 0; i < V; i++)
            path[i] = -1;
        path[0] = 0;

        if (!hamCycleUtil(graph, path, 1)) {
            System.out.println("\nSolution does not exist");
            return;
        }

        printSolution(path);
    }

    void printSolution(int path[]) {
        System.out.println("Solution Exists: Following is one Hamiltonian Cycle");
        for (int i = 0; i < V; i++)
            System.out.print(" " + path[i] + " ");
        System.out.println(" " + path[0]);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        HamiltonianCycle hamiltonian = new HamiltonianCycle();

        int[][] graph1 = new int[hamiltonian.V][hamiltonian.V];
        int[][] graph2 = new int[hamiltonian.V][hamiltonian.V];

        System.out.println("Enter the adjacency matrix for graph1:");
        for (int i = 0; i < hamiltonian.V; i++) {
            for (int j = 0; j < hamiltonian.V; j++) {
                graph1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the adjacency matrix for graph2:");
        for (int i = 0; i < hamiltonian.V; i++) {
            for (int j = 0; j < hamiltonian.V; j++) {
                graph2[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        hamiltonian.hamCycle(graph1);
        hamiltonian.hamCycle(graph2);
    }
}

*******************************************************************Josephus Problem**************************************************
import java.util.*;

public class Main {
    static int Josephus(ArrayList<Integer> person, int k, int index) {
        if (person.size() == 1) {
            return person.get(0);
        }
        index = ((index + k) % person.size());
        person.remove(index);
        return Josephus(person, k, index);
    }

    static int solve(int N, int K) {
        K = K - 1;
        int index = 0;
        ArrayList<Integer> person = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            person.add(i);
        }
        return Josephus(person, K, index);
    }

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int k = inp.nextInt();
        int ans = solve(n,k);
        System.out.println(ans);
    }
}



----------------------------------- "Knight's Tour"  using backtracking.----------------------------------------

import java.util.Scanner;

public class Main {
    static int[] x = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] y = {2, 1, -1, -2, -2, -1, 1, 2};

    static boolean isSafe(int a, int b) {
        return (a >= 0 && a < 8 && b >= 0 && b < 8);
    }

    static boolean traverse(int posX, int posY, int count, int[][] arr, boolean[][] visited) {
        arr[posX][posY] = count;
        visited[posX][posY] = true;
        if (count == 64)
            return true;
        if (count > 64)
            return false;
        for (int i = 0; i < 8; i++) {
            int x_axis = posX + x[i];
            int y_axis = posY + y[i];
            if (isSafe(x_axis, y_axis) && !visited[x_axis][y_axis] && traverse(x_axis, y_axis, count + 1, arr, visited)) {
                return true;
            }
        }
        arr[posX][posY] = 0;
        visited[posX][posY] = false;
        return false;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Test Case: ");
        int t = inp.nextInt();

        while (t-- > 0) {
            int posX, posY;
            System.out.print("Enter the position: ");
            posX = inp.nextInt();
            posY = inp.nextInt();
            int count = 1;
            int[][] arr = new int[8][8];
            boolean[][] visited = new boolean[8][8];

            if (traverse(posX, posY, count, arr, visited)) {
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Not possible to cover");
            }
        }
    }
}





*****************************************************************karatsuba Multiply******************************************
import java.util.Scanner;

public class Main {
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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (x): ");
        long x = scanner.nextLong();

        System.out.print("Enter the second number (y): ");
        long y = scanner.nextLong();

        long product = karatsubaMultiply(x, y);
        System.out.println("Product: " + product);
        scanner.close();
}
}

*************************************************** Leaders in the array*************************************
import java.util.Scanner;

public class Main {

    // Method to find leaders in the array
    static void findLeaders(int arr[], int size) {

        // Logic Implementation
        int rightMaximum = arr[size - 1];

        // Here we have started loop from size-2
        // as the rightmost element is always a leader
        System.out.print(rightMaximum + " ");
        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] > rightMaximum) {
                rightMaximum = arr[i];
                System.out.print(rightMaximum + " ");
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int m = scanner.nextInt();
        int array[] = new int[m];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < m; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Leaders in the array are:");
        findLeaders(array, m);
        scanner.close();
    }
}


*******************************************************************Maneuvering a cave**************************************************
import java.util.*;
import java.math.*;
public class Main {
    static int count =0,m,n;
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      m= sc.nextInt();
      n= sc.nextInt();
      findWays(1,1);
      System.out.println(count);
    }
    
    static void findWays(int i, int j) {
        if(i>m || j>n)
            return;
        if(i==m && j==n){
            count++;
        }
        findWays(i, j+1);
        findWays(i+1,j);
    }
}




*********************************************************************Maximum length of the sequence with 1s(Flip)*****************************
import java.util.Scanner;

public class Main{
    public static int singleFlipMaxOnes(int number) {
        if (~number == 0)
            return 32;

        int curr = 0, prev = 0, max_size = 0;
        while (number != 0) {
            if ((number & 1) == 1)
                curr++;
            else if ((number & 1) == 0) {
                prev = (number & 2) == 0 ? 0 : curr;
                curr = 0;
            }
            max_size = Math.max(prev + curr, max_size);
            number >>= 1;
        }
        return max_size + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an unsigned integer number: ");
        int number = scanner.nextInt();

        int max_length = singleFlipMaxOnes(number);
        System.out.println("Maximum length of the sequence with 1s: " + max_length);
        scanner.close();
    }
}


**************************************************************************Maximum product*****************************************
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int max = a[0], m = a[0], min = a[0], temp = 0;
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

        System.out.println("Maximum product = " + m);
        scanner.close();
    }
}


************************************************Max Equilibrium Sum***********************************************************
import java.util.Scanner;

public class Rough {
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int maxSum = getMaxEquilibriumSumOptimized(arr);
        System.out.println("Max Equilibrium Sum : " + maxSum);
    }
}



**************************************************************** Majority element ******************************************************
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // Function to find Majority element in an array
    static void findMajority(int arr[], int n) {
        int maxCount = 0;
        int index = -1; // sentinels
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            // update maxCount if count of current element is greater
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        // if maxCount is greater than n/2, return the corresponding element
        if (maxCount > n / 2)
            System.out.println("Majority Element: " + arr[index]);
        else
            System.out.println("No Majority Element");
    }

    // Driver code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Function calling
        findMajority(arr, n);
        scanner.close();
    }
}


*******************************************************************Maneuvering a cave**************************************************
import java.util.*;
import java.math.*;
public class Main {
    static int count =0,m,n;
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      m= sc.nextInt();
      n= sc.nextInt();
      findWays(1,1);
      System.out.println(count);
    }
    
    static void findWays(int i, int j) {
        if(i>m || j>n)
            return;
        if(i==m && j==n){
            count++;
        }
        findWays(i, j+1);
        findWays(i+1,j);
    }
}



*************************************************************** moveHyphenToBeginning   ***************************************************************
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        String originalString = inp.nextLine();
        String transformedString = moveHyphenToBeginning(originalString);
        System.out.println(transformedString);
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
*************************************************************** Manacher's Algorithm  ****************************************
import java.util.*;

public class Main
{
	static void findLongestPalindromicString(String text)
	{
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

		// Uncomment it to print LPS Length array
		// printf("%d %d ", L[0], L[1]);
		for (i = 2; i < N; i++)
		{

			// get currentLeftPosition iMirror
			// for currentRightPosition i
			iMirror = 2 * C - i;
			L[i] = 0;
			diff = R - i;

			// If currentRightPosition i is within
			// centerRightPosition R
			if (diff > 0)
				L[i] = Math.min(L[iMirror], diff);

			// Attempt to expand palindrome centered at
			// currentRightPosition i. Here for odd positions,
			// we compare characters and if match then
			// increment LPS Length by ONE. If even position,
			// we just increment LPS by ONE without
			// any character comparison
			while (((i + L[i]) + 1 < N && (i - L[i]) > 0) &&
							(((i + L[i] + 1) % 2 == 0) ||
						(text.charAt((i + L[i] + 1) / 2) ==
						text.charAt((i - L[i] - 1) / 2))))
			{
				L[i]++;
			}

			if (L[i] > maxLPSLength) // Track maxLPSLength
			{
				maxLPSLength = L[i];
				maxLPSCenterPosition = i;
			}

			// If palindrome centered at currentRightPosition i
			// expand beyond centerRightPosition R,
			// adjust centerPosition C based on expanded palindrome.
			if (i + L[i] > R)
			{
				C = i;
				R = i + L[i];
			}

			// Uncomment it to print LPS Length array
			// printf("%d ", L[i]);
		}

		start = (maxLPSCenterPosition - maxLPSLength) / 2;
		end = start + maxLPSLength - 1;
		System.out.printf("LPS of string is %s : ", text);
		for (i = start; i <= end; i++)
			System.out.print(text.charAt(i));
		System.out.println();
	}

	// Driver Code
	public static void main(String[] args)
	{
        Scanner inp = new Scanner(System.in);
		String text = inp.nextLine();
		findLongestPalindromicString(text);

	}
}


******************************************************************************N Queens*******************************************************************************
import java.util.*;

public class Main {
    // A utility function to print solution
    void printSolution(int board[][], int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j] + " ");
            System.out.println();
        }
    }

    // A utility function to check if a queen can be placed on board[row][col].
    // Note that this function is called when "col" queens are already placed
    // in columns from 0 to col -1. So we need to check only the left side for attacking queens.
    boolean isSafe(int board[][], int row, int col, int N) {
        int i, j;

        // Check this row on the left side
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        // Check upper diagonal on the left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    boolean solveNQUtil(int board[][], int col, int N) {
        if (col >= N)
            return true;

        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col, N)) {
                // Place this queen in board[i][col]
                board[i][col] = 1;

                if (solveNQUtil(board, col + 1, N))
                    return true;

                board[i][col] = 0; // BACKTRACK
            }
        }

        // If the queen cannot be placed in any row in this column col, then return false
        return false;
    }

    void solveNQ(int N) {
        int board[][] = new int[N][N];

        // Initialize the board with all zeros
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = 0;
            }
        }

        if (!solveNQUtil(board, 0, N)) {
            System.out.print("Solution does not exist");
            return;
        }

        printSolution(board, N);
    }

    // Driver program to test the Main class
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        Main queenSolver = new Main();
        queenSolver.solveNQ(N);
    }
}





*****************natural order********************************
..................1st Method.......................

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> values = new ArrayList<>();

        System.out.print("Enter the number of values: ");
        int numValues = scanner.nextInt();

        for (int i = 0; i < numValues; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            int value = scanner.nextInt();
            values.add(value);
        }

        // naturalOrder is a static method
        values.sort(Comparator.naturalOrder());

        // print sorted numbers based on natural order
        System.out.println("Sorted values: " + values);
        for(int i:values){
            System.out.println(i);
        }

        scanner.close();
    }
}

---------------------------2nd Method------------------------------------------
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of banks: ");
        int numBanks = scanner.nextInt();

        List<Bank> banks = new ArrayList<>();
        for (int i = 0; i < numBanks; i++) {
            System.out.print("Enter the name of bank " + (i + 1) + ": ");
            String name = scanner.next();
            System.out.print("Enter the ranking of bank " + (i + 1) + ": ");
            int ranking = scanner.nextInt();

            Bank bank = new Bank(name, ranking);
            banks.add(bank);
        }

        // print banks in unsorted order
        System.out.println("List of Banks in unsorted order: " + banks);

        // Sort banks on their natural order, which is ranking
        Collections.sort(banks);

        // print banks in their natural order, sorted
        System.out.println("List of Banks in sorted order: " + banks);

        scanner.close();
    }
}

class Bank implements Comparable<Bank> {

    private String name;
    private int ranking;

    public Bank(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    @Override
    public int compareTo(Bank bank) {
        return this.ranking - bank.ranking; // possible because ranking is small positive integer
    }

    @Override
    public String toString() {
        return String.format("%s: %d", name, ranking);
    }

}




*******************************************************************Permutation **************************************************
package FAT;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Permutations {
    static int count=0;
    public static void main(String[] args) {
        String input = "ABBCCD";
        distinctPermutations(input);
        System.out.println(count);
    }

    public static void distinctPermutations(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        input = new String(chars);
        permute(input.toCharArray(), 0);
    }

    public static void permute(char[] chars, int index) {
        if (index == chars.length - 1) {
            count++;
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


********************* (Segmented and Simple and incremnetal Sieve )Prime Factors********************************
import java.util.Scanner;

class Main {
    static int array[];
    static int primes[];

    public static void calculate(int n, int m) {
        int j = 0;
        int sqt = (int) Math.sqrt(m);
        array = new int[sqt + 1];
        primes = new int[sqt + 1];
        initialise(sqt + 1);

        for (int i = 2; i <= sqt; i++) {
            if (array[i] == 1) {
                primes[j] = i;
                j++;

                for (int k = i + i; k <= sqt; k += i) {
                    array[k] = 0;
                }
            }
        }

        int diff = (m - n + 1);
        array = new int[diff];
        initialise(diff);

        for (int k = 0; k < j; k++) {
            int div = n / primes[k];
            div *= primes[k];

            while (div <= m) {
                if (div >= n && primes[k] != div)
                    array[div - n] = 0;
                div += primes[k];
            }
        }

        for (int i = 0; i < diff; i++) {
            if (array[i] == 1 && (i + n) != 1)
                System.out.println(i + n);
        }
    }

    public static void initialise(int sqt) {
        for (int i = 0; i < sqt; i++) {
            array[i] = 1;
        }
    }

    public static void main(String arg[]) {
        int t, n, m;
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();
        calculate(n, m);
        System.out.println();

        in.close();
    }
}



**********************************************************************Rat Maze**************************************************************************


import java.util.Scanner;

public class RAT_IN_MAZE {

    static boolean canMove(int[][] maze, int x, int y, int n) {
        return x < n && y < n && maze[x][y] == 1;
    }

    static boolean ratInMaze(int[][] maze, int x, int y, int n, int[][] visited) {
        if (x == n - 1 && y == n - 1) {
            visited[x][y] = 1;
            return true;
        }

        if (canMove(maze, x, y, n)) {
            visited[x][y] = 1;

            if (ratInMaze(maze, x + 1, y, n, visited)) {
                return true;
            }

            if (ratInMaze(maze, x, y + 1, n, visited)) {
                return true;
            }

            visited[x][y] = 0;
            return false;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n Value: ");
        int n = sc.nextInt();

        int[][] maze = new int[n][n];
        int[][] visited = new int[n][n];

        System.out.println("Enter the path of a Maze:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        System.out.println("OUTPUT:");
        if (ratInMaze(maze, 0, 0, n, visited)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(visited[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}




********************Strobogrammatic***************************
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
        static boolean isStrobogrammatic(String num) {
                Map<Character, Character> map = new HashMap<Character, Character>();
                map.put('6', '9');
                map.put('9', '6');
                map.put('0', '0');
                map.put('1', '1');
                map.put('8', '8');
                int l = 0, r = num.length() - 1;
                while (l <= r) {
                        if (!map.containsKey(num.charAt(l)))
                                return false;
                        if (map.get(num.charAt(l)) != num.charAt(r))
                                return false;
                        l++;
                        r--;
                }
                return true;
        }

        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Give num :");
                String n = sc.next();
                System.out.println(isStrobogrammatic(n));

        }
}




*********************************************************swapNibbles***************************
import java.util.*;
class Main {
     
    static int swapNibbles(int x)
    {
        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
    }
     
    // Driver code
    public static void main(String arg[])
    {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        System.out.print(swapNibbles(x));
    }
    }




******************************************************************* SORT *********************************************

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array
            int partitionIndex = partition(arr, low, high);

            // Recursively sort the sub-arrays
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}





*********************************************Toogle a switich *************************

// DOORS
import java.util.*;

public class Main {
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
                System.out.println("No Of Doors open" + c);
                System.out.println("No Of Doors closed" + o);
        }
}





************************************************************************ Weighted Substring *************************************************

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Weighted_SubString {
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






***************************Warnsdorff’s Algorithm –Knight’s Tour Problem****************************************************************


import java.util.Scanner;

class KnightTour {
	static int N;

	static boolean isSafe(int x, int y, int sol[][]) {
		return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
	}

	static void printSolution(int sol[][]) {
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < N; y++)
				System.out.print(sol[x][y] + " ");
			System.out.println();
		}
	}

	static boolean solveKT() {
		int sol[][] = new int[N][N];

		for (int x = 0; x < N; x++)
			for (int y = 0; y < N; y++)
				sol[x][y] = -1;

		int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
		int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

		sol[0][0] = 0;

		if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
			System.out.println("Solution does not exist");
			return false;
		} else
			printSolution(sol);

		return true;
	}

	static boolean solveKTUtil(int x, int y, int movei,
			int sol[][], int xMove[],
			int yMove[]) {
		int k, next_x, next_y;
		if (movei == N * N)
			return true;

		for (k = 0; k < N; k++) {
			next_x = x + xMove[k];
			next_y = y + yMove[k];
			if (isSafe(next_x, next_y, sol)) {
				sol[next_x][next_y] = movei;
				if (solveKTUtil(next_x, next_y, movei + 1,
						sol, xMove, yMove))
					return true;
				else
					sol[next_x][next_y] = -1;
			}
		}

		return false;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		N = scanner.nextInt();
		scanner.close();

		solveKT();
	}
}
