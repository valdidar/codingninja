package linkedList;

public class LinkedListUse {
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1=new Node<>(1);
		Node<Integer> n2=new Node<>(2);
		Node<Integer> n3=new Node<>(4);
		Node<Integer> n4=new Node<>(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		return n1;
	}
	public static void printLinkedList(Node<Integer> n) {
		if(n.next==null) {
			System.out.println(n.data);
			return;
		}
		System.out.print(n.data+" ");
		printLinkedList(n.next);
	}
//this is how you print a linked list in a loop
//	public static void print(Node<Integer> head){
//	    Node<Integer> temp = head;
//
//	    while(temp != null){
//	        System.out.print(temp.data +" ");
//	        temp = temp.next;
//	    }
//	    System.out.println();
//	}
	public static void main(String[] args) {
//		Node<Integer> n1=new Node<>(10);
//		System.out.println(n1.data+" "+n1.next);
		
		Node<Integer> head= createLinkedList();
		printLinkedList(head);
	}

}
