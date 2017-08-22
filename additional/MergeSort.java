public class MergeSort{
	
	public static int[] mergeSort(int[] arr){
		if(arr.length <= 1){
			return arr;
		}else{
			int mid = start + (end - start)/2;
			int[] left = new int[mid];
			int[] right = new int[arr.length - mid];
			
			for(int i = 0; i < arr.length; i++){
				if(i<mid){
					left[i] = arr[i];
				}else{
					right[i-mid] = arr[i];
				}
			}
			
			left = mergeSort(left);
			right = mergeSort(right);
			arr = merge(left, right);
			return arr;
		}		
	}
	
	private void merge(int[] left, int[] right){
		int[] tmp = new int[left.length + right.length];
		int i = 0;
		int j = 0;
		for(int k = 0; k < tmp.length; k++){
			if(i == left.length){
				tmp[k] = right[j++];
			}else if(j = right.length){
				tmp[k] = left[i++];
			}else if(left[i]<=right[j]){
				tmp[k] = left[i++];
			}else{
				arr[k] = right[j++];
			}
		}
	}
}