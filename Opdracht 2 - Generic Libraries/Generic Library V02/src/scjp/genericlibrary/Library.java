package scjp.genericlibrary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Library {
	Map<String, Lendable> available = new HashMap<String, Lendable>();
	Map<String, Lendable> due = new HashMap<String, Lendable>();

	public Lendable lendItem(String libraryCode) {
		Lendable item = available.get(libraryCode);
		if (item != null) {
			available.remove(item.getLibraryCode());
			due.put(item.getLibraryCode(), item);
		}

		return item;
	}

	public void returnItem(Lendable item) {
		due.remove(item.getLibraryCode());
		available.put(item.getLibraryCode(), item);
	}

	public Collection<Lendable> availableItems() {
		return available.values();
	}

	public Collection<Lendable> dueItems() {
		return due.values();
	}
}
