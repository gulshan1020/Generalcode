package maypack4;

public class CurrencyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Currency coin = Currency.DIME;
		////(coin==Currency.DIME) {
		System.out.println(coin);
		//}
		
		for(Currency con: Currency.values()){ 
			System.out.println("coin: " + con);
			}

		

	}

}
