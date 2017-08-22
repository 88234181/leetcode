class SinglyLinkedList<T>{
	Node<T> head;
	Node<T> tail;
	int size;
	
	public SinglyLinkedList(){
		this.head = null;
		this.size = 0;
	}
	
	public void addFirst(T element){
		Node<T> n = new Node<T>(element);
		if(isEmpty()){
			tail = n;
		}else{
			n.setNext(head);
		}
		head = n;
		size++;
	}
	
	public void addLast(T element){
		Node<T> n = new Node<T>(element);
		if(isEmpty()){
			head = n;
		}else{
			tail.setNext(n);
		}
		tail = n;
		size++;
	}
	
	public void deleteFirst(){
		if(head == null || tail == null){
			throw new Exception("cannot delete empty list");
		}
		head = head.getNext();
		if(head == null){
			tail == null;
		}
		size--;
	}
	
	public void deleteLast(){
		if(head == null || tail == null){
			throw new Exception("cannot delete empty list");
		}
		Node<T> tmp = head;
		for(int i = 0; i < size -1; i++){
			tmp = tmp.getNext();
		}
		tmp.next = null;
		tail = tmp;
		size--;
	}
	
	public void delete(T element){
		Node<T> tmp = head;
		Node<T> ref = head.getNext();
		
		if(head.compareTo(element)==0){
			deleteFirst();
		}else if{tail.compareTo(element)==0){
			deleteLast();
		}else{
			while(ref.hasNext()){
				if(ref.compareTo(element)==0){
					break;
				}
				tmp = tmp.getNext();
				ref = ref.getNext();
			}
			if(ref != null){
				tmp.setNext(ref.getNext());
			}else{
				System.out.println("cannot find element");
			}
			
		}
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
}

class Node<T> implements Comparable<T>{
	private T value;
	private Node<T> next;
	
	public Node<T>(T value){
		this.value = value;
	}
	
	public T getValue(){
		return value;
	}
	
	public void setValue(T value){
		this.value = value;
	}
	
	public Node<T> getNext(){
		return next;
	}
	
	public Node<T> setNext(T value){
		this.next = new Node<T>(value);
	}
	
	public boolean hasNext(){
		return getNext() == null;
	}
	
	@Override
	public int compareTo(T arg){
		if(arg == this.value){
			return 0;
		}else{
			return 1;
		}
	}
}