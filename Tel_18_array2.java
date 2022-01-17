public class Tel_18_array2 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		
		for (int k :a)
		{
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println();
// for 2D array
		
		int d[][]= {
				{1,2,3,4},
				{2,2,6,9},
				{3,1,9,2}
		};
		for (int k[]:d)
		{
			for(int l:k)
			{
				
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}
	
}
