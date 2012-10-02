package scjp.h7;



import java.util.Arrays;  
import java.util.Comparator;  
  
public class VLA2 implements Comparator<VLA2> {  
  
    // This class implements Comparator for itself. This  
    // means that anywhere we must pass a parameter of  
    // Comparator<VLA2>, we can pass an instance of the class.  
  
    int dishSize;  
  
    public static void main(String[] args) {  
  
    // create three VLA2 objects with unique dish sizes.  
    // store them in an array named va.  
    VLA2[] va = { new VLA2(40), new VLA2(200), new VLA2(60) };  
  
    // sort the array using the instance located at array index zero for the comparator  
    // note we could use any of the other instances and get the same result  
    Arrays.sort(va, va[0]);  
  
    // note the compare method sorts elements in reverse order  
    // so now the array looks like:  
    // {vla2(200), vla2(60), vla2(40)}  
  
    // now we are performing a binary search in the array va  
    // we ask for a VLA2 object whose dish size is 40  
        // the new VLA2 object is a dummy we pass to the search  
        // that holds the attributes we wish to find  
    // finally, we pass the comparator we wish the binary search to use  
    int index = Arrays.binarySearch(va, new VLA2(40), va[0]);  
  
    // after the sort, the desired element is at index 2  
    System.out.print(index + " ");  
  
    // Now we search again for an element that is not in the array.  
    // This time, the returned value will indicate the insertion point  
    // -- the index where the element WOULD be if it HAD been found  
    // according to this formula: (-(insertion point) - 1)  
  
    // If we get a positive value from binarySearch, then we know  
    // the element was found in the array. Negative value tells us  
    // it was NOT found.  
  
    index = Arrays.binarySearch(va, new VLA2(80), va[0]);  
  
    // there is no VLA2 object in the array with dish size of 80  
    // the element we wanted to find would be inserted at index 1  
    // so the value of "index" is -2  
    System.out.print(index);  
    }  
  
    public int compare(VLA2 a, VLA2 b) {  
  
        // Sorting in reverse order!  
        return b.dishSize - a.dishSize;  
    }  
  
    VLA2(int d) {  
          dishSize = d;  
    }  
} 