package linkedList;

public class MergeSort {
	class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
       if (head1 == null) {
           return head2;
       }

       if (head2 == null) {
           return head1;
       }

       LinkedListNode<Integer> newHead = null, node1 = head1, node2 = head2, newNode = null;
       int data1 = node1.data, data2 = node2.data;
       if (data1 < data2) {
           newHead = node1;
           node1 = node1.next;
       } else {
           newHead = node2;
           node2 = node2.next;
       }
       newNode = newHead;
       while (node1 != null && node2 != null) {
           data1 = node1.data;
           data2 = node2.data;
           if (data1 < data2) {
               newNode.next = node1;
               newNode = newNode.next;
               node1 = node1.next;
           } else {
               newNode.next = node2;
               newNode = newNode.next;
               node2 = node2.next;
           }
       }

       while (node1 != null) {
           newNode.next = node1;
           newNode = newNode.next;
           node1 = node1.next;
       }
       while (node2 != null) {
           newNode.next = node2;
           newNode = newNode.next;
           node2 = node2.next;
       }
       return newHead;
   }
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
       if(head==null||head.next==null){
           return head;
       }
       LinkedListNode<Integer> slow=head;
       LinkedListNode<Integer> fast=head.next;

       while(fast!=null){
           fast=fast.next;
           if(fast!=null){
               slow=slow.next;
               fast=fast.next;
           }else{
               break;
           }
       }
       return slow;
   }
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		if(head==null||head.next==null){
           return head;
       }
       LinkedListNode<Integer> temp=midPoint(head);
       LinkedListNode<Integer> head2=temp.next;
       temp.next=null;
       head=mergeSort(head);
       head2=mergeSort(head2);
       head=mergeTwoSortedLinkedLists(head,head2);
       return head;
	}
}
