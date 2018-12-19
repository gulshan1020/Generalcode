package DesignPattern;

public class Singleton {

	public static void main(String[] args) throws Exception {
		try{
			int i = 10/0;
			
		}catch(Exception ex){
			if(ex!=null)
			{
				System.out.println(ex.toString());
				throw new Exception("go to hell");
			}
			
		}

	}

}
