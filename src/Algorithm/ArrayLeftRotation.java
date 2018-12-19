package Algorithm;

public class ArrayLeftRotation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4,5};
		for(int j=0;j<3;j++) {
			int temp=arr[0];
		for(int i=0;i<=arr.length-2;i++){
			arr[i] = arr[i+1];
			if(i+1 == arr.length-1){
				arr[i+1] = temp;
			}
		}
		}
		for(int i:arr){
			System.out.println(i);
		}
	}
}
