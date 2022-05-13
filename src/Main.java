import java.util.*;
/** 
 * 
 * @author Michael
 */

class GFG
{
// No of rows and column
static final int N = 5;

// structure for pair
static class Pair
{
	int first , second;
        
        /**
         * It is a constructor
         * @param f
         * @param s 
         */
	
	public Pair(int f, int s)
	{
		first = f;
		second = s;
	}
}

// Function to find the column
// with max sum
/**
 * 
 * @param mat
 * @return 
 */
static Pair colMaxSum(int mat[][])
{
	// Variable to store index of
	// column with maximum
	int idx = -1;

	// Variable to store max sum
	int maxSum = Integer.MIN_VALUE;

	// Traverse matrix column wise
	for (int i = 0; i < N; i++)
	{
		int sum = 0;

		// calculate sum of column
		for (int j = 0; j < N; j++)
		{
			sum += mat[j][i];
		}

		// Update maxSum if it is
		// less than current sum
		if (sum > maxSum)
		{
			maxSum = sum;

			// store index
			idx = i;
		}
	}

	Pair res;

	res = new Pair(idx, maxSum);

	// return result
	return res;
}

// Driver code

}

