package scjp.h7;
import java.util.Hashtable;
import java.util.Map;

public class Snippet {

	public static void main(String[] args) {
		Map<String, String> h = new Hashtable<String, String>();
		String[] k = { "1", "2", "3", null };
		String[] v = { "a", "b", null, "d" };
		for (int i = 0; i < 4; i++) {
			h.put(k[i], v[i]);
			System.out.print(h.get(k[i]) + " ");
		}
		System.out.print(h.size() + " " + h.values() + "\n");
	}

}