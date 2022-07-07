import java.util.HashSet;
public class Hashset {

	public static void main(String[] args) {
		int initialCapacity=6;
		float loadFactor=0.5f;
		HashSet<Integer> myHashset = new HashSet<>(initialCapacity=6, loadFactor=0.5f);
		myHashset.add(5);
		myHashset.add(7);
		myHashset.add(10);
		myHashset.add(15);
		System.out.println(myHashset);
		
	}

}
