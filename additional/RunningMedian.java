public class RunningMedian{
	PriorityQueue<Integer> minHeap;
	PriorityQueue<Integer> maxHeap;
	
	public RunningMedian(int[] arr){
		this.minHeap = new PriorityQueue<Integer>();
		this.maxHeap = new PriorityQueue<Integer>(11, new MedianComparator());
		
		for(int i : arr){
			if(maxHeap.size() == 0 || i < maxHeap.peek()){
				maxHeap.add(i);
			}else{
				minHeap.add(a);
			}
			
			if(maxHeap.size() - minHeap.size() ==2){
				minHeap.add(maxHeap.poll());
			}
			if(minHeap.size() - maxHeap.size() ==2){
				maxHeap.add(minHeap.poll());
			}
			double d = 0;
			if(maxHeap.size() > minHeap.size()){
				d = (double) maxHeap.peek();
			}else if(maxHeap.size() < minHeap.size()){
				d = (double) minHeap.size();
			}else{
				d = (double) (minHeap.peek()+maxHeap.peek())/2;
			}
			System.out.println(d);
		}
	}
	
	public double findMedian(int[] arr){
		
	}
	
	private static class MedianComparator implements Comparator<Integer>{
		@Override
		public int compare(Integer o1, Integer o2){
			return o2-o1;
		}
	}
}