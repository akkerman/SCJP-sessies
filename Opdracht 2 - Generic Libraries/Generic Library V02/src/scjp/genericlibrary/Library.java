package scjp.genericlibrary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Library<CODE> {
	Map<CODE, Lendable<CODE>> available = new HashMap<CODE, Lendable<CODE>>();
	Map<CODE, Lendable<CODE>> due = new HashMap<CODE, Lendable<CODE>>();

	public Lendable<CODE> lendItem(String libraryCode) {
		Lendable<CODE> item = available.get(libraryCode);
		if (item != null) {
			available.remove(item.getLibraryCode());
			due.put(item.getLibraryCode(), item);
		}

		return item;
	}

	public void returnItem(Lendable<CODE> item) {
		due.remove(item.getLibraryCode());
		available.put(item.getLibraryCode(), item);
	}

	public Collection<Lendable<CODE>> availableItems() {
		return available.values();
	}

	public Collection<Lendable<CODE>> dueItems() {
		return due.values();
	}
}
