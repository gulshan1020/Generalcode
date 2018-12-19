package MapTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> m = new TreeMap<String,String>();
		m.put("a","ram");
		m.put("b","sorabh");
		//m.put(null, "ravi");
		//m.put(null, "sa");
		m.put("","aru");
		m.put("","nunu");
		System.out.println("size of map"+m.size());
		for(Map.Entry<String, String> entry :m.entrySet()) {
			System.out.println("key :" +entry.getKey() +"  "+ "value:" +entry.getValue());
		}
		

	}

}
