package mypack3;

public class ABC {

	static int[] manipulateArray(int[] inputArray) {
        int temp;
         for(int counter= 0 ;counter<inputArray.length;counter++){
             for(int index = 0;index<inputArray.length-1-counter;index++){
                 if(inputArray[index] > inputArray[index+1]){
                     temp = inputArray[index];
                     inputArray[index] = inputArray[index+1];
                     inputArray[index+1] = temp;
                 }
             }

         }

        return inputArray;
    }
	public static void main(String[] args) {
		int[] input = {2,1,1,1,1,1,1,3,3,2,3,4,2};
		//System.out.println(input.length);
		int[] res = manipulateArray(input);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
		

	}

}
