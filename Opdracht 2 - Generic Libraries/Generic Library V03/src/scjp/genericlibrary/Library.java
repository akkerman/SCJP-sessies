package scjp.genericlibrary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Library<C, L extends Lendable<C>> {
	Map<C, L> available = new HashMap<C, L>();
	Map<C, L> due = new HashMap<C, L>();

	public L lendItem(C libraryCode) {
		L item = available.get(libraryCode);
		if (item != null) {
			available.remove(item.getLibraryCode());
			due.put(item.getLibraryCode(), item);
		}

		return item;
	}

	public void returnItem(L item) {
		due.remove(item.getLibraryCode());
		available.put(item.getLibraryCode(), item);
	}

	public Collection<L> availableItems() {
		return available.values();
	}

	public Collection<L> dueItems() {
		return due.values();
	}
}
