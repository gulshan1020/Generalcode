package Algorithm;

public class MyQuickSort {
	private int[] array;
	private int length;
	
	public void sort(int[] arr){
		if(arr == null || arr.length == 0){
			return;
		}
		this.array = arr;
		length = arr.length;
		quicksort(0,length-1);
	}
	
	private void quicksort(int lowerIndex,int higherIndex){
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
		while(i<=j){
			while(array[i]<pivot){
				i++;
			}
			while(array[j]>pivot){
				j--;
			}
			if(i<=j){
				exchangeNumber(i,j);
				i++;
				j--;
			}
		}
		//call quicksort ewcursively
		if(lowerIndex<j)
			quicksort(lowerIndex,j);
		if(i<higherIndex)
			quicksort(i,higherIndex);
	}
	
	private void exchangeNumber(int i,int j){
		int temp =array[i];
		array[i] = array[j];
		array[j] = temp;
		
		
	}
	
	public static void main(String[] arr){
		MyQuickSort sorter = new MyQuickSort();
        int[] input = {5,4,3,2,9};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }

	}
	
	
}
