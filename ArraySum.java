/**
 * Recursion method class
 * @author Shenabeth Jenkins
 *
 */
public class ArraySum {

	public int sumOfArray(Integer[] myArray, int num) {
		//create base case
		if (num < 0)
			return 0;

		//recursion (adding the numbers in the array)
		return sumOfArray(myArray, num-1) + (myArray[num]);

	}
}
