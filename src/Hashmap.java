import java.util.HashMap;
public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> empIds =new HashMap<>();
		empIds.put("Vijay",1234);
		empIds.put("Raj",5678);
		empIds.put("Ram",3456);
		System.out.println( empIds);
		System.out.println(empIds.get("Ram"));
		
	}

}
