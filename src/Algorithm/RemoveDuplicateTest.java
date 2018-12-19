package Algorithm;

import java.util.Scanner;

public class RemoveDuplicateTest {

	public static void removedup(int[] arr){
		int t;
		for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]==arr[j]){
				arr[j]=0;
				
			}
		}
	}
		for(int i:arr)
		System.out.println(i);
		// remove zero from array
		removeZero(arr);
	}
	public static void removeZero(int[] arr){
		// TODO Auto-generated method stub
		int[] tt = null;
		int count = 0;
		int j=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				System.out.println("coubtfff"+count);
				count++;
			}
		}
		if(count>0){
		 tt = new int[count];
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				continue;
			}
			if(arr[i]>0){
				System.out.println("siiii:"+tt.length);
				tt[j] = arr[i];
				if(j>tt.length-1){
					break;
				}
				j++;
			}
			
		}
		}
		else if(count==0){
		tt = new int[(arr.length)];
		for(int i=0;i<arr.length;i++){
			tt[i]=arr[i];
			}
			
		}
		
		for(int k=0;k<tt.length;k++){
			System.out.println(tt[k]);
		}
		System.out.println("length of tt:"+tt.length);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		removedup(arr);

	}

}
