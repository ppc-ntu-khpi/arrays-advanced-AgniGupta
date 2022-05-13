//package test;
/**
 * 
 * @author Michael
 */

public class Test {

    /**
     * main
     * @param args 
     */
    public static void main(String[] args)
{
	int mat[][ ] = { { 1, 2, 3, 4, 5 },
					       { 5, 3, 1, 4, 2 },
					       { 5, 6, 67, 8, 9 },
					       { 0, 6, 33, 4, 12 },
					       { 9, 7, 12, 4, 3 }};
  
  int first = GFG.colMaxSum(mat).first + 1;
  int second = GFG.colMaxSum(mat).second;
  
	System.out.println("Column " + first + " has max sum " + second);
}
}
