Opdracht 2 - Generic Libraries
==============================

## 1 Collections
Design and create an API for a Library which enables a client to lend and return `Lendable` items


    Interface Lendable
        String getLibraryCode()

	Library
		Lendable lendItem(String libraryCode);
		returnItem(Lendable item); 
		Collection availableItems();
		Collection dueItems();
 
_Requirements_

1. no duplicates
2. when you lend an item it is subsequently __not__ available and instantly due  
3. when returning an item it is subsequently available and not due  
4. when returning an item not due and not available you may interpret it as adding to the library  
5. the requirements hardly need any 'if' statement => __choose your collections wisely__


Suppose you have a book with library code "42"
The following code illustrates how a client would use your Library:

    Book implements Lendable {
      // implementation omitted 
    }
    
    Library library = new Library();
    library.returnItem(new Book("42")); // empty library, so item is added
    Lendable lendable = library.lendItem("42");
    Book b = (Book)lendable;

## 2 Generic Interface
Add a generic parameter to the `Lendable` interface, specifying the type of the library code.

Create at least two implementations of `Lendable` with at least one additional method.

 * Override `toString`,  
 * Optionally override `equals` and `hashcode`.  
 * Make sure your library class still compiles with this interface, you _will_ have to modify the generics on your collections
 
For example: 

    Book
        String getLibraryCode();
        String getTitle();
        String getAuthor();
	
    CompactDisc
        Integer getLibraryCode();
        String getName();
        String getArtist();


## review
If you're particularly adventurous, continue with part 3.  
Otherwise send your intermediate solution for a review.
 		
## 3 Generic Collection
Turn your `Library` into a generic template.  
A client of your code should be able to create a parameterized version of Library enabling them to lend `Book` and `CompactDisc` without down casting them.

	// omitted: declaration , instantiation and filling of two distinct libraries
    Book b = bookLibrary.lendItem("42");       // input String, output Book
    CompactDisc c = cdLibrary.lendItem(42);    // input Integer, output CompactDisc
    CompactDisc cd = cdLibrary.lendItem("42"); // compilation error


## 4 Generic Generic
Create one factory method in your Library class accepting one or more specific instantiations of libraries returning a list of items due for all libraries.  

i.e:
 
1. a client should be able to offer one specific library of `Book`  
2. a client should be able to offer several specific libraries of `CompactDisc`  
3. a Client should be able to mix the libraries

Intended use: loop over the result, print each item. 

## 5 Optional stuff
### collector
A client of your library could try modifying one of your collections. Effectively stealing them.

    library.dueItems().clear();
    
or    

    for (Iterator iter = library.availableItems().iterator(); iter.hasNext(); )       
       iter.remove();
         
How would you make sure the client will not get away with it?

### sort yourself out
Suppose a client wants items in the library sorted and have some control over the ordering by implementing the `Comparable` interface.   
How would you support this requirement?

P.S: to appreciate the difficulty of this requirement you may __not__ assume each client will actually implement this `Comparable` interface.
Test by implementing it only on `CompactDisc` and __not__ on `Book`

 

