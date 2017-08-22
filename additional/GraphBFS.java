public static class GraphBFS{
	int[][] graph;
	int size;
	
	public GraphBFS(int size){
		this.graph = new int[size][size];
		this.size = size;
	}
	
	public addEdge(int a, int b){
		graph[a][b] = 1;
		graph[b][a] = 1;
	}
	
	public static int findDistance(int source, int destination){
		int[] distances = new int[size];
		Arrays.fill(distances, -1);
		Queue<Integer> q = new Queue<Integer>();
		q.offer(source);
		distance[source] = 0;
		while(!q.isEmpty()){
			int tmp = q.poll();
			for(int i = 0; i < size; i++){
				if(distance[i] >= 0 || graph[tmp][i] == 0){
					continue;
				}
				distances[i] = distances[tmp] + 6;
				q.offer(i);
			}
		}
		return distances[destination];
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int queries = scanner.nextInt();
        
        for (int t = 0; t < queries; t++) {
            
            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();
            
            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                
                // add each edge to the graph
                graph.addEdge(u, v);
            }
            
            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);
 
            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();            
        }
        
        scanner.close();
    }
}