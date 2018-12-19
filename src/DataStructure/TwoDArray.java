package DataStructure;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] arr = {{1,2,6},{3,4,8}};
		
		
		//System.out.println(arr[1][2]);
		// print 2-D array element
		
		System.out.println(arr.length);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
	}
}
