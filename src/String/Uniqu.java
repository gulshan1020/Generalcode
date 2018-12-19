package String;

public class Uniqu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "defg";
		boolean val = isUniqueChar(str);
		System.out.println(val);

	}
	
	public static boolean isUniqueChar(String str){
		if(str.length()> 128) return false;
		boolean[] char_set = new boolean[128];
		System.out.println(char_set);
		for(int i = 0; i < str.length(); i++){
			int val = str.charAt(i);
			System.out.println(val);
			if(char_set[val]){
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
	

}
