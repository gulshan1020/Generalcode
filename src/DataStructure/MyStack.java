package DataStructure;

public class MyStack<T> {
	private static class StackNode<T>{
		private T data;
		private StackNode<T> next;
		public StackNode(T data){
			this.data = data;
		}
	}
		private StackNode<T> top;
		
		public T pop(){
			if(top==null){
				System.out.println("stack is empty");
			}
			T item = top.data;
			top=top.next;
			return item;
		}
		public void push(T item){
			StackNode<T> t = new StackNode<T>(item);
			t.next= top;
			top=t;
		}
		
		public T peek(){
			if(top==null){
				System.out.println("stack is empty");	
			}
			return top.data;
			
		}
		
		public boolean isEmpty(){
			return top==null;
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack<Integer> m = new MyStack<Integer>();
		m.push(6);
		m.push(8);
		m.push(7);
		//System.out.println(m.pop());
		//System.out.println(m.pop());
		//System.out.println(m.pop());
		System.out.println(m.peek());
		System.out.println(m.isEmpty());
		
	}
}
