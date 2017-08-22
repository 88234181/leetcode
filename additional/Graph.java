public class Graph{
	private HashMap<Integer, Node> nodeLookup = new HashMap<integer, Node>();
	
	private static class Node{
		private int id;
		LinkedList<Node> adjacent = new LinkedList();
		private Node(int id){
			this.id = id;
		}
	}
	
	public Node getNode(int id){
		return nodeLookup.get(id);
	}
	
	public void addAdjacent(int source, int destination){
		Node s = getNode(source);
		Node d = getNode(destination);
		s.addAdjacent.add(d);
	}
	
	public boolean hasPathDPS(int source, int destination){
		Node s = getNode(source);
		Node d = getNode(destination);
		HashSet<Integer> visited = new HashSet<Integer>();
		return hasPathDPS(s, d, visited);
	}
	
	private boolean hasPathDPS(Node source, Node destination, HashSet<Integer> set){
		if(visited.contains(source.id){
			return false;
		}
		visited.add(source.id);
		for(Node child : source.adjacent){
			if(hasPathDPS(child, destination, visited){
				return true;
			}
		}
		return false;
	}
	
	private boolean hasPathBFS(Node source, Node destination){
		LinkedList<Node> nextToVisit = new LinkedList();
		HashSet<Integer> visited = new HashMap<Integer>();
		nextToVisit.add(source);
		while(!nextToVisit.isEmpty()){
			Node node = nextToVisit.remove();
			if(node == destination){
				return true;
			}
			
			if(visited.contains(node.id)){
				continue;
			}
			visited.add(node.id);
			for(Node child : node.adjacent){
				nextToVisit.add(child);
			}
		}
	}
}