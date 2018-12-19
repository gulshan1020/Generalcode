package Algorithm;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[4]=5;
		int s = 0;
		int idx =-1;

		for(int i=0;i<arr.length;i++){
			//System.out.println(arr[i]);
			if (arr[i] == 0)
		    {
		         idx = i; 
		    }
		    else 
		    {
		         s += arr[i];
		    }
		}
		int sum = (arr.length+1)*arr.length/2;
		System.out.println("missing number is: " + (sum - s) + " at index " + idx);
	}

}
