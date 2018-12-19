package mypack3;

import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[3];
		Scanner in = new Scanner(System.in);
		int arraysize = in.nextInt();
		for(int i=0;i<arraysize;i++){
			arr[i] = Integer.parseInt(in.nextLine());
		}
		
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
				
	}

}
