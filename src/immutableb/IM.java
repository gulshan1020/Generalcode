package immutableb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class IM {
	private final List<Integer> li;// = new ArrayList<Integer>(Arrays.asList(1,3));
	
	public IM(List<Integer> lii){
	//	li = new ArrayList();
		// lii = new ArrayList<Integer>();
		//lii.add(6);
		//lii.add(7);
		this.li = lii;
	}
	
	/**
	 * @return the li
	 */
	public  List<Integer> getLi() {
		//List<Integer> ii = new ArrayList<Integer>();
		//i.set(index, element)
		return new ArrayList<Integer>(this.li);
		//return Collections.unmodifiableList(this.li);
	}

	/*public static void main(String[] args){
		//li = new ArrayList();
		//li.addAll(Arrays.asList(1,3)); 
		li.add(4);
		System.out.println(li);
	}
*/
	
}
