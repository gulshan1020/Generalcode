package ExceptionHandling;

 class TestCustomExceptiom {

	 static void validate(int age)throws MyException{
		if(age<18)
			throw new MyException("not valid");
		else
			System.out.println("valid");
	}

	public static void main(String[] args) {
		try{
			validate(10);
		}catch(Exception e){
			System.out.println("exception occured:" + e);
		}
		
	}

}
