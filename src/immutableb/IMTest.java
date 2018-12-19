package immutableb;

import java.util.Arrays;

public class IMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//li = new ArrayList();
		//li.addAll(Arrays.asList(1,3));
		IM i = new IM(Arrays.asList(1,3));
		//i.getLi();
		//li.add(4);
		System.out.println(i.getLi().size());
		System.out.println(i.getLi().add(9));
		System.out.println(i.getLi().add(8));
		System.out.println(i.getLi());
		System.out.println(i.getLi().size());

	}

}
