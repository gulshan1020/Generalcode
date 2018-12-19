package DataStructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class BirthdayCake {
	
	private static void printcake(int n,int[] arr){
		//Map<Integer,Integer> ha = new HashMap<Integer,Integer>();
		int temp = arr[0],max=0, count=0;
		/*for(int i=1;i<n;i++){
			max = arr[i];
			if(max<=temp){
				temp=max;
				count++;
				break;
			}
			else{
				max = arr[i];
				count++;
				break;
			}
			
		}*/
		Arrays.sort(arr);
		for(int i:arr){
			System.out.println(i);
		}
		System.out.println("max:" +max);
		max = arr[arr.length-1];
		for(int i=0;i<n;i++){
			if(arr[i]==max){
				count++;
			}
			
		}
		
		System.out.println("count:" +count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entere thye array size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		 printcake(n,arr);
	} 

}
