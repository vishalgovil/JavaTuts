/*
 * 1D Array
 * 2D Array
 * Jagged Array
 */

public class Tel_17_Array {

	public static void main(String[] args) {
		int nums[] = new int[4]; // currently all have 0s inside them
		//System.out.println(nums[2]);
		
		int nums2[]= {8,9,10,11}; //another way to declare array 
		
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		nums[3]=4;
		
		System.out.println(nums[3]);
		
		//To print all values use loop
		
		for(int i=0;i<4;i++)
		{
			System.out.println(nums[i]);			
		}
		
		
		
		int a[]= {1,2,3,4};
		int b[]= {2,2,6,9};
		int c[]= {3,1,9,2};
		
		int d[][]= {
				{1,2,3,4},
				{2,2,6,9},
				{3,1,9,2}
		};
		
		
		
		// Printing 2D array
		for(int i=0;i<3;i++)
		{
		for (int j=0;j<4;j++)
		{
		System.out.print(" "+ d[i][j]);	
		}
		System.out.println();
		}
		
		System.out.println();
		System.out.println();
// Now if the length is not fixed which is also called as jagged array then this method can be used for printing	
		for(int i=0;i<d.length;i++)   // total rows
		{
		for (int j=0;j<d[i].length;j++) // length of cols in each row
		{
		System.out.print(" "+ d[i][j]);	
		}
		System.out.println();
		}	
		
		}
}
