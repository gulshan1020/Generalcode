package Algorithm;

import java.util.Scanner;

public class CountPosativeNegativeZero {
	
	static void countposativen(int[] arr){
		double negative=0,zero=0,posative=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				negative++;
			}
			if(arr[i]>0){
				posative++;
			}
			else if(arr[i]==0){
				zero++;
			}
		}
		System.out.println("negative:" +negative/arr.length  +  "posative:" +posative/arr.length   +   "zero: " +zero/arr.length);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("fd:" + 3/6);
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scn.nextInt();
		}
		countposativen(arr);
		scn.close();
	}

	
}
