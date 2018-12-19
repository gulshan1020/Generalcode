package DataStructure;

import java.util.Stack;

public class StackMinElement extends Stack<Integer> {
	Stack<Integer> s2;
	public StackMinElement(){
		s2 = new Stack<Integer>();
	}
	
	public void push(int value){
		if(value<=min()){
			s2.push(value);
		}
		super.push(value);
	}
	
	public Integer pop(){
		int value = super.pop();
		if(value==min()){
			s2.pop();
		}
		return value;
	}
	
	public int min(){
		if(s2.isEmpty()){
			return Integer.MAX_VALUE;
		}
		else{
			return s2.peek();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackMinElement se = new StackMinElement();
		se.push(3);
		se.push(4);
		se.push(6);
		se.push(7);
		System.out.println(se.min());

	}

}
