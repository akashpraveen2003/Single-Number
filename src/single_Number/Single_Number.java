package single_Number;

import java.util.Scanner;

/*
 Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.
 NOTE: Your algorithm should have a linear runtime complexity.
 */
public class Single_Number {
	
	private static void unique_element(int[] array) {
		
		int element=array[0];
		for(int i=1;i<array.length;i++)
		{
			element=element^array[i];
		}
		System.out.println(element);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int length=scanner.nextInt();
		int array[]=new int[length];
		for(int i=0;i<length;i++)
		{
			array[i]=scanner.nextInt();
		}
		unique_element(array);
	}
}
/*
 	Input
	A = [1, 2, 2, 3, 1]

	Output
	3
	
	Input
	A = [1, 2, 2]

	Output
	1
*/
