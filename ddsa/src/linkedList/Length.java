package linkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Length {
	public static int length(Node<Integer> head){
		if(head==null) {
			return 0;
		}
		return lengthh(head, 1);
	}
	
	public static int lengthh(Node<Integer> head, int i) {
		while (head.next!=null) {
			i++;
			head = head.next;
		}
		return i;
	}
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static Node<Integer> takeInput() throws IOException {
        Node<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            Node<Integer> newNode = new Node<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }
    
    public static void print(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {
            
            Node<Integer> head = takeInput();    
            System.out.println(length(head));
            System.out.println();

            t -= 1;
        }
    }
}


