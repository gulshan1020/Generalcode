package Mypack5;

public class ArrayTest {

	public static void main(String[] args) {
			int[] a = {1,10,3,4,2,8};
			int sum = 0,temp=0,add=0;
			for(int i=0;i<a.length-1;i++){
				
				for(int j=i+1;j<a.length-1;j++){
				temp = a[i]+a[j];
				if(sum>temp){
					add=temp;
				}
				sum=add;
				}
				
				
			}
			System.out.println(add);

	}

}
