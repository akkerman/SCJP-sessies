
Opdracht 2 - Generic Libraries
==============================

part 1 - Collections
--------------------
Design and create an API for a Library which enables a client to lend and return Lendable items


    Interface Lendable
        String getLibraryCode()

	Library
		Lendable lendItem(String libraryCode);
		returnItem(Lendable item); 
		Collection availableItems();
		Collection dueItems();
 
_Requirements_

1. no duplicates
2. when you lend an item it is subsequently NOT available and instantly due  
3. when returning an item it is subsequently available and not due  
4. when returning an item not due and not available you may interpret it as adding to the library  
5. none of the requirements need any 'if' statement => __choose your collections wisely__


Suppose you have a book with library code "42"
The following code illustrates how a client would use your Library:

    Book implements Lendable {
      // implementation omitted 
    }
    
    Library library = new Library();
    library.returnItem(new Book("42")); // empty library, so item is added
    Book b = (Book)library.lendItem("42");

part 2 - Generic Interface
--------------------------
Add a generic parameter specifying the type of the library code to the `Lendable` interface.

Create at least two implementations of `Lendable` with at least one additional method  
* Override `toString`,  
* Optionally `override` equals and `hashcode`.  
* Make sure your library class still compiles with this interface, you WILL have to modify the generics on your collections

	Book
		String getLibraryCode();
		String getTitle();
		String getAuthor();
		
	
	CompactDisc
		Integer getLibraryCode();
		String getName();
		String getArtist();


review
------
If you're particularly adventurous, continue with part 4.  
Otherwise send your intermediate solution for a review.
 		
part 3 - Generic Collection
---------------------------
Turn your `Library` into a generic template.  
A client of your code should be able to create a parameterized version of Library enabling them to lend `Book`s and `CompactDisc`s without down casting them.

    Book b = 


part 4 - Generic Generic
------------------------
Create one factory method in your Library class accepting one or more specific instantiations of libraries returning a list of items due for all libraries.  

i.e:
 
1. a client should be able to offer one specific library of `Book`s  
2. a client should be able to offer several specific libraries of `CompactDisc`s  
3. a Client should be able to mix the libraries

Intended use: loop over the result, print each item. 
