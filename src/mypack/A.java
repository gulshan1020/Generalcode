package mypack;

public class A {
	private int x;
	protected int y;
	/**
	 * @param x
	 */
	public A(int x,int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 
	 */
	public A() {
		super();
		// TODO Auto-generated constructor stub
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

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
}
