/**
 * 
 */
package maypack4;

/**
 * @author Gulshan
 *
 */
public enum Currency {
	
	PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
	private int value;
	private Currency(int value) {
		this.value=value;;
	}
	/**
	 * @return the value
	 */
//	public int getValue() {
//		return value;
//	}
//	/**
//	 * @param value the value to set
//	 */
//	public void setValue(int value) {
//		this.value = value;
//	}
};
