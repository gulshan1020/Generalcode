package Algorithm;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {5,6,3,8,1,9};
		int temp,key,j;
		for(int i=1; i<arr.length;i++){
			key = arr[i];
			j = i-1;
			while(j>=0 && key<arr[j]){
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
			}
		}
		for(int k = 0; k<arr.length;k++){
			System.out.println(arr[k]);
		}
		

	}

}
