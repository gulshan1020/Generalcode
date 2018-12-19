package Immutable;

import java.util.Date;

public final class  Immutable {
	private final Integer id;
	private final String str;
	private final Date date;
	
	private Immutable(Integer id,String str,Date dt){
		this.id = id;
		this.str = str;
		this.date = dt;
	}
	
	public static Immutable createImmutable(Integer id,String str,Date dt){
		return new Immutable(id,str,dt);
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the str
	 */
	public String getStr() {
		return str;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return new Date(date.getTime());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Immutable [id=" + id + ", str=" + str + ", date=" + date + "]";
	}
	
	

}
