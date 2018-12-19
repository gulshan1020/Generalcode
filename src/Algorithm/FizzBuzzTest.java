package Algorithm;

import java.util.Scanner;

public class FizzBuzzTest {
	
	public static  void print(int n){
		for(int i=1;i<=n;i++){
			if(!(i%5==0) && i%3==0){
				
				System.out.println("fizz");
				continue;
			}
			if(!(i%3==0)&& i%5==0){
				System.out.println("buzz");
				continue;
				
			}
			if(i%3==0 && i%5==0){
				System.out.print("fizzbuzz");
				continue;
				
			}
			else {
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);

	}

}
