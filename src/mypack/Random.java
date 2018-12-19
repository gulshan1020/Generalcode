package mypack;

public final class Random {
	public static  int[] getRandom() {
		int[] ran = new int[5];
		for(int i=0;i<5;i++) {
			 ran[i] = (int)(Math.random()*100);
			 System.out.println("random no :"+ ran[i]);
			 
		}
		compare(ran);
		return ran;
	}
	public static void compare(int[] array) {
		int i = array.length;
		int temp = 1;
		for(int j=0;j<i;j++) {
			if(array[j]>array[temp]) {
				System.out.println("array[i] is greater than array[i++]");
			}
			else if(array[j]==array[temp]) {
				System.out.println("array[i] is equal array[i++]");
			}
			else if(array[j]<array[temp]) {
				System.out.println("array[i] is less than array[i++]");	
			}
			if(temp>array.length) {
				break;
			}
			temp++;
		}
	}

	public static void main(String[] args) {
		getRandom();

	}

}
