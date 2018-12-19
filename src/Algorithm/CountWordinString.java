package Algorithm;

import java.util.Scanner;

public class CountWordinString {
	
	private static int countword(String str){
		char[] ch = str.toCharArray();
		int count = 0;
		for(int i=0;i<str.length();++i){
			if(ch[i] == ' '){
				count++;	
			}
		}
		
		return count+1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input String:");
		String str = sc.nextLine();
		//System.out.println(str);
		
		int no  = countword(str);
		System.out.println(no);
		sc.close();
		
		
				

	}

}
