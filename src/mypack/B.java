package mypack;

public class B extends A {
	private int x;

	/**
	 * @param x
	 * @param y
	 * @param x2
	 */
	public B(int x, int y, int x2) {
		super(x, y);
		x = x2;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
}