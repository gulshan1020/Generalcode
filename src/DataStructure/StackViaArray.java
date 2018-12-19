package DataStructure;

public class StackViaArray {
	 private int stacksize;
	 private int[] values;
	 private int top;
	 
	 public StackViaArray(int stackSize){
		 this.stacksize = stackSize;
		 this.values = new int[stackSize];
		 this.top = 0;
	 }

	 public void push(int item){
		 if(isFull(item)){
			 System.out.println("stack is full");
		 }
		 values[top] = item;
		 top++;
	 }
	 
	 public int pop(){
		 if(isEmpty()){
			 System.out.println("stack is empty");
		}
		 top--;
		 return values[top];
	 }
	 
	 
	 public boolean isEmpty(){
		 if(top==-1){
			 return true;
		 }
		 else{
			 return false;
		 }	 
	 }
	 public boolean isFull(int item){
		return values[top]==stacksize; 
	 }
	 
	 public int peek(){
		 if(top==-1){
			 System.out.println("stack is empty");
		 }
		return values[stacksize-1];
		 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackViaArray st  = new StackViaArray(5);
		st.push(1);
		st.push(4);
		st.push(5);
		st.push(3);
		st.push(9);
		//st.push(98);
		
		//System.out.println(st.pop());
		//System.out.println(st.pop());
		System.out.println(st.peek());
		

	}

}
