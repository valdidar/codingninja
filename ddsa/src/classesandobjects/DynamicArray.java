package classesandobjects;

public class DynamicArray {
	private int data[];
	private int nextElementIndex;
	public final static int MINSIZE=5;
	DynamicArray() {
		data=new int[MINSIZE]; 
		nextElementIndex=0;
	}
	public int size(){
		return nextElementIndex;
	}
	public boolean isEmpty() {
		return nextElementIndex==0;
	}
	public int get(int i) {
		if(i>=nextElementIndex) {
			return -1;
		}
		return data[i];
	}
	public void add(int n) {
		if(nextElementIndex==data.length) {
			doubleCap();
		}
		data[nextElementIndex]=n;
		nextElementIndex++;
		return;
	}
	private void doubleCap() {
		int temp[]=data;
		data=new int[2*nextElementIndex];
		for(int i=0;i<nextElementIndex;i++) {
			data[i]=temp[i];
		}
		
	}
	public void set(int i,int n) {
		if(i>=nextElementIndex) {
			return;
		}
		data[i]=n;
	}
	public int removeLast(	) {
		if(isEmpty())
			return -1;
		int temp=data[nextElementIndex-1];
		nextElementIndex--;
		return temp;
	}
}
