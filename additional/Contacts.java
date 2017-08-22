/**
We're going to make our own Contacts application! The application must perform two types of operations:

add name, where name is a string denoting a contact name. This must store name as a new contact in the application.
find partial, where partial is a string denoting a partial name to search the application for. It must count the number of contacts starting with partial and print the count on a new line.
Given n sequential add and find operations, perform each operation in order.

Input Format

The first line contains a single integer, n, denoting the number of operations to perform. 
Each line i of the n subsequent lines contains an operation in one of the two forms defined above.

Constraints
1<=n<=10^5
1<=|name|<=21
1<=|name|<=21
It is guaranteed that name and partial contain lowercase English letters only.
Output Format

For each find partial operation, print the number of contact names starting with partial on a new line.

Sample Input
4
add hack
add hackerrank
find hac
find hak

Sample Output
2
0
**/

public class Contacts{
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		Node n = new Node();
		
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
			
			if(op == "add"){
				for(char c : contact.toCharArray()){
					int index = c-'a';
					if(n.children[index] == null){
						n.chidlren[index] = new Node();
					}
					n.children[c-'a'].value++;
					n = n.children[c-'a'];
				}
			}else if(op == "find"){
				for(int i = 0; i < String.length(); i++){
					n = n.children[c-'a'];
					if(n == null){
						break;
					}
				}
				System.out.println(n != null ? n.count : 0);
			}
        }
    }
}

public static class Node{
	Node[] children;
	int count;
	
	public Node(){
		this.count = 0;
		this.chidlren = new Node[26];
		Arrays.fill(children, null);
	}
}