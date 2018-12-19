/**
 * 
 */
package mypack3;

/**
 * @author Gulshan
 *
 */
public class ArraTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] ran = new int[5];
		int[] ran = {1,3,3,3,5};
		for(int i=0; i<ran.length;i++) {
			int j=i+1;
			//ran[i] = (int)(Math.random()*100);
			System.out.println(i +":" +ran[i]);
			if(j!=ran.length){
			if(ran[i]==ran[j]) {
				System.out.println("index:" +i + "index:" +j + "elements are equal");
			
			}
			}
		}

	}

}
