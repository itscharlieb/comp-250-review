/**
 * @author Charlie Bloomfield
 * Feb 17, 2015
 */

public class EqualityExample {
	public static void main(String[] args){
		//primitive comparison
		int x = 1;
		int y = 1;		
		System.out.println(x == y);
		
		//Object comparison
		Integer i = new Integer(2);
		Integer j = new Integer(2);
		System.out.println(i == j);
		System.out.println(i.equals(j));
		
		//More object cmparison
		Integer k = new Integer(3);
		Integer l = k;
		
		System.out.println(l == k);
		System.out.println(l.equals(k));
	}
}
