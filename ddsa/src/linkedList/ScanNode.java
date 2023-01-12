package linkedList;
import java.util.Scanner;
public class ScanNode {
	public static Node<Integer> scanNode(){
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		// we took the first data
		Node<Integer> head=null, tail=null;
		// we created head and pointed it to null
		while(data!=-1) {
			Node<Integer> current= new Node<>(data);
			//we create a node corresponding to the data
			if(head==null) {
				//this only runs once, when in the start, we take the first input and head is null
				head=current;
				tail=current;
			}else {
				
//				Node<Integer> tail=head;
//				while(tail.next!=null) {
//					tail=tail.next;
//				}
				tail.next=current;
				tail=current; 
			}
			data=s.nextInt();			
		}
		
		return head;
	}
}
