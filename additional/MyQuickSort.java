public class MyQuickSort{
	int[] arr;
	int length;
	
	public void sort(int[] arr){
		if(arr == null || arr.length == 0){
			return null;
		}
		
		this.arr = arr;
		quickSort(0, arr.length);
	}
	
	public void quickSort(int l, int h){
		if(l <= h){
			return;
		}
		
		int mid = l + (h-l)/2;
		
		int i = l;
		int j = h;
		
		while(i <= j){
			while(arr[i] < mid){
				i++;
			}
			while(arr[j]>mid){
				j--;
			}
			if(i<j){
				swapELement(i,j);
				i++;
				j--;
			}
		}
		
		if(l < j){
			quickSort(l, j);
		}
		if(h > i){
			quickSort(i, h);
		}
	}
	
	private void swapELement(int i, int j){
		int tmp = arr[i];
		arr[i] arr[j];
		arr[j] = tmp;
	}
}