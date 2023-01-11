package generics;

public class PairUse {

	public static void main(String[] args) {
		Pair<Pair<Integer,Integer>,String> ps = new Pair<>(new Pair<>(10,20),"abs");
		System.out.println(ps.getx().getx()+" "+ps.getx().gety()+" "+ps.gety());
		
	}

}
