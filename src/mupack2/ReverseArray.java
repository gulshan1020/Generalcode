package mupack2;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {5,7,2,4,6};
		for(int i=0;i<arr.length/2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}

		for(int  a:arr){
			System.out.println(a);
		}
	}

}
