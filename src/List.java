import java.util.*;

public class List {

	public static void main(String[] args) {
		ArrayList<Integer> N1 = new ArrayList<>();
		int initialCapacity = 5;
		ArrayList<Integer> N2 = new ArrayList<>(initialCapacity);
		N1.add(10);
		N1.add(20);
		N1.add(30);
		N1.add(40);
		N1.add(50);
		N2.add(100);
		N2.add(200);
		N2.add(300);
		N1.addAll(N2);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();

		for (int i = 0; i < N1.size(); i++) {
			System.out.println(N1.get(i));
			if (a == N1.get(i)) {
				System.out.println("found=" + a);

			}
		}
	}
}
