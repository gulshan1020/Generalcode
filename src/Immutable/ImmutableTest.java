package Immutable;

import java.util.Date;

public class ImmutableTest {

	public static void main(String[] args) {
	
		Immutable im = Immutable.createImmutable(100, "Gulshan", new Date());
		System.out.println(im);
		tryModification(im.getId(),im.getStr(),im.getDate());
		System.out.println(im);
	}
	private static void tryModification(Integer id, String str, Date dt)
    {
        id = 10000;
        str = "test changed";
        dt.setMonth(4);
    }

}
