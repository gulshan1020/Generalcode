package Generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(5);
		ints.add(10);
		addInteger(ints);
		double add = sum(ints);
		System.out.println(add);
		
		print(ints);
		
		List<String> st = new ArrayList<>();
		st.add("aa");
		st.add("ww");
		print(st);
	}
	
	public static double sum(List<? extends Number> list){  // upper bounded wild card
		double sum = 0;
		for(Number n : list){
			sum +=  n.doubleValue();
		}
		return sum;
	}
	
	public static void print(List<?> list){
		for(Object o : list){
			System.out.println(o);
		}
	}
	
	public static void addInteger(List<? super Integer> list) { // lower bounded wild  card
		
		list.add(new Integer(40));
		
	}
}
