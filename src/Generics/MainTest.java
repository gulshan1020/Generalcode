package Generics;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		classA a= new classA();
		ClassB b= new ClassB();
		ClassD d= new ClassD();
		
		// TODO Auto-generated method stub
		//List<Integer> lii = new ArrayList<Integer>();
		List<? extends ClassD> li;
		//List<?> liii;
		//li.add(d);//= new ArrayList<? extends ClassD>();
		li.add(a);
		li.add(b);
		System.out.println(li.size());
		/*for(List<? super ClassD> Object:li){
			System.out.println(y(Object).getClass().getName());
		}*/

	}

}
