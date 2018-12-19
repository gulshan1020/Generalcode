package Singleton;

import java.util.StringTokenizer;

public class SingletonTest {
	
	public static void main(String[] args) {
		// ;// = new SingletonD();
		// System.out.println(SingletonEnum.getInstance());
		// System.out.println(SingletonEnum.getInstance().valueOf(Instance, "abc"));
		String str = "Ram went to Rameshwaram with his friend Shriram";
		StringTokenizer stk = new StringTokenizer(str," ");
		int count = 0;
		while(stk.hasMoreTokens()) { 
			//stk.nextToken();
			//System.out.println(stk);
			if(stk.nextToken().contains("ram")){
				count++;
			}
			System.out.println(count);
		}
		
		/*for(int i=0;i<str.length();i++) { 
			char ch = str.charAt(i);
			int count =0;
			int j=0;
			if(str.equals(" "))
				count++;
			
			if(str.contains("Ram"))
				count++;
				
			System.out.println(count);
			
		}
*/
	}

}
