Opdracht 2 - Generic Libraries
==============================

part 1 - Collections
--------------------
Design and create an API for a Library which enables a client to lend and return Lendable items


    Class Lendable
        getLibraryCode()

	Library
		lendItem(libraryCode);
		returnItem(item); 
		Collection availableItems();
		Collection dueItems();
 

Assume the following for simplicity (we're not writing validators)  
	* no duplicates (chose your collections wisely)
	* when you lend an item it is subsequently NOT available and instantly due
	* when returning an item it is subsequently available and not due
	* when returning an item not due and not available you may interpret it as adding to the library


Create at least two implementations of Lendable with at least one additional method
Override toString,
Optionally override equals and hashcode.

	Book
		String getTitle();
		String getAuthor();
	
	CompactDisc
		String getName();
		String getArtist();


---

Create one method accepting one or more specific instantiations of libraries returning a list of items due for all libraries. 

i.e. 
a client should be able to offer one specific library of books
a client should be able to offer several specific libraries of CompactDisc
a Client should be able to mix the libraries
---


