package Algorithm;

public class ReverseStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "ritu";
		rev(st);
		

	}
	
	private static void rev(String st){
		char[] ss = st.toCharArray();
		char[] sss = new char[ss.length];
		int j = 0;
	//	System.out.println(ss.length);
		for(int i = ss.length-1;i>=0;i--){
			if(i>=0){
				sss[j] = ss[i];
				j++;
			}
		}
		System.out.println(sss);
		System.out.println("j:"+j);
		
	}

}
