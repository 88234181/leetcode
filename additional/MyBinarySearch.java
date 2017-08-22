public class MyBinarySearch{
	int[] arr;
	int length;
	public MyBinarySearch(int[] arr){
		this.arr = arr;
		this.length = arr.length;
	} 
	
	public int search(int i){
		search(arr, 0, length);
	}
	
	public int search(int[] arr, int low, int high, int i){
		if(arr ==null || arr.length == 0){
			return -1;
		}
		
		if(low > high){
			return -1;
		}
		
		int mid = low + (high - low)/2;
		
		if(i < arr[mid]){
			return search(arr, low, mid, i);
		}else if(i > arr[mid]){
			return search(arr, mid, high, i)
		}		
		return mid;
	}
}