
/**
 * @author Charlie Bloomfield
 * Feb 17, 2015
 */

public class BinarySearch {
	public static int binarySearch(int[] a, int target) throws NumberNotFoundException{
		try{
			return binarySearch(a, target, 0, a.length - 1);
		} catch (NumberNotFoundException e){
			throw e;
		}
	}
	
	//method overloading
	private static int binarySearch(int[] a, int target, int start, int end) throws NumberNotFoundException{
	    int middle = (start + end) / 2;
	    if(end < start) {
	        throw new NumberNotFoundException();
	    } 

	    if(target == a[middle]) {
	        return middle; //return index of 
	    } else if(target < a[middle]) {
	    	//look in left half of array
	        return binarySearch(a, target, start, middle - 1);
	    } else {
	    	//look in right half of array
	        return binarySearch(a, target, middle + 1, end);
	    }
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,3,4,5,6,6,7};
		
		try{
			System.out.println(binarySearch(a, 6));
		} catch (NumberNotFoundException e) {
			System.out.println("Number not found!");
		}
	}
}
class NumberNotFoundException extends Exception{}

