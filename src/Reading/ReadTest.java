package Reading ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class ReadTest {
	public static Map<String,Object> tokenmap(String input){
	Map<String,Object> map = new HashMap<String, Object>();
	List<String> value = new ArrayList<>();
	for(String pair:input.split(",")){
		String[] st = pair.split("=");
		if(st[1].contains("||")){
			String[] d = st[1].split(Pattern.quote("||"));
			for(String e:d){
				value.add(e);
			}
			map.put(st[0], value);
		}
		else{
			map.put(st[0], st[1]);
		}
		
	}
	System.out.print("map :"+map);
	return map;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in = "cvid=CVE-2018-8024,undected=false,cvss=high||medium||low";
		Map<String,Object> map = tokenmap(in);
		fun(map);
	}
	public static void fun(Map<String,Object> tmap){
		 String St = (String)tmap.get(Constants.cvid);
		 List<String> valu = (List<String>)tmap.get(Constants.cvss);
		
		if((null!=St) && St instanceof String){
			System.out.println("String:" +St);
		}
		if(valu instanceof List ){
			System.out.println("String:" +valu.size());
			for(int i=0;i<valu.size();i++){
				System.out.println("values:" +valu.get(i));
			}
		}
	}
}
