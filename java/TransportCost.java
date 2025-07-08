// Ramu often uses public transport. The transport in the city is of two types: cabs and rickshaws. The city has n rickshaws and m cabs, the rickshaws are numbered by integers from 1 to n, the cabs are numbered by integers from 1 to m.

// Public transport is not free. There are 4 types of tickets:

// A ticket for one ride on some rickshaw or cab. It costs c1 ruppees;
// A ticket for an unlimited number of rides on some rickshaw or on some cab. It costs c2 ruppees;
// A ticket for an unlimited number of rides on all rickshaws or all cabs. It costs c3 ruppees;
// A ticket for an unlimited number of rides on all rickshaws and cabs. It costs c4 ruppees.

// Ramu knows for sure the number of rides he is going to make and the transport he is going to use. He asked you for help to find the minimum sum of ruppees he will have to spend on the tickets.


// Input Format
// Each Test case has 4 lines which are as follows:

// The first line contains four integers c1, c2, c3, c4 (1 ≤ c1, c2, c3, c4 ≤ 1000) — the costs of the tickets.
// The second line contains two integers n and m (1 ≤ n, m ≤ 1000) — the number of rickshaws and cabs Ramu is going to use.
// The third line contains n integers ai (0 ≤ ai ≤ 1000) — the number of times Ramu is going to use the rickshaw number i.
// The fourth line contains m integers bi (0 ≤ bi ≤ 1000) — the number of times Ramu is going to use the cab number i.


// Constraints
// 1 <= T <= 1000 , where T is no of testcases
// 1 ≤ c1, c2, c3, c4 ≤ 1000
// 1 ≤ n, m ≤ 1000
// 0 ≤ ai , bi ≤ 1000


// Output Format
// For each testcase , print a single number - the minimum sum of rupees Ramu will have to spend on the tickets in a new line.


// Sample Input
// 2
// 1 3 7 19
// 2 3
// 2 5
// 4 4 4
// 4 3 2 1
// 1 3
// 798
// 1 2 3
// Sample Output
// 12
// 1
// Explanation
// For the first testcase ,
// The total cost of rickshaws = min( min(2 * 1, 3) + min(5 * 1, 3), 7) = min(5, 7) = 5
// The total cost of cabs = min( min(4 * 1, 3) + min(4 * 1, 3) + min(4 * 1, 3) , 7) = min ( 9, 7) = 7
// Total final cost = min( totalCabCost + totalRickshawCost , c4) = min( 5 + 7, 19) = min ( 12, 19) = 12
// We print 12.


import java.util.Scanner;

public class TransportCost {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            // Read ticket costs
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();
            
            // Read number of rickshaws and cabs
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            // Read rickshaw usage
            int[] rickshawUsage = new int[n];
            for (int i = 0; i < n; i++) {
                rickshawUsage[i] = sc.nextInt();
            }
            
            // Read cab usage
            int[] cabUsage = new int[m];
            for (int i = 0; i < m; i++) {
                cabUsage[i] = sc.nextInt();
            }
            
            // Calculate minimum cost for rickshaw rides
            int rickshawCost = 0;
            for (int i = 0; i < n; i++) {
                rickshawCost += Math.min(rickshawUsage[i] * c1, c2);
            }
            rickshawCost = Math.min(rickshawCost, c3);
            
            // Calculate minimum cost for cab rides
            int cabCost = 0;
            for (int i = 0; i < m; i++) {
                cabCost += Math.min(cabUsage[i] * c1, c2);
            }
            cabCost = Math.min(cabCost, c3);
            
            // Calculate the total minimum cost
            int totalCost = Math.min(rickshawCost + cabCost, c4);
            
            // Print the result for this test case
            System.out.println(totalCost);
        }
        
        sc.close();
    }
}