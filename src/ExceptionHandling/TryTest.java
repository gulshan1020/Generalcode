package ExceptionHandling;

public class TryTest {
	public void nn(){
	try{
		return;
	}finally{
		System.out.println(method(10));
	}
	}
	
	public  int method(int i){
		try{
			return i;
		}finally{
			return (i*2);
		}
	}
}
