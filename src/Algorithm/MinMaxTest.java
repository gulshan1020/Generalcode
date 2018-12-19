package Algorithm;

import java.util.Scanner;

public class MinMaxTest {
	static void minMax(int[] arr){
		int sum=0,min=0,max=0,ch=0;
		int[] temp = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		//temp=sum-arr[0];
		for(int i=0;i<arr.length;i++){
			temp[i]=sum-arr[i];
		}
		//sort the array, 0 is minimum element index and array length - 1 index is maximum 
		for(int i=0;i<temp.length;i++){
			for(int j=0;j<temp.length-1-i;j++){
				if(temp[j]>temp[j+1]){
					ch=temp[j];
					temp[j] = temp[j+1];
					temp[j+1] = ch;
				}
			}
		}
		/*for(int i: temp){
			System.out.println(i);
		}*/
	
		System.out.println(temp[0]+" "+temp[arr.length-1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("fd:" + 3/6);
				Scanner scn = new Scanner(System.in);
				System.out.println("enter the size of array");
				int n = scn.nextInt();
				int[] arr = new int[n];
				for(int i=0;i<n;i++){
					arr[i] = scn.nextInt();
				}
				minMax(arr);
				scn.close();

	}

}
