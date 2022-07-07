import java.util.LinkedList;

public class Linkedlist {

	public static void main(String args[]) {
		LinkedList<Integer> N1 = new LinkedList<>();
		LinkedList<Integer> N2 = new LinkedList<>();
		N1.add(10);
		N1.add(20);
		N1.add(30);
		N1.add(40);
		N1.add(50);
		N2.add(100);
		N2.add(200);
		N2.add(300);
		N1.addAll(N2);
		N1.addFirst(888);
		N1.addLast(999);

		for (int i = 0; i < N1.size(); i++) {
			System.out.println(N1.get(i));

		}

	}
}