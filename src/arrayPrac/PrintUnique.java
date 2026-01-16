package arrayPrac;
import java.util.HashMap;
import java.util.Map;

public class PrintUnique {

	public static void main(String[] args) {
		
		int a[] = { 4,5,5,6,6,6,3,8,3,1,2,4 };
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int n : a) {
			hm.put(n, hm.getOrDefault(n, 0)+1);
		}
		
		System.out.println("Print non rep nums -");
		for (int n : hm.keySet()) {
			if (hm.get(n) == 1)
				System.out.println(n);
		}
		System.out.println("");
		
		for (Map.Entry<Integer, Integer> mp : hm.entrySet()) {
			System.out.println(mp.getKey() + " | " + "Count - " + mp.getValue());
		}
		System.out.println("");
		
		hm.forEach((key, value) -> System.out.println(key + " -> " + value) );
		System.out.println("");
		
		hm.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " | " + "Count - " + e.getValue()));
		
		System.out.println("");
		
		hm.entrySet().stream().filter(e -> e.getValue()==1).forEach(e -> System.out.println(e.getKey() + " | " + "Count - " + e.getValue()));
		
	}

}
