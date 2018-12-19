package Algorithm;

public class CountCharTetst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "wae";
		boolean f = count(s);
		System.out.println(f);
	}
	private static  boolean count(String s){
		if(s.length()>128) return  false;
		char[] ch = s.toCharArray();
		boolean[] c = new boolean[128];
		int count = 0;
		for(int i=0;i<ch.length;i++){
			int  value = ch[i];
			if(c[value]){
				return false;
				
			}
		//	count++;
			c[value] = true;
		}
		System.out.println(count);
		return true;
		
		
	}

}
