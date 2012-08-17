package scjp.genericlibrary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

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
		return prepareItemsForOutput(available.values());
	}

	public Collection<L> dueItems() {
		return prepareItemsForOutput(due.values());
	}

	private Collection<L> prepareItemsForOutput(Collection<L> items) {
		if (canCompare(items))
			items = new TreeSet<L>(items);		
		return Collections.unmodifiableCollection(items);
	}
	
	private boolean canCompare(Collection<L> items) {
		if (items == null || items.isEmpty())
			return false;
		L item = items.iterator().next();
		return item instanceof Comparable<?>;
	}

	public static Collection<Lendable<?>> allDueItems(Library<?, ?>... libraries) {
		Collection<Lendable<?>> dueitems = new ArrayList<Lendable<?>>();

		for (Library<?, ?> lib : libraries) {
			dueitems.addAll(lib.dueItems());
		}

		return dueitems;
	}
}
