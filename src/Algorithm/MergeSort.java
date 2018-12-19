package Algorithm;

public class MergeSort {

	private int[] array;
	private int[] tempmergarr;
	private int length;
	public static void main(String[] args) {
		int[] inputarr = {3,1,2,9,5,7,4};
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(inputarr);
		for(int i:inputarr){
			System.out.println(i);
		}	
	}
	public void sort(int[] arr){
		this.array = arr;
		this.length = arr.length;
		this.tempmergarr = new int[length];
		mergeSort(0,length-1);
	}
	public void mergeSort(int lowerIndex, int higherIndex){
		if(lowerIndex < higherIndex){
			int middle = lowerIndex + (higherIndex - lowerIndex)/2;
			mergeSort(lowerIndex,middle);
			mergeSort(middle+1, higherIndex);
			merge(lowerIndex,middle,higherIndex);
		}
	}
	public void merge(int lowerIndex,int middle, int higherIndex){
		for(int i = lowerIndex; i<=higherIndex; i++){
			tempmergarr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;
		while(i<=middle && j<=higherIndex){
			if(tempmergarr[i]<=tempmergarr[j]){
				array[k] = tempmergarr[i];
				i++;
			}else{
				array[k] = tempmergarr[j];
				j++;
			}
			k++;
		}
		while(i<=middle){
			array[k] = tempmergarr[i];
			k++;
			i++;
			}	
		}
	}