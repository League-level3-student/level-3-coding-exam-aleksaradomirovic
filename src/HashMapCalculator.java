import java.util.HashMap;

public class HashMapCalculator {
	public int commonKeyValuePairs(HashMap<String,String> h1, HashMap<String, String> h2) {
		int r = 0;
		for(String s : h1.keySet()) {
			if(h2.containsKey(s)) {
				if(h1.get(s).equals(h2.get(s))) {
					r++;
				}
			}
		}
		
		return r;
	}
}
