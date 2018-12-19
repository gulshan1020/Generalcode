package mypack;

import java.util.ArrayList;
import java.util.List;

public class Immutabletest {

	public static void main(String[] args) {
		//Immutable t = new Immutable();
	    final ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("cde");
		for(int i=0;i<list.size();i++){
			
			System.out.println(list.get(i));
		}
				

	}

}
