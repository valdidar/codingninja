package generics;

public class Pair<S,T> {
	final S x;
	final T y;
	
	Pair(S x, T y){
		this.x=x;
		this.y=y;
	}
	Pair(S x){
		this.x=x;
		this.y=null;
	}
	public S getx() {
		return x;
	}
	public T gety() {
		return y;
	}
	public void print() {
		System.out.println(x+" "+y);
	}
	
}