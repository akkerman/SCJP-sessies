package scjp.genericlibrary;

import java.util.Collection;
import java.util.TreeSet;

public class SortedLibrary<C, L extends Lendable<C>> extends Library<C, L> {
	
	/**
	 * Constructs a new Library containing elements in the available and due
	 * collection are sorted according to the natural ordering of its items. All
	 * Lendables added to this library must implement the Comparable interface.
	 * Furthermore, all such Lendables must be mutually comparable:
	 * L1.compareTo(L2) must not throw a ClassCastException for any elements L1
	 * and L2 in the library.
	 */
	public SortedLibrary() {
		super();
	}

	@Override
	protected Collection<L> prepareItemsForOutput(Collection<L> items) {
		items = new TreeSet<L>(items);
		return super.prepareItemsForOutput(items);
	}
}
